package com.sujata.assignment;

public class Project {

	private String pId;
	private String pName;
	
	public Project(){
		
	}

	public Project(String pId, String pName) {
		super();
		this.pId = pId;
		this.pName = pName;
	}

	@Override
	public String toString() {
		return "Project [pId=" + pId + ", pName=" + pName + "]";
	}
	
	
}
