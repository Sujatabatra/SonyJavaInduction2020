package com.sujata.assignment;

public class PersonalLoan implements Loan {

	@Override
	public boolean check(int balance) {
		
		return balance>400;
	}

}
