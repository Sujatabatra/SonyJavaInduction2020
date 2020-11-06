package com.sujata.training;

import com.sujata.demo.Student;

public class ClientClass {

	public static void main(String[] args) {
		Student student=new Student();
		student.inputStudent(101, "AAAA");
		System.out.println("Roll No : "+student.getRollNo());
		System.out.println("Student Name : "+student.getStudName());
		

		Marks marks=new Marks();
		marks.inputStudentDetailsWithMarks(102, "BBBBB", 78, 89, 76);
		marks.displayStudentDetailsWithMarks();
	}

}
