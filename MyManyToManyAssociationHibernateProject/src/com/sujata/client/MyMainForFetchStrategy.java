package com.sujata.client;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.sujata.bean.Employee;
import com.sujata.bean.Project;


public class MyMainForFetchStrategy {

	public static void main(String[] args) {
StandardServiceRegistry standardServiceRegistry=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        
        Metadata metadata=new MetadataSources(standardServiceRegistry).getMetadataBuilder().build();
        
        SessionFactory sessionFactory=metadata.getSessionFactoryBuilder().build();
        
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        
       Project p=session.get(Project.class, 222);
       System.out.println("Project name :"+p.getpName());
        transaction.commit();        
        session.close();

	}

}
