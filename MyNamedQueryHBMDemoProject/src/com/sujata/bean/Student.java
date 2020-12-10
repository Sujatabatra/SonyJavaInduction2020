package com.sujata.bean;

public class Student {

	private int rollNo;
	private String name;
	private String address;
	private String standard;

	public Student() {

	}

	public Student(int rollNo, String name, String address, String standard) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.address = address;
		this.standard = standard;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getStandard() {
		return standard;
	}

	public void setStandard(String standard) {
		this.standard = standard;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", address=" + address + ", standard=" + standard + "]";
	}

}
