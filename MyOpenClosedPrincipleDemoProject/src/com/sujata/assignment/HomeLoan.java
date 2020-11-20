package com.sujata.assignment;

public class HomeLoan implements Loan {

	@Override
	public boolean check(int balance) {
		
		return balance>1000;
	}

}
