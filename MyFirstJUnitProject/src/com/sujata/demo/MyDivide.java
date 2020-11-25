package com.sujata.demo;

public class MyDivide {

	//1. Division of Positive nos:
	//2. if negative no entered as numerator or denominator : output will be zero
	//3. if denominator is zero result should be an exception Arithmetic Exception
	public int divide(int x,int y){
		if(x>0 && y>=0)
			return x/y;
		return 0;
	}
	
	public String wish(String name){
		if(name!=null && name.equals("Sujata"))
			return "Hi";
		if(name!=null && name.equals("Batra")){
			while(true);
			
		}
		return null;
	}
}
 