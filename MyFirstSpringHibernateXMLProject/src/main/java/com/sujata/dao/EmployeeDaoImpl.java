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

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.jdbc.core.JdbcTemplate;

import com.sujata.bean.Employee;
import com.sujata.util.EmployeeRow;

public class EmployeeDaoImpl implements EmployeeDao {

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public Employee getRecord(int id) {

		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Employee employee = session.get(Employee.class, id);
		
		transaction.commit();
		session.close();
		return employee;
	}

	@Override
	public List<Employee> getAllRecords() {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Query<Employee> query = session.createQuery("from Employee");
		List<Employee> employees = query.getResultList();
		
		transaction.commit();
		session.close();
		return employees;

	}

	@Override
	public int insertRecord(Employee employee) {
		int rows = 1;
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		session.save(employee);
		
		transaction.commit();
		session.close();
		
		return rows;
	}

	@Override
	public int deleteRecord(int id) {
		int rows = 1;
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Employee emp=session.get(Employee.class, id);
		session.delete(emp);
		
		transaction.commit();
		session.close();
		
		return rows;
	}

	public int updateRecord(int id, String name) {
		int rows = 1;
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Employee emp=session.get(Employee.class, id);
		emp.setEmpName(name);
		
		transaction.commit();
		session.close();
		
		return rows;
	}

}
