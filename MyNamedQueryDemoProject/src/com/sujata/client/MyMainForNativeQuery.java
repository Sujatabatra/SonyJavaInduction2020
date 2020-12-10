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

public class MyMainForNativeQuery {

	public static void main(String[] args) {
		StandardServiceRegistry standardServiceRegistry = new StandardServiceRegistryBuilder()
				.configure("hibernate.cfg.xml").build();
		Metadata metadata = new MetadataSources(standardServiceRegistry).getMetadataBuilder().build();

		SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();

		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Query query = session.createNativeQuery("select * from studenthiber");

				List<Object[]> students = query.list();
		for (Object[] studs : students) {
			for (Object stud : studs) {
				System.out.print(stud + " ");
			}
			System.out.println();
		}
		System.out.println("===========================");
		Query query1 = session.createNamedQuery("nativeListAllStudents");

		
		List<Object[]> students1 = query.list();
		for (Object[] studs : students1) {
			for (Object stud : studs) {
				System.out.print(stud + " ");
			}
			System.out.println();
		}
		transaction.commit();

		session.close();

	}

}
