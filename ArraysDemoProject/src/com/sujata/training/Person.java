package com.sujata.training;

public class Person {

	private int personId;
	private String personName;

	public Person(int personId, String personName) {
		super();
		this.personId = personId;
		this.personName = personName;
	}

	public Person() {

	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public void displayPerson() {
		System.out.println("Person ID : " + personId);
		System.out.println("Person Name : " + personName);
	}
}
