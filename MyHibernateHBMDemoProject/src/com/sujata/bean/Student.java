package com.sujata.bean;

public class Student {

	private int rollNo;
	private String name;
	private String standard;
	
	public Student(){
		
	}

	public Student(int rollNo, String name, String standard) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.standard = standard;
	}
	
	

	public Student(String name, String standard) {
		super();
		this.name = name;
		this.standard = standard;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStandard() {
		return standard;
	}

	public void setStandard(String standard) {
		this.standard = standard;
	}
	
}
