package com.sujata.demo;


interface Demo{
	void xyz();
}
public class MyFirstDemoClass {

	public static void main(String[] args) {
		int x=10;
		String y="XYZ";
		
		Demo z=new Demo(){
			@Override
			public void xyz() {
				System.out.println("Hi Evereyone!!");		
			}
		};
		
		
		//Lambda Expression : Functional Programming
		Demo d=()->{
			System.out.println("Hello Evereyone!!");
			};
		
		d.xyz();
		

	}

}
