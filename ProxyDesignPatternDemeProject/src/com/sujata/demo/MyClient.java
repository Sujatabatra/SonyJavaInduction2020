package com.sujata.demo;

public class MyClient {

	public static void main(String[] args) {
		Internet internet=new ProxyInternet();
		
		try{
			internet.connectTo("hhh.com");
			internet.connectTo("aaa.com");
		}
		catch(Exception exception){
			System.out.println(exception.getMessage());
		}

	}

}
