package com.sujata.client;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.sujata.bean.BusinessMan;
import com.sujata.bean.Employee;
import com.sujata.bean.Person;

public class MyMain {

	public static void main(String[] args) {
		StandardServiceRegistry standardServiceRegistry = new StandardServiceRegistryBuilder()
				.configure("hibernate.cfg.xml").build();
		Metadata metadata = new MetadataSources(standardServiceRegistry).getMetadataBuilder().build();
		
		SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		Person person=new Person(101, "AAAAA");
		Employee emp=new Employee(102, "XXXXX", "Executive", "HR", 7896);
		BusinessMan bm=new BusinessMan(103, "MMMMM", "hardware", 9876543);
		
		session.save(person);
		session.save(emp);
		session.save(bm);
		
		transaction.commit();
		session.close();

	}

}
