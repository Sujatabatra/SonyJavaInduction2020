package com.sujata.demo;

public class Complex {

	//instance variables 
	/*whenever an object gets created a special reference variable gets created 
	 * and its name is 'this' which is pointing to current instance or object
	*/
	private int real,imagenary;
	
	public void inputComplexNumber(int real,int imagenary/*local variables*/){
		//real referes to local variable
		this.real=real;
		this.imagenary=imagenary;
	}
	
	public void displayComplex(){
		System.out.print(real);
		if(imagenary>0){
			System.out.println("+"+imagenary+"i");
		}
		else if(imagenary<0)
			System.out.println(imagenary+"i");
	}
	
	public Complex addComplexNumbers(Complex c2){
		Complex sum=new Complex();
		sum.real=this.real+c2.real;
		sum.imagenary=this.imagenary+c2.imagenary;
		return sum;
	}
	
	public void sumComplexNumbers(Complex c1,Complex c2){
		this.real=c1.real+c2.real;
		this.imagenary=c1.imagenary+c2.imagenary;
	}
}
