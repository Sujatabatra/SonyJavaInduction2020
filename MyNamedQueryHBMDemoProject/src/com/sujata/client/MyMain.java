package com.sujata.client;

import java.util.List;

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
		// 1. obtain the instance of Query interface
		Query query = session.createNamedQuery("listAllStudents");

		// 2. Customise Query Object
		// query.setFirstResult(2);

		// 3. Execute Query
		List<Student> students = query.list();
		for (Student stud : students) {
			System.out.println(stud);
		}
		System.out.println("=================");
		System.out.println("Selection List");
		System.out.println("=================");

		Query query1 = session.createNamedQuery("searchStudentByClassAndAddress");
		query1.setParameter("std", "XII");
		query1.setParameter("add", "Banglore");
		List<Student> studList = query1.list();

		studList.stream().forEach(System.out::println);

		System.out.println("=================");
		System.out.println("Projection List");
		System.out.println("=================");
		Query query2 = session.createNamedQuery("ListRollNoAndNameOfAllStudents");

		List<Object[]> myList = query2.list();
		for (Object[] arr : myList) {
			for (Object element : arr) {
				System.out.print(element + " ");
			}
			System.out.println();
		}

		transaction.commit();

		session.close();

	}

}
