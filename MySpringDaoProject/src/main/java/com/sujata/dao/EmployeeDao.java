package com.sujata.dao;

import java.sql.SQLException;
import java.util.List;

import com.sujata.bean.Employee;

public interface EmployeeDao {

	public Employee getRecord(int id)throws SQLException;
	public List<Employee> getAllRecords()throws SQLException;
	public int insertRecord(Employee employee)throws SQLException;
}
