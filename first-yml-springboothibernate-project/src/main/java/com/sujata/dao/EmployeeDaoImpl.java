package com.sujata.dao;

import java.util.List;

import javax.persistence.EntityManagerFactory;
import javax.persistence.criteria.CriteriaBuilder;

import org.hibernate.Criteria;
import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sujata.bean.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private EntityManagerFactory entityManagerFactory;
	
	@Override
	public Employee getRecord(int id) {
		Session session=entityManagerFactory.unwrap(SessionFactory.class).openSession();
		Transaction tr=session.beginTransaction();
		Employee emp=session.get(Employee.class, id);
		tr.commit();
		session.close();
		return emp;
	}

	@Override
	public List<Employee> getAllRecords() {
		Session session=entityManagerFactory.unwrap(SessionFactory.class).openSession();
		Transaction tr=session.beginTransaction();
		Query query=session.createQuery("from Employee");
		List employees=query.getResultList();
		tr.commit();
		session.close();
		return employees;

	}

	@Override
	public int insertRecord(Employee employee) {
		Session session=entityManagerFactory.unwrap(SessionFactory.class).openSession();
		Transaction tr=session.beginTransaction();
		session.save(employee);
		tr.commit();
		session.close();
		return 1;
	}

	@Override
	public int deleteRecord(int id) {
		Session session=entityManagerFactory.unwrap(SessionFactory.class).openSession();
		Transaction tr=session.beginTransaction();
		Employee emp=session.get(Employee.class, id);
		if(emp!=null){
			session.delete(emp);
			tr.commit();
			session.close();
			return 1;
		}
		tr.commit();
		session.close();
		return 0;
	}

	public int updateRecord(int id, String name) {
		Session session=entityManagerFactory.unwrap(SessionFactory.class).openSession();
		Transaction tr=session.beginTransaction();
		Employee emp=session.get(Employee.class, id);
		if(emp!=null){
			emp.setEmpName(name);
			tr.commit();
			session.close();
			return 1;
		}
		tr.commit();
		session.close();
		return 0;
	}

}
