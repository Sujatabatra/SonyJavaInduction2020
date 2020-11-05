package com.sujata.training;

public class MyMainClass {

	public static void main(String[] args) {
		//reference variable which was pointing to null
		DemoClass demoClass;
		//reference variable hold the addres of memory in heap (object)/instantiated the class (created the instance of class)
		/*All instance variable get default initial value
		 * byte,short,int,long =0
		 * float and double=0.0
		 * object=null
		 * boolean=false
		 * char='\u0000'
		 */
		demoClass=new DemoClass(); //class instantiation time
		
		System.out.println("number : (int) "+demoClass.getNumber());
		System.out.println("name : (String) "+demoClass.getName());
		System.out.println("status : (boolean) "+demoClass.isStatus());
		System.out.println("some value : (float) "+demoClass.getSomeValue());
		System.out.println("ch : (char) "+demoClass.getCh());
		
		

	}

}

