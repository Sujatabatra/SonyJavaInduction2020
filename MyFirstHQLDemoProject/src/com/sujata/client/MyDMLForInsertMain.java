package com.sujata.client;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

import com.sujata.bean.Student;

public class MyDMLForInsertMain {

	public static void main(String[] args) {
		
		StandardServiceRegistry standardServiceRegistry = new StandardServiceRegistryBuilder()
				.configure("hibernate.cfg.xml").build();
		Metadata metadata = new MetadataSources(standardServiceRegistry).getMetadataBuilder().build();

		SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();

		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		
		Query query=session.createQuery("insert into Student(rollNo,name,address,standard) "
				+ "select rollNo,name,address,standard from Stud");

		
		int rows=query.executeUpdate();
		if(rows>0)
			System.out.println("Record inserted "+rows);
		else
			System.out.println("Record not inserted");
		
		transaction.commit();
		session.close();

	}

}
