package com.sujata.demo;

interface Operation{
	int operate(int a,int b);
}
public class MyFourthDemoClass {

	public static void main(String[] args) {
		
		Operation sum=new Operation() {
			@Override
			public int operate(int a, int b) {
				return a+b;
			}
		};
		
		int s=sum.operate(89, 90);
		System.out.println("Sum : "+s);
		
		System.out.println("========================");
		
//		Operation rectangle=(int a, int b) ->{
//				return a*b;
//			};
		
//		Operation rectangle=(a, b) ->{
//			return a*b;
//		};
		
		Operation rectangle=(a, b) -> a*b;
		
		System.out.println("Area of Rectangle : "+rectangle.operate(7, 6));
		
	}

}
