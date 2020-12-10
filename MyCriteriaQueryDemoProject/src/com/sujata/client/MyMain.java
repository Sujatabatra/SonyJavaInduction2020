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

import com.sujata.bean.Student;

public class MyMain {

	public static void main(String[] args) {
		StandardServiceRegistry standardServiceRegistry = new StandardServiceRegistryBuilder()
				.configure("hibernate.cfg.xml").build();
		Metadata metadata = new MetadataSources(standardServiceRegistry).getMetadataBuilder().build();

		SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();

		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		CriteriaBuilder builder = session.getCriteriaBuilder();

		CriteriaQuery<Student> criteria1 = builder.createQuery(Student.class);

		Root<Student> root = criteria1.from(Student.class);
		criteria1.select(root);

		TypedQuery<Student> query = session.createQuery(criteria1);

		List<Student> students = query.getResultList();
		for (Student student : students) {
			System.out.println(student);
		}

		System.out.println("===========================================================");
		System.out.println("Selection List as per the students studying in XII standard");
		System.out.println("===========================================================");

		CriteriaQuery<Student> criteria2 = builder.createQuery(Student.class);
		Root<Student> root2 = criteria2.from(Student.class);
		criteria2.select(root).where(builder.equal(root2.get("standard"), "XII"));

		TypedQuery<Student> query2 = session.createQuery(criteria2);

		List<Student> studentList = query2.getResultList();
		for (Student student : studentList) {
			System.out.println(student);
		}

		System.out.println("=====================================================");
		System.out.println("Projection List for fetching student roll no and name");
		System.out.println("=====================================================");

		CriteriaQuery<Object[]> criteria3=builder.createQuery(Object[].class);
		Root<Student> root3=criteria3.from(Student.class);
		criteria3.multiselect(root.get("rollNo"),root.get("name"));
		
		TypedQuery<Object[]> query3=session.createQuery(criteria3);
		List<Object[]> studList=query3.getResultList();
		for(Object[] stud:studList){
			for(Object st:stud){
				System.out.print(st+" ");
			}
			System.out.println("");
		}
		
		
		transaction.commit();

		session.close();

	}

}
