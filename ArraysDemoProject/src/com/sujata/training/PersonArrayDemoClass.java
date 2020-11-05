package com.sujata.training;

import java.util.Scanner;

//whenever we will try to call class methods from null reference we will get NullPointerException
public class PersonArrayDemoClass {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		Person persons[];
		
		System.out.println("Enter Total No of Persons : ");
		int totalPersons=scanner.nextInt();
		
		persons=new Person[totalPersons]; //Array of reference variable , reference variable stores null
		
		for(int index=0;index<totalPersons;index++){
			System.out.println("Enter Person ID : ");
			int id=scanner.nextInt();
			System.out.println("Enter Person Name : ");
			String name=scanner.next();
			
//			persons[index]=new Person();  //creating object for each null reference variable created on line no 16
//			
//			persons[index].setPersonId(id);
//			persons[index].setPersonName(name);
			
			persons[index]=new Person(id, name);
		}

		for(int index=0;index<totalPersons;index++){
			persons[index].displayPerson();
		}
	}

}
