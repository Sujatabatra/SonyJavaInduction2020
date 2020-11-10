package com.sujata.demo;

public class AccountMain {

	public static void main(String[] args) {
		Account a001=new Account();
//		Account a002=new Account();
		
		Thread gautam=new Thread(a001,"Gautam");
		Thread karthik=new Thread(a001,"Karthik");
		
		gautam.start();
		karthik.start();
	}

}
