package com.sujata.dao;

import java.sql.SQLException;
import java.util.List;

import com.sujata.bean.Employee;

public interface EmployeeDao {

	public Employee getRecord(int id);
	public List<Employee> getAllRecords();
	public int insertRecord(Employee employee);
}
