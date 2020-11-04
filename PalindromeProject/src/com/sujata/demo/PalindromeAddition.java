package com.sujata.demo;
public class PalindromeAddition {

	private int number1,number2,sum;

	public void setNumber1(int number1) {
		if(checkPalindrome(number1))
			this.number1 = number1;
	}

	public void setNumber2(int number2) {
		if(checkPalindrome(number2))
			this.number2 = number2;
	}

	public int getSum() {
		sum=number1+number2;
		return sum;
	}
	
	public boolean checkPalindrome(int number){
		Palindrome palindrome =new Palindrome();
		palindrome.setNumber(number);
		return palindrome.isPalindrome();
	}
	
}
