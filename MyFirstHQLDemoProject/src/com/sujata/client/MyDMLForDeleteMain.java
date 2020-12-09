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

public class MyDMLForDeleteMain {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		StandardServiceRegistry standardServiceRegistry = new StandardServiceRegistryBuilder()
				.configure("hibernate.cfg.xml").build();
		Metadata metadata = new MetadataSources(standardServiceRegistry).getMetadataBuilder().build();

		SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();

		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		System.out.println("Enter class whose record you want to delete : ");
		String std=scanner.next();
		
		Query query=session.createQuery("delete from Student where standard=:st");
		query.setParameter("st", std);

		int rows=query.executeUpdate();

		if(rows>0)
			System.out.println(rows+" Record Deleted");
		else
			System.out.println("Record not Deleted");
		
		transaction.commit();
		session.close();

	}

}
