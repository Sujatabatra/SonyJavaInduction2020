package com.sujata.demo;

import com.sujata.demo.Student;

public class Marks extends Student {
	private int marks1,marks2,marks3;
	
	public void inputStudentDetailsWithMarks(int rollNo,String studName,int marks1,int marks2,int marks3){
		inputStudent(rollNo, studName);
		this.marks1=marks1;
		this.marks2=marks2;
		this.marks3=marks3;
	}

	public int getMarks1() {
		return marks1;
	}

	public int getMarks2() {
		return marks2;
	}

	public int getMarks3() {
		return marks3;
	}
	
	public void displayStudentDetailsWithMarks(){
		System.out.println("Roll No : "+getRollNo());
		System.out.println("Student Name : "+getStudName());
		System.out.println("Marks 1 : "+marks1);
		System.out.println("Marks 2 : "+marks2);
		System.out.println("Marks 3 : "+marks3);
	}

}
