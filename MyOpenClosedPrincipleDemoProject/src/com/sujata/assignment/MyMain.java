package com.sujata.assignment;

public class MyMain {

	public static void main(String[] args) {
		Account a1=new Account(2000, "A001");
		
		Account a2=new Account(500, "A002");

		a1.checkLoanEligibility(new HomeLoan());
		
		a2.checkLoanEligibility(new PersonalLoan());
	}

}
