package com.sujata.service;

import java.sql.SQLException;
import java.util.List;

import com.sujata.bean.Employee;

public interface EmployeeService {
	public Employee searchEmployeeById(int id);
	public List<Employee> getAllEmployees();
	public int insertEmployee(Employee employee);
	double calculateNetSalary(Employee employee);

}
