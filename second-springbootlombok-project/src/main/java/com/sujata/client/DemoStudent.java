package com.sujata.client;

import org.springframework.stereotype.Component;

@Component
public class DemoStudent {

	public Student getStudent(int r,String na){
		Student st=new Student();
		
		st.setRollNo(r);
		st.setName(na);
		return st;
	}
}
