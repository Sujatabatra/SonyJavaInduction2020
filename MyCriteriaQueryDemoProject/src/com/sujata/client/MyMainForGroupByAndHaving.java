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

public class MyMainForGroupByAndHaving {

	public static void main(String[] args) {
		StandardServiceRegistry standardServiceRegistry = new StandardServiceRegistryBuilder()
				.configure("hibernate.cfg.xml").build();
		Metadata metadata = new MetadataSources(standardServiceRegistry).getMetadataBuilder().build();

		SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();

		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		CriteriaBuilder builder = session.getCriteriaBuilder();

		CriteriaQuery<Object[]> criteria1 = builder.createQuery(Object[].class);

		Root<Student> root = criteria1.from(Student.class);
		criteria1.multiselect(root.get("standard"),builder.count(root));
		criteria1.groupBy(root.get("standard"));
		criteria1.having(builder.gt(builder.count(root), 1));
		criteria1.orderBy(builder.asc(root.get("standard")));
		
		

		TypedQuery<Object[]> query = session.createQuery(criteria1);

		List<Object[]> students = query.getResultList();
		for(Object[] studentDetails:students){
			for(Object student:studentDetails){
				System.out.print(student+" ");
			}
			System.out.println(" ");
		}
				
		transaction.commit();

		session.close();

	}

}
