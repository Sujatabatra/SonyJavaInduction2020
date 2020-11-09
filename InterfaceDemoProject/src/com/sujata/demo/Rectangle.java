package com.sujata.demo;

class AcceptValues{
	private int length,breadth;

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	
}

//In a single class , we can implement multiple contracts i.e an interface
public class Rectangle extends AcceptValues implements Shape,NonRoundedShape {

	@Override
	public void area() {
		System.out.println("Hi I am rectangle area");

	}

	@Override
	public void perimeter() {
		// TODO Auto-generated method stub
		
	}

}
