package com.sujata.assignment;

import java.util.HashMap;

public class EmployeeWithProjectDetails {

	private HashMap<Employee, Project> empDetails;

	public EmployeeWithProjectDetails() {
		empDetails=new HashMap<>();
	}
	
	public void addEmployeeAndProject(Employee employee,Project project){
		empDetails.put(employee, project);
	}
	
	public void getProjectByEmployee(Employee employee){
		empDetails.get(employee);
	}
	
	public void displayallRecord(){
		
	}
	
	
}
