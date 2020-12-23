package com.sujata.model.dao;

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

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sujata.model.bean.Employee;


@Transactional
@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	public Employee getRecord(int id) {

		Employee employee = hibernateTemplate.get(Employee.class, id);
		return employee;
	}

	@Override
	public List<Employee> getAllRecords() {
		List<Employee> employees = (List<Employee>) hibernateTemplate.find("from Employee");

		return employees;

	}

	
	@Override
	public int insertRecord(Employee employee) {
		int rows = 1;
		
		hibernateTemplate.save(employee);
		
		return rows;
	}

	@Override
	public int deleteRecord(int id) {
		int rows = 1;
		
		Employee employee = hibernateTemplate.get(Employee.class, id);
		hibernateTemplate.delete(employee);
		
		return rows;
	}

	public int updateRecord(int id, String name) {
		int rows = 1;
		
		Employee employee = hibernateTemplate.get(Employee.class, id);
		employee.setEmpName(name);
		hibernateTemplate.saveOrUpdate(employee);
		return rows;
	}

}
