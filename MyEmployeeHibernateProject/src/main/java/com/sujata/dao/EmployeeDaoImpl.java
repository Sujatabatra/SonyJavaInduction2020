package com.sujata.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.sujata.bean.Employee;

import com.sujata.util.MySessionFactory;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public Employee getRecord(int id) {
		SessionFactory sessionFactory = MySessionFactory.getSessionFactory();

		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		Employee employee = session.get(Employee.class, id);

		transaction.commit();
		session.close();

		return employee;
	}

	@Override
	public List<Employee> getAllRecords() {
		return null;
	}

	@Override
	public int insertRecord(Employee employee) {
		SessionFactory sessionFactory = MySessionFactory.getSessionFactory();

		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		//return the generated id .
		int id=(int)session.save(employee);
		
		transaction.commit();
		session.close();
		
		return id;
	}

}
