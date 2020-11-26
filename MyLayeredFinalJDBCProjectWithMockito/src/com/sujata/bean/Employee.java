package com.sujata.bean;

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((empDeptt == null) ? 0 : empDeptt.hashCode());
		result = prime * result + ((empDesig == null) ? 0 : empDesig.hashCode());
		result = prime * result + empId;
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		long temp;
		temp = Double.doubleToLongBits(empSalary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empDeptt == null) {
			if (other.empDeptt != null)
				return false;
		} else if (!empDeptt.equals(other.empDeptt))
			return false;
		if (empDesig == null) {
			if (other.empDesig != null)
				return false;
		} else if (!empDesig.equals(other.empDesig))
			return false;
		if (empId != other.empId)
			return false;
		if (empName == null) {
			if (other.empName != null)
				return false;
		} else if (!empName.equals(other.empName))
			return false;
		if (Double.doubleToLongBits(empSalary) != Double.doubleToLongBits(other.empSalary))
			return false;
		return true;
	}

	
}
