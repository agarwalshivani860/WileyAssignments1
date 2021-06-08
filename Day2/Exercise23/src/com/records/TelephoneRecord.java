package com.records;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import com.telephone.TelephoneDirectory;

public class TelephoneRecord {
	ArrayList<TelephoneDirectory> directory=new ArrayList<TelephoneDirectory>();

	private static int index;
	
	public void TelephoneRecord() {
		
	}
	
	public void addRecord(TelephoneDirectory record) {
		directory.add(record);
	}

	public ArrayList<TelephoneDirectory> getDirectory() {
		return directory;
	}

	public void setDirectory(ArrayList<TelephoneDirectory> directory) {
		this.directory = directory;
	}
   public void displayRecord()
   {
	   System.out.println(directory);
   }
  	
}
