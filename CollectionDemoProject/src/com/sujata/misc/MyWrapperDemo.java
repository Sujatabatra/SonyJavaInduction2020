package com.sujata.misc;

public class MyWrapperDemo {

	public static void main(String[] args) {
		Integer i=new Integer(10);
		Integer i1=new Integer("10");
		Integer i2;
		i2=i1;
		if(i==i1){
			System.out.println("both are equal");
		}
		else{
			System.out.println("both are not equal");
		}
		
		if(i1==i2){
			System.out.println("i1 and i2 are equal");
		}
		else{
			System.out.println("i1 and i2 are not equal");
		}
		
		if(i.equals(i1)){
			System.out.println("both are equal");
		}
		else{
			System.out.println("both are not equal");
		}
		
		Character ch=new Character('a');
		
		System.out.println("i : "+i);
		System.out.println("i1 : "+i1);
		System.out.println("ch : "+ch);
		
		Boolean b=new Boolean("GHHJHJJ");
		System.out.println("b : "+b);
		

	}

}
