package com.sujata.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Employee {

	@Id
	@Column(name = "Id")
	private int empId;
	@Column(name = "name")
	private String empName;
	@Column(name = "Designation")
	private String empDesig;
	@Column(name = "Department")
	private String empDeptt;
	@Column(name = "Salary")
	private double empSalary;

}
