package com.sujata.client;

import com.sujata.demo.Grade;
import com.sujata.demo.Marks;
import com.sujata.demo.Student;

public class ClientClass {

	public static void main(String[] args) {
		Student student=new Student(101, "AAAA");
//		student.inputStudent(101, "AAAA");
		System.out.println("Roll No : "+student.getRollNo());
		System.out.println("Student Name : "+student.getStudName());
		
		System.out.println("================");
		
		Marks marks=new Marks(102, "BBBBB", 78, 89, 76);
//		marks.inputStudentDetailsWithMarks(102, "BBBBB", 78, 89, 76);
		marks.displayStudentDetailsWithMarks();
		
		System.out.println("======================");
		
		Grade grade=new Grade(0.0,"X Grade");
		grade.inputStudentDetailsWithMarks(103, "CCCCC", 78, 92, 89);
		grade.displayStudentDetailsWithMarks();
		System.out.println("Grade : "+grade.getGrade());
	
	}
	

}
