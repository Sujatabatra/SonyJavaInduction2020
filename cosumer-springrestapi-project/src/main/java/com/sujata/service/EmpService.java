package com.sujata.service;

import java.util.List;

import com.sujata.bean.Employee;

public interface EmpService {

	public Employee getEmployee(int id);
	public List<Employee> getAllEmployees();
}
