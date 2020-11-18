package com.sujata.demo;
//class inside a method : local inner class
class MyOuter
{
	int value;
	public void show(){
		System.out.println("Hi I am show method of MyOuter class ");
	}
	
	public void display(){
		//local variable
		int x=10;
		String lastName="Last Name";
		System.out.println("Hi I am display method of MyOuter class");
		//local class : ti access any class we need its object and as it is local to method we will able to create its object only within method
		class MyInner{
			private String name;
			
			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

			void greet(){
				System.out.println("Hi "+name+" "+lastName+" I am local Inner class");
			}
		}
		
		MyInner myInner=new MyInner();
		myInner.setName("aaa");
		myInner.greet();
		
	}
}
public class LocalInnerClassDemo {

	public static void main(String[] args) {
		MyOuter myOuter=new MyOuter();
		myOuter.display();

	}

}
