package com.sujata.bean;

import java.time.LocalDate;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {
	@Id
	private String pId;
	private String pName;
	@Embedded
	private Address address;
	private LocalDate dob;

	public Person() {

	}

	public Person(String pId, String pName, Address address, LocalDate dob) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.address = address;
		this.dob = dob;
	}

	public String getpId() {
		return pId;
	}

	public void setpId(String pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

}
