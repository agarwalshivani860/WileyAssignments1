package com.telephone;

public class TelephoneDirectory {
 int id;
 String name;
 int telephoneno;
 public TelephoneDirectory()
 {
	 
 }
public TelephoneDirectory(int id, String name, int telephoneno) {
	super();
	this.id = id;
	this.name = name;
	this.telephoneno = telephoneno;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getTelephoneno() {
	return telephoneno;
}
public void setTelephoneno(int telephoneno) {
	this.telephoneno = telephoneno;
}
@Override
public String toString() {
	return "[id=" + id + ", name=" + name + ", telephoneno=" + telephoneno + "]";
}

 
}
