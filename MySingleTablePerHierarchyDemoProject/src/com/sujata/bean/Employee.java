package com.sujata.bean;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="Emp")
public class Employee extends Person {

	private String designation;
	private String department;
	private int salary;
	public Employee() {
		super();
	}
	public Employee(int pId, String pName, String designation, String department, int salary) {
		super(pId, pName);
		this.designation = designation;
		this.department = department;
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
}
