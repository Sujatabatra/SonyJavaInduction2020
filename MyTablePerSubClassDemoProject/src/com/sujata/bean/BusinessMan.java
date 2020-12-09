package com.sujata.bean;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="personId")
public class BusinessMan extends Person {
	
	private String natureOfBusiness;
	private long annualTurnover;
	public BusinessMan() {
		super();
	}
	public BusinessMan(int pId, String pName, String natureOfBusiness, long annualTurnover) {
		super(pId, pName);
		this.natureOfBusiness = natureOfBusiness;
		this.annualTurnover = annualTurnover;
	}
	public String getNatureOfBusiness() {
		return natureOfBusiness;
	}
	public void setNatureOfBusiness(String natureOfBusiness) {
		this.natureOfBusiness = natureOfBusiness;
	}
	public long getAnnualTurnover() {
		return annualTurnover;
	}
	public void setAnnualTurnover(long annualTurnover) {
		this.annualTurnover = annualTurnover;
	}
	
	

}
