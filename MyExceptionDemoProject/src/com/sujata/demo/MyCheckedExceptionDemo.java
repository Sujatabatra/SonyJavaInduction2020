package com.sujata.demo;
import static java.lang.Thread.*;

public class MyCheckedExceptionDemo {

	public static void main(String[] args) {
		System.out.println("Hello everyone we are demonstrating checked exception ");
		try {
			sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("I am up after 3000 milliseconds!!");

	}

}
