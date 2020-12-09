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
		//1. obtain the instance of Query interface
		Query query=session.createQuery("from Student");
		
		//2. Customise Query Object
//		query.setFirstResult(2);
		
		//3. Execute Query
		List<Student> students=query.list();
		for(Student stud:students){
			System.out.println(stud);
		}
		System.out.println("=================");
		System.out.println("Selection List");
		System.out.println("=================");
		
		Query query1=session.createQuery("from Student where standard=:std or address=:add");
		query1.setParameter("std", "XII");
		query1.setParameter("add", "Banglore");
		List<Student> studList=query1.list();
		
		studList.stream()
		.forEach(System.out::println);
		
		System.out.println("=================");
		System.out.println("Projection List");
		System.out.println("=================");
		Query query2=session.createQuery("select rollNo,name from Student");
		
		List<Object[]> myList=query2.list();
		for(Object[] arr:myList){
			for(Object element:arr){
				System.out.print(element+" ");
			}
			System.out.println();
		}
		
		System.out.println("=================");
		System.out.println("Selection as well as Projection List");
		System.out.println("=================");
		Query query3=session.createQuery("select name,standard from Student where address=:addr");
		query3.setParameter("addr", "Banglore");
		
		List<Object[]> myList1=query3.list();
		for(Object[] arr:myList1){
			for(Object element:arr){
				System.out.print(element+" ");
			}
			System.out.println();
		}
		
		System.out.println("=================");
		System.out.println("Group By ,having and  order By Clause");
		System.out.println("=================");
		
		Query query4=session.createQuery("select address,count(s) "
				+ "from Student s "
				+ "group by address "
				+ "having count(s)>1 "
				+ "order by address");
		List<Object[]> myList3=query4.list();
		
		for(Object[] arr:myList3){
			for(Object element:arr){
				System.out.print(element+" ");
			}
			System.out.println();
		}
		
		
		transaction.commit();

		session.close();


	}

}
