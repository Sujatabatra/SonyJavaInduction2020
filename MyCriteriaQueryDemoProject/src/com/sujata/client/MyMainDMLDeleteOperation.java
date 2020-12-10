package com.sujata.client;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaDelete;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.CriteriaUpdate;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.sujata.bean.Student;

public class MyMainDMLDeleteOperation {

	public static void main(String[] args) {
		StandardServiceRegistry standardServiceRegistry = new StandardServiceRegistryBuilder()
				.configure("hibernate.cfg.xml").build();
		Metadata metadata = new MetadataSources(standardServiceRegistry).getMetadataBuilder().build();

		SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();

		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		CriteriaBuilder builder = session.getCriteriaBuilder();

		CriteriaDelete<Student> criteriaDelete = builder.createCriteriaDelete(Student.class);
		
		Root<Student> root = criteriaDelete.from(Student.class);
		
		
		criteriaDelete.where(builder.equal(root.get("rollNo"),4));

		Query query = session.createQuery(criteriaDelete);

		int rows = query.executeUpdate();
		if (rows > 0)
			System.out.println(rows + " rows deleted!");
		else
			System.out.println("Deletion failed!");
		transaction.commit();

		session.close();

	}

}
