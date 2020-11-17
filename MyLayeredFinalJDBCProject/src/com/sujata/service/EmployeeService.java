package com.sujata.service;

import java.sql.SQLException;
import java.util.List;

import com.sujata.bean.Employee;

public interface EmployeeService {
	public Employee searchEmployeeById(int id)throws ClassNotFoundException,SQLException;
	public List<Employee> getAllEmployees()throws ClassNotFoundException,SQLException;
	public int insertEmployee(Employee employee)throws ClassNotFoundException,SQLException;
	double calculateNetSalary(Employee employee)throws ClassNotFoundException,SQLException;

}
