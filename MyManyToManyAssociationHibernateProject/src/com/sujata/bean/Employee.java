package com.sujata.bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Employee {

	@Id
	private String empId;
	private String empName;
	@ManyToMany
	@JoinTable(name="ProjectWiseEmpDetails",
	joinColumns=@JoinColumn(name="EId"),
	inverseJoinColumns=@JoinColumn(name="PId"))
	private List<Project> project=new ArrayList<Project>();

	public Employee() {
		super();
	}

	public Employee(String empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public List<Project> getProject() {
		return project;
	}

	public void setProject(List<Project> project) {
		this.project = project;
	}



}
