package com.sujata.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.sujata.bean.Student;

public class MyClient {

	public static void main(String[] args) {
StandardServiceRegistry standardServiceRegistry=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        
        Metadata metadata=new MetadataSources(standardServiceRegistry).getMetadataBuilder().build();
        
        //One SessionFactory object for entire application
        SessionFactory sessionFactory=metadata.getSessionFactoryBuilder().build();
        
        //for every transaction we have one session
        Session session=sessionFactory.openSession();
        
        Transaction transaction=session.beginTransaction();
        
        Student student1=new Student("AAAAA", "XI");
        
        session.save(student1);
        
        transaction.commit();
        
        session.close();
     

	}

}
 