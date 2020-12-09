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

public class MyDMLForUpdateMain {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		StandardServiceRegistry standardServiceRegistry = new StandardServiceRegistryBuilder()
				.configure("hibernate.cfg.xml").build();
		Metadata metadata = new MetadataSources(standardServiceRegistry).getMetadataBuilder().build();

		SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();

		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		System.out.println("Enter class whose record you want to update : ");
		String std=scanner.next();
		System.out.println("Enter new location for the student studying in "+std+" class : ");
		String ad=scanner.next();
		
		Query query=session.createQuery("update Student set address=:add  where standard=:st");
		query.setParameter("st", std);
		query.setParameter("add", ad);

		int rows=query.executeUpdate();

		if(rows>0)
			System.out.println(rows+" Records Updated");
		else
			System.out.println("Record not Updated");
		
		transaction.commit();
		session.close();

	}

}
