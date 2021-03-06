package com.sujata.bean;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "StudentHiber")
@NamedQueries({
	@NamedQuery(name="listAllStudents",query="from Student"),
	@NamedQuery(name="searchStudentByClassAndAddress",query="from Student where standard=:std or address=:add"),
	@NamedQuery(name="ListRollNoAndNameOfAllStudents",query="select rollNo,name from Student")
})
@NamedNativeQueries({
	@NamedNativeQuery(name="nativeListAllStudents",query="select * from studenthiber")
})
public class Student {

	@Id
	@Column(name = "StudentId")
	private int rollNo;
	@Column(name = "StudentName")
	private String name;
	private String address;
	@Column(name = "class")
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
