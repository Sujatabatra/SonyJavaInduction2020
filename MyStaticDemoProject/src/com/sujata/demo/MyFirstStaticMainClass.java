package com.sujata.demo;


class MyFirstStaticDemo{
	//Instance Variable
	int x;
	//Class Variable
	static int y;
	
	
	
}

class Derive extends MyFirstStaticDemo{
	
}

public class MyFirstStaticMainClass {

	public static void main(String[] args) {
		
		MyFirstStaticDemo ob1=new MyFirstStaticDemo();
		MyFirstStaticDemo ob2=new MyFirstStaticDemo();
		
		MyFirstStaticDemo.y=10;
		System.out.println("y : "+MyFirstStaticDemo.y);
		
		
		MyFirstStaticDemo ob3=new MyFirstStaticDemo();
		ob1.x=10;
		ob2.x=5;
		ob3.x=15;
		
		ob1.y=10;
		ob2.y=20;
		ob3.y=30;
		
		System.out.println(" ob1.x : "+ob1.x);
		System.out.println(" ob1.y : "+ob1.y);
		
		System.out.println(" ob2.x : "+ob2.x);
		System.out.println(" ob2.y : "+ob2.y);
		
		System.out.println(" ob3.x : "+ob3.x);
		System.out.println(" ob3.y : "+ob3.y);
		
		Derive.y=20;
		
		System.out.println("==================");
		System.out.println(" ob1.x : "+ob1.x);
		System.out.println(" ob1.y : "+ob1.y);
		
		System.out.println(" ob2.x : "+ob2.x);
		System.out.println(" ob2.y : "+ob2.y);
		
		System.out.println(" ob3.x : "+ob3.x);
		System.out.println(" ob3.y : "+ob3.y);
	}

}
