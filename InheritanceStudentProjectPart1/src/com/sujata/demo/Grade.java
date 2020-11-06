package com.sujata.demo;

public class Grade extends Marks {
	private double percentage;
	private String grade;
	
	public double getPercentage() {
		percentage=(getMarks1()+getMarks2()+getMarks3())/3;
		return percentage;
	}
	
	public String getGrade() {
		if(getPercentage()>75)
			grade="A Grade";
		else
			grade="B Grade";
		return grade;
	}
	
	

}
