package com.sujata.demo;

/*Constructor : is used to initialise object while declaring it
 * 
 * If your class is constructor challenged, then compile will going to create one no argument constructor(default constructor) for the class,
 * but if my class is not constructor challenged , i.e it has atleast one constructor of it own , compile will not create any default constructor .
 * 
 * Rules for creating constructor
 * 1. Constructor name must be same as that of your class name
 * 2. Constructor cannot return a value not even void
 * 3. Constructor can be argumented or non-argumented
 * 4. Constructor can be in any access level i.e. public, private, default
 */
public class Complex {

	private int real,imagenary;
	
	
	/*Constructor Overloading : we an have multiple constructor and each constructor will be differentiated from each other wrt its signature
	 * Signature : Number and Type of arguments and its sequence
	 */
	public Complex(int real,int imagenary){
		this.real=real;
		this.imagenary=imagenary;
	}
	private Complex(){
		this.real=0;
		this.imagenary=0;
	}
	Complex(int real){
		this.real=real;
		this.imagenary=0;
	}
	
	public void inputComplexNumber(int real,int imagenary){
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
	
}
