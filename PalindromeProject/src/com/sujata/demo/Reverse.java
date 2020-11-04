package com.sujata.demo;
/*Naming Convention
 * class name : PascalCase
 * method name : camelCase
 * variable name : camelCase
*/
public class Reverse {

	private int number,reverseNumber;

	public void setNumber(int number) {
		this.number = number;
	}

	public int getReverseNumber() {
		int remainder;
		while(number!=0){
			remainder=number%10;
			reverseNumber=reverseNumber*10+remainder;
			number/=10;
		}
		return reverseNumber;
	}
	
}
