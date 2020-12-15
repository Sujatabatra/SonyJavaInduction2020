package com.sujata.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sujata.bean.Employee;
import com.sujata.dao.EmployeeDao;
import com.sujata.dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao employeeDao = new EmployeeDaoImpl();

	@Override
	public Employee searchEmployeeById(int id) throws ClassNotFoundException, SQLException {
		return employeeDao.getRecord(id);
	}

	@Override
	public List<Employee> getAllEmployees() throws ClassNotFoundException, SQLException {
		List<Employee> employees = employeeDao.getAllRecords();
		return employees;
	}

	@Override
	public Employee insertEmployee(Employee employee) throws ClassNotFoundException, SQLException {
		return employeeDao.insertRecord(employee);

	}

	@Override
	public Employee deleteEmployee(int id) throws ClassNotFoundException, SQLException {
		return employeeDao.deleteRecord(id);
	}

	@Override
	public Employee modifyEmployee(int id, Employee newEmployee) throws ClassNotFoundException, SQLException {
		return employeeDao.modifyRecord(id, newEmployee);
	}
}
