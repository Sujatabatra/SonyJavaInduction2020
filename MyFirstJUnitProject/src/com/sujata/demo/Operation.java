package com.sujata.demo;

public class Operation {

	private int number1;
	private int number2;
	private int result;
	private String op;
	public int getNumber1() {
		return number1;
	}
	public void setNumber1(int number1) {
		this.number1 = number1;
	}
	public int getNumber2() {
		return number2;
	}
	public void setNumber2(int number2) {
		this.number2 = number2;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	public String getOp() {
		return op;
	}
	public void setOp(String op) {
		this.op = op;
	}
	public void perform(){
		switch(op){
		case "add":
			result=number1+number2;
			break;
		case "difference":
			result=number1-number2;
			break;
		case "multiply":
			result=number1*number2;
			break;
		case "divide":
			result=number1/number2;
			break;
		}
	}
	
}
