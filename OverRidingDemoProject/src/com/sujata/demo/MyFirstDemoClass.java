package com.sujata.demo;
/*
 * Modify any functionality of the base class,opt for overriding
 */
class PopCorn{
	public void pop(){
		System.out.println("PopCorn is popping!!");
	}
	
	public void size(){
		System.out.println("Some size of Popcorn");
	}
}

class ButterPopCorn extends PopCorn{
	public void pop(){
		System.out.println("Yummy Buttery popcorn is popping!!!");
	}
	
	public void quantiy(int ounce){
		System.out.println("adding "+ounce+" of butter!!");
	}
}

class CaramelPopCorn extends PopCorn{
	public void pop() {
		System.out.println("Awesome Caramel Popcorn is Popping!!");
	}
}

class FoodCourt{
	
	private PopCorn popCorn;
	
	FoodCourt(PopCorn popCorn){
		this.popCorn=popCorn;
	}
	
	public void buy(){
		popCorn.pop();
	}
}

class ChocolatePopCorn extends PopCorn{
	public void pop(){
		System.out.println("Chocolaty popcorns are popping!!");
	}
}
/*
 * Base class reference variable is type compatible with the derived class , but reverse is not true
 * Object slicing : that from the base class reference variable we can only call the functionality which is coming fronm the base class
 * Dynamic Method Dispatch : Polymorphism
 */
public class MyFirstDemoClass {

	public static void main(String[] args) {
		//base class reference variable
		PopCorn popCorn;
		popCorn=new PopCorn();
		popCorn.pop();
		
		//storing the object of derived class
		popCorn=new ButterPopCorn();
		popCorn.pop();
		popCorn.size();
//		popCorn.quantity(); won't be able to call because of object slicing
		((ButterPopCorn)popCorn).quantiy(9);  //type casted the base class reference variable to derived class 
		
		
		
		popCorn=new CaramelPopCorn();
		popCorn.pop();

		FoodCourt foodCourt;
		foodCourt=new FoodCourt(new ChocolatePopCorn());
		foodCourt.buy();
	}

}
