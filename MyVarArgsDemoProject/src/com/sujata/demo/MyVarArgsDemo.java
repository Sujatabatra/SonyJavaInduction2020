package com.sujata.demo;

public class MyVarArgsDemo {
	
	/*
	 * Var args:
	 * 1. any function can accept variable no of values of same type
	 * 2. we cannot have two var args in single function
	 * 3. we can overload var args type function
	 * 4. In a function we can have var args as well as no var args type arguments, 
	 * but var arg type argument must be the last argument
	 */
	public int sum(int... args){
		int sum=0;
		for(int value:args){
			sum+=value;
		}
		return sum;
	}
	
	public double sum(double... args){
		double sum=0;
		for(double value:args){
			sum+=value;
		}
		return sum;
	}

	public int operation(String op,int... values){
		int result=0;
		switch(op){
		case "add":
			for(int value:values){
				result+=value;
			}
			break;
		case "product":
			result=1;
			for(int value:values){
				result*=value;
			}
			break;
		}
		return result;
	}

	//valid function
	public int operation(int n,String op,boolean x,int... values){
		int result=0;
		
		return result;
	}
	
//	error : var arg must be last parameter
//	public int operation(int... values,String op){
//		int result=0;
//		
//		return result;
//	}
	
//	error: multiple var arg type arguments not allowed
//	public int operation(int... values,String... op){
//		int result=0;
//		
//		return result;
//	}
	
	
}
