package com.sujata.misc;

public class PersonMain {

	public static void main(String[] args) {
		int x=10;
		int y=10;
		if(x==y){
			System.out.println("x and y are equal");
		}
		else{
			System.out.println("x and y are not equal");
		}

		Person person1;
		person1=new Person(101, "AAAA");
		Person person2=new Person(101, "AAAA");
		
		if(person1==person2){
			System.out.println("person1 and person2 are equal");
		}
		else{
			System.out.println("person 1 and person 2 are not equal");
		}
		
		System.out.println(person1.hashCode());
		System.out.println(person2.hashCode());
		
		Person person3;
		person3=person1;
		// '==' it is checking for the equality of reference variables , whether both reference variable have same hash code or not
		if(person1==person3){
			System.out.println("person1 and person3 are equal");
		}
		else{
			System.out.println("person1 and person3 are not equal");
		}
		
		//if two objects are meaningfully equal or not , i.e whether two objects have same content or not , we make use of equals method 
		//equals() belongs to object class
		if(person1.equals(person2)){
			System.out.println("Person1 and Person2 are equals");
		}
		else{
			System.out.println("Person1 and Person2 are not equals");
		}
	}

}
