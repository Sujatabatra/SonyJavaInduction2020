package com.sujata.demo;

import com.sujata.demo.Student;

/*
 * if default constructor is not there in base class, we need to give explicit call to the available and visible constructor of base class
 * we can give explicit call to base class constructor with super() keyword
 */
public class Marks extends Student {
	private int marks1,marks2,marks3;
	
	public Marks(){
//		System.out.println("hi"); //error
		super(0,null); //super must be the fist statement in derived constuctor
		//default call to base class default consturctor
		System.out.println("Hi I am Marks constructor!!");
	}
	
	
	public Marks(int marks1, int marks2, int marks3) {
		//default call to base class default consturctor
		super(100,"XYZ");
		this.marks1 = marks1;
		this.marks2 = marks2;
		this.marks3 = marks3;
	}
	
	


	public Marks(int rollNo, String studName, int marks1, int marks2, int marks3) {
		super(rollNo, studName);
		this.marks1 = marks1;
		this.marks2 = marks2;
		this.marks3 = marks3;
	}


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
