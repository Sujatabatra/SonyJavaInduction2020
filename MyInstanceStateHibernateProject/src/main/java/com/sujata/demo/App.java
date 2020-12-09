package com.sujata.demo;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class App {
	public static void main(String[] args) {
		StandardServiceRegistry standardServiceRegistry = new StandardServiceRegistryBuilder()
				.configure("hibernate.cfg.xml").build();
		Metadata metadata = new MetadataSources(standardServiceRegistry).getMetadataBuilder().build();

		SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();

		Student st1 = new Student(9, "IIIIII", "Banglore", "XII"); // Transient
																	// State

		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		session.save(st1);
		// Persistent State : object is in sync with DB
		
		Student student=session.get(Student.class, 2); //Persistent State
		student.setName("Disha");
		
		transaction.commit();

		session.close();

		// Detached State
		st1.setName("Manas");
		
		session=sessionFactory.openSession();
		transaction=session.beginTransaction();
		
		session.update(st1);
		//Persistent State
		
		transaction.commit();
		session.close();
	}
}
