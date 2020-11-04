
//class : Encapsulation
//private : Data Hiding
//method : Data Abstraction
class Factorial{
	
	private int number,factorial;
	//data editable : setter method
	//data  readable : getter method

	public void setNumber(int number) {
		this.number = number;
	}

	public int getFactorial() {
		factorial=1;
		while(number>=1)
			factorial*=number--;
		
		return factorial;
	}
	
	
}
public class MyOOPDemo {

	public static void main(String[] args) {
		Factorial fOb;
		fOb=new Factorial();
		fOb.setNumber(4);
//		fOb.factorial=9;
		int fac=fOb.getFactorial();
		System.out.println("Factorial : "+fac);

	}

}
