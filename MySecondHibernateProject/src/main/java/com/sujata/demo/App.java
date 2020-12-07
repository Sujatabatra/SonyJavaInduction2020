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
        //get is used to search record wrt to id , if id exist it will return the record otherwise will return null
        Student student=session.get(Student.class, 8);
        System.out.println("Student : "+student);
        
        //load is used to search record wrt to id , if id exist it will return the record otherwise will thrown an exception ObjectNotFoundException
//        Student st1=session.load(Student.class, 7);
//        System.out.println("Student : "+st1);
        
        Student st2=session.get(Student.class, 3);
        if(st2!=null)
        	session.delete(st2);
        else
        	System.out.println("Student does not exist");
        
        
        
        transaction.commit();
        
        session.close();
        
      
        
    }
}
