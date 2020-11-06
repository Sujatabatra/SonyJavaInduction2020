package com.sujata.demo;

public class Student {

	private int rollNo;
	private String studName;
	
	public void inputStudent(int rollNo,String studName){
		this.rollNo=rollNo;
		this.studName=studName;
	}

	public int getRollNo() {
		return rollNo;
	}

	public String getStudName() {
		return studName;
	}
	
	
}
