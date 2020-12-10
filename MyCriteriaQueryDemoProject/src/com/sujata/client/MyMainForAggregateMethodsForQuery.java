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

public class MyMainForAggregateMethodsForQuery {

	public static void main(String[] args) {
		StandardServiceRegistry standardServiceRegistry = new StandardServiceRegistryBuilder()
				.configure("hibernate.cfg.xml").build();
		Metadata metadata = new MetadataSources(standardServiceRegistry).getMetadataBuilder().build();

		SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();

		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		CriteriaBuilder builder = session.getCriteriaBuilder();

		CriteriaQuery<Long> criteria1 = builder.createQuery(Long.class);

		Root<Student> root = criteria1.from(Student.class);
		criteria1.select(builder.count(root));
		

		TypedQuery<Long> query = session.createQuery(criteria1);

		Long totalStudents = query.getSingleResult();
		System.out.println("Total No of Records : "+totalStudents);
				
		transaction.commit();

		session.close();

	}

}
