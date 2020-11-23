package com.sujata.demo;
//Deep Cloning
public class EmployeeWithDeepCloning implements Cloneable {

	private int empId;
	private String empName;
	private int salary;
	private Address address;

	public EmployeeWithDeepCloning() {

	}

	public EmployeeWithDeepCloning(int empId, String empName, int salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
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

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ", address=" + address
				+ "]";
	}

	public Object clone() throws CloneNotSupportedException{
		EmployeeWithDeepCloning employee=(EmployeeWithDeepCloning) (super.clone());
		employee.address=(Address)address.clone();
		return employee;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	

}
