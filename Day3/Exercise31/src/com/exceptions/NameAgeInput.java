package com.exceptions;

import java.util.ArrayList;
import java.util.List;

public class NameAgeInput {
	private int age;
	private String name;
	List<String> nameList = new ArrayList<String>();

	int counter = 0;

	public void setName(String name) {

		if (nameList.size() > 0) {
			if (nameList.contains(name)) {
				throw new NameExistsUnCheckedException("Employee with same name exists");
			} else {
				nameList.add(name);
				counter++;
			}
		} else {
			nameList.add(name);
			counter++;
		}
	}

	public String getName() {
		return nameList.get(counter - 1);
	}

	public void setAge(int age) {
		if (age < 18) {
			throw new AgeUncheckedException("Age cannot be less then 18 and greater than 60");
		} else if (age > 60) {
			throw new AgeUncheckedException("Age cannot be less then 18 and greater than 60");
		}
		this.age = age;
		
	}

	public int getAge() {
		return age;
	}

}
