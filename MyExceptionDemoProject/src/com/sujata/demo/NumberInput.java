package com.sujata.demo;

public class NumberInput {

	private int number;

	public int getNumber() {
		return number;
	}

//	public void setNumber(int number) {
//		if(number<18){
//			try {
//				throw new AgeCheckedException("Age cannot be less then 18");
//			} catch (AgeCheckedException e) {
//				System.out.println(e);
////				e.printStackTrace();
//			}
//		}
//		else{
//		this.number = number;
//		}
//	}
//	
	public void setNumber(int number) throws AgeCheckedException {
		if(number<18){
				throw new AgeCheckedException("Age cannot be less then 18");
		}
		else{
		this.number = number;
		}
	}
	
	
	public void oneMoreSetNumber(int number) throws AgeUncheckedException {
		if(number<18){
				throw new AgeUncheckedException("Age cannot be less then 18 by unchecked exception");
		}
		else{
		this.number = number;
		}
	}
}
