package com.sujata.demo;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="emp")
@XmlType(propOrder={"empName","empDeptt","empDesig","empSalary"})
public class Employee {

	private int empId;
	private String empName;
	private String empDesig;
	private String empDeptt;
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

	@XmlAttribute(name="id")
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

	@XmlElement(name="deptt")
	public String getEmpDeptt() {
		return empDeptt;
	}

	public void setEmpDeptt(String empDeptt) {
		this.empDeptt = empDeptt;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	@XmlElement(name="salary")
	public double getEmpSalary() {
		return empSalary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empDesig=" + empDesig + ", empDeptt=" + empDeptt
				+ ", empSalary=" + empSalary + "]";
	}

	
}
