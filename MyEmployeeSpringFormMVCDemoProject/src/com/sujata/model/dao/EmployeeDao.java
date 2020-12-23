package com.sujata.model.dao;

import java.sql.SQLException;
import java.util.List;

import com.sujata.model.bean.Employee;

public interface EmployeeDao {

	public Employee getRecord(int id);
	public List<Employee> getAllRecords();
	public int insertRecord(Employee employee);
	public int deleteRecord(int id);
	public int updateRecord(int id,String name);
}
