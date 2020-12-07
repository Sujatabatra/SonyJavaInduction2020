package com.sujata.demo;

import java.time.LocalDate;

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
        Student st=new Student(1,"AAAAA","Banglore","VII");
        st.setDoj(LocalDate.of(2000, 8, 11));
        
        session.save(st);
        
        transaction.commit();
        
        session.close();
        
      
        
    }
}
