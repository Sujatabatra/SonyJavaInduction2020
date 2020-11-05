package com.sujata.demo;

/*function overloading (Polymorphism)
 * Many method with same name and all functions with be differentiated from each other
 * w.r.t method signature
 * Signature : Number and type of arguments and their sequence
 */
public class Shape {

	public int area(int length,int breadth){
		int area=length*breadth;
		return area;
	}
	
	public double area(double radius){
		return 3.14*radius*radius;
	}
	
	public int area(int side){
		return side*side;
	}
}
