package com.sujata.assignment;

public class Account {

	private int balance;
	private String accountNo;
	public Account(int balance, String accountNo) {
		super();
		this.balance = balance;
		this.accountNo = accountNo;
	}
	
	public void checkLoanEligibility(Loan loan){
		if(loan.check(balance)){
			System.out.println("Eligible for loan Approval");
		}
		else{
			System.out.println("Not eligible for loan!!");
		}
			
	}
}
