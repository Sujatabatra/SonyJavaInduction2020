package com.sujata.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class App 
{
    public static void main( String[] args )
    {
        StandardServiceRegistry standardServiceRegistry=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        
        Metadata metadata=new MetadataSources(standardServiceRegistry).getMetadataBuilder().build();
        
        //One SessionFactory object for entire application
        SessionFactory sessionFactory=metadata.getSessionFactoryBuilder().build();
        
        //for every transaction we have one session
        Session session=sessionFactory.openSession();
        
        Transaction transaction=session.beginTransaction();
        
        Student student1=new Student("AAAAA", "Bangalore", "V");
        Student student2=new Student("BBBBB", "Chennai", "VII");
        Student student3=new Student("CCCCC", "Pune", "IV");
        Student student4=new Student("DDDDD", "Delhi", "XI");
        
        session.save(student1);
        session.save(student2);
        session.save(student3);
        session.save(student4);
        
        transaction.commit();
        
        session.close();
        
      
        
    }
}
