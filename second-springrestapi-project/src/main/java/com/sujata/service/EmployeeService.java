package com.sujata.service;

import java.sql.SQLException;
import java.util.List;

import com.sujata.bean.Employee;

public interface EmployeeService {
	public Employee searchEmployeeById(int id);
	public List<Employee> getAllEmployees();
	public Employee insertEmployee(Employee employee);
	double calculateNetSalary(Employee employee);
	public Employee deleteEmployee(int id);
	public Employee updateEmployee(int id,String name);

}
