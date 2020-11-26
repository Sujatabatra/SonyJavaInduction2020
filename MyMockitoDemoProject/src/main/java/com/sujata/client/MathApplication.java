package com.sujata.client;

import com.sujata.service.CalculatorService;

public class MathApplication {
	
	private CalculatorService calculatorService;

	public void setCalculatorService(CalculatorService calculatorService) {
		this.calculatorService = calculatorService;
	}
	
	public int sum(int num1,int num2){
		return calculatorService.add(num1, num2);
	}
	
	public int difference(int num1,int num2){
		return calculatorService.subtract(num1, num2);
	}
	
	public int product(int num1,int num2){
		return calculatorService.multiply(num1, num2);
	}
	
	public int divide(int num1,int num2){
		return calculatorService.divide(num1, num2);
	}
	

}
