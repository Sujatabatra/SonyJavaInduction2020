package com.sujata.training;

public class DemoClass {

	//Instance Variables : they get the memory area at the class instantiation time
	private int number;
	private String name;
	private boolean status;
	private float someValue;
	private char ch;
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public float getSomeValue() {
		return someValue;
	}
	public void setSomeValue(float someValue) {
		this.someValue = someValue;
	}
	public char getCh() {
		return ch;
	}
	public void setCh(char ch) {
		this.ch = ch;
	}
	
	public void sumMethod(){
		//local variable : local variables get memory area at compile time  (stack) 
		//local variable don't get any default initial value
		//int a; 
		int a=10;
		System.out.println("a : "+a);
	}
}
