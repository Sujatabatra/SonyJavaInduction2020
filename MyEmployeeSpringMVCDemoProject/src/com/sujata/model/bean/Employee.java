package com.sujata.model.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Employee {

	@Id
	@Column(name="Id")
	private int empId;
	@Column(name="name")
	private String empName;
	@Column(name="Designation")
	private String empDesig;
	@Column(name="Department")
	private String empDeptt;
	@Column(name="Salary")
	private double empSalary;

	public Employee() {

	}

	public Employee(int empId, String empName, String empDesig, String empDeptt, double empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDesig = empDesig;
		this.empDeptt = empDeptt;
		this.empSalary = empSalary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpDesig() {
		return empDesig;
	}

	public void setEmpDesig(String empDesig) {
		this.empDesig = empDesig;
	}

	public String getEmpDeptt() {
		return empDeptt;
	}

	public void setEmpDeptt(String empDeptt) {
		this.empDeptt = empDeptt;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empDesig=" + empDesig + ", empDeptt=" + empDeptt
				+ ", empSalary=" + empSalary + "]";
	}

	
}
