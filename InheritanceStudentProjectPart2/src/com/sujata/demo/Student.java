package com.sujata.demo;

public class Student {

	private int rollNo;
	private String studName;
	
//	public Student(){
//		//default call to base class default consturctor
//		System.out.println("Hi I am Student Constructor");
//	}
	
	public Student(int rollNo, String studName) {
		//default call to base class default consturctor
		this.rollNo = rollNo;
		this.studName = studName;
	}

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
