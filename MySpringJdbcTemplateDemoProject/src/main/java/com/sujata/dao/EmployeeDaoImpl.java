package com.sujata.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.sujata.bean.Employee;
import com.sujata.util.EmployeeRow;

public class EmployeeDaoImpl implements EmployeeDao {

	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public Employee getRecord(int id) {

		Employee employee = null;
		employee = jdbcTemplate.queryForObject("SELECT * FROM EMPLOYEE WHERE ID=?", new Object[] { id },
				new EmployeeRow());

		return employee;
	}

	@Override
	public List<Employee> getAllRecords(){

		List<Employee> employees = jdbcTemplate.query("SELECT * FROM EMPLOYEE", new EmployeeRow());
		return employees;
	}

	@Override
	public int insertRecord(Employee employee) {
		int rows = 0;
		rows = jdbcTemplate.update("insert into employee values(?,?,?,?,?)", employee.getEmpId(), employee.getEmpName(),
				employee.getEmpDesig(), employee.getEmpDeptt(), employee.getEmpSalary());

		return rows;
	}

	@Override
	public int deleteRecord(int id) {
		int rows=0;
		rows=jdbcTemplate.update("DELETE FROM EMPLOYEE where ID=?",id);
		return rows;
	}
	
	public int updateRecord(int id,String name) {
		int rows=0;
		rows=jdbcTemplate.update("UPDATE EMPLOYEE SET NAME=? where ID=?",name,id);
		return rows;
	}
	
	

}
