package com.sujata.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
public class Wife {

	@Id
	@Column(name="wID")
	private String wifeId;
	@Column(name="name")
	private String wifeName;
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="hId")
	private Husband husband;

	public Wife() {

	}

	public Wife(String wifeId, String wifeName) {
		super();
		this.wifeId = wifeId;
		this.wifeName = wifeName;
	}

	public String getWifeId() {
		return wifeId;
	}

	public void setWifeId(String wifeId) {
		this.wifeId = wifeId;
	}

	public String getWifeName() {
		return wifeName;
	}

	public void setWifeName(String wifeName) {
		this.wifeName = wifeName;
	}

	public Husband getHusband() {
		return husband;
	}

	public void setHusband(Husband husband) {
		this.husband = husband;
	}

}
