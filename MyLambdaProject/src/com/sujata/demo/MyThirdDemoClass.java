package com.sujata.demo;

//Interface with exactly one method is known as Functiona Interface
@FunctionalInterface
interface Addition{
	void sum(int x,int y);
//	void demo();
}


public class MyThirdDemoClass {

	public static void main(String args[]){
		Addition aOb=new Addition() {
			@Override
			public void sum(int x, int y) {
				int s=x+y;
				System.out.println("Sum = "+s);
			}
		};
		aOb.sum(10, 20);
		
		
//		Addition a=(int x, int y)-> {
//				int s=x+y;
//				System.out.println("Sum = "+s);
//			};
		
		Addition a=(x, y)-> {
			int s=x+y;
			System.out.println("Sum = "+s);
		};
		a.sum(10, 20);
	}
}
