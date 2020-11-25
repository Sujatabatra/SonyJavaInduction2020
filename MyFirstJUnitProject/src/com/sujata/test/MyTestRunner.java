package com.sujata.test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class MyTestRunner {

	public static void main(String[] args) {
		Result result=JUnitCore.runClasses(TestOperation.class);
		
		for(Failure failure:result.getFailures()){
			System.out.println(failure.toString());
		}
		System.out.println("Total Test Cases:"+result.getRunCount());
		System.out.println("Total No of Failures :"+result.getFailureCount());
		System.out.println(result.wasSuccessful());
		

	}

}
