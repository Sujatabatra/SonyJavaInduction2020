package com.sujata.model.service;

import java.sql.SQLException;
import java.util.List;

import com.sujata.model.bean.Employee;

public interface EmployeeService {
	public Employee searchEmployeeById(int id);
	public List<Employee> getAllEmployees();
	public int insertEmployee(Employee employee);
	double calculateNetSalary(Employee employee);
	public int deleteEmployee(int id);
	public int updateEmployee(int id,String name);

}
