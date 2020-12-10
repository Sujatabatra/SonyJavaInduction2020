package com.sujata.client;

import java.util.List;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

import com.sujata.bean.Student;

public class MyMain {

	public static void main(String[] args) {
		StandardServiceRegistry standardServiceRegistry = new StandardServiceRegistryBuilder()
				.configure("hibernate.cfg.xml").build();
		Metadata metadata = new MetadataSources(standardServiceRegistry).getMetadataBuilder().build();

		SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();

		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		Student student1=session.get(Student.class, 5); //select query
		System.out.println("Student with roll no 5 : "+student1);
		
		Student student2=session.get(Student.class, 5);
		System.out.println("Student with roll no 5 : "+student2);
		
		Query query=session.createQuery("from Student where rollNo=6");
		List<Student> st=query.list();
		System.out.println(st);
		
		Query query1=session.createQuery("from Student where rollNo=6");
		List<Student> st1=query.list();
		System.out.println(st1);
		
		transaction.commit();
		session.close();
		
		session = sessionFactory.openSession();
		transaction = session.beginTransaction();
		
		Student student3=session.get(Student.class, 6);
		System.out.println("Student with roll no 6 : "+student3);
		
		transaction.commit();
		session.close();
		

	}

}
