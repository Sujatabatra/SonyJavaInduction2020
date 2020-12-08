package com.sujata.client;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.sujata.bean.Address;
import com.sujata.bean.Person;

public class MyMain {

	public static void main(String[] args) {
		StandardServiceRegistry standardServiceRegistry = new StandardServiceRegistryBuilder()
				.configure("hibernate.cfg.xml").build();
		Metadata metadata = new MetadataSources(standardServiceRegistry).getMetadataBuilder().build();

		SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();
		Session session = sessionFactory.openSession();

		Transaction transaction = session.beginTransaction();
		
		Person person=new Person("P001", "AAAAA", new Address(101, "Street 1", "Chennai", "TN", "600001"), LocalDate.of(1999, 7, 21));
		
		session.save(person);
		
		transaction.commit();
		session.close();

	}

}
