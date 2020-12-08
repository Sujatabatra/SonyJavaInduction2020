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


public class MyMain {

	public static void main(String[] args) {
StandardServiceRegistry standardServiceRegistry=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        
        Metadata metadata=new MetadataSources(standardServiceRegistry).getMetadataBuilder().build();
        
        SessionFactory sessionFactory=metadata.getSessionFactoryBuilder().build();
        
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        
        Employee emp1=new Employee("E001", "AAAAA");
        Employee emp2=new Employee("E002", "BBBBB");
        Employee emp3=new Employee("E003", "CCCCC");
        Employee emp4=new Employee("E004", "DDDDD");
        Employee emp5=new Employee("E005", "EEEEE");
        Employee emp6=new Employee("E006", "FFFFF");
        
        Project pr1=new Project(111, "Project A");
        Project pr2=new Project(222, "Project B");
        Project pr3=new Project(333, "Project C");
        
        emp1.getProject().add(pr1);
        emp1.getProject().add(pr2);
        
        emp2.getProject().add(pr2);
        emp2.getProject().add(pr3);
        
        
        emp3.getProject().add(pr1);
        emp3.getProject().add(pr3);
        
        emp4.getProject().add(pr1);
        emp4.getProject().add(pr2);
        
        emp5.getProject().add(pr2);
        emp5.getProject().add(pr3);
        
        emp6.getProject().add(pr1);
        emp6.getProject().add(pr2);
        
        
        pr1.getEmployees().add(emp1);
        pr1.getEmployees().add(emp3);
        pr1.getEmployees().add(emp4);
        pr1.getEmployees().add(emp6);
        
        pr2.getEmployees().add(emp1);
        pr2.getEmployees().add(emp2);
        pr2.getEmployees().add(emp4);
        pr2.getEmployees().add(emp5);
        pr2.getEmployees().add(emp6);
        
        pr3.getEmployees().add(emp2);
        pr3.getEmployees().add(emp3);
        pr3.getEmployees().add(emp5);
        
        
        
        session.save(emp1);
        session.save(emp2);
        session.save(emp3);
        session.save(emp4);
        session.save(emp5);
        session.save(emp6);
        
        session.save(pr1);
        session.save(pr2);
        session.save(pr3);
        transaction.commit();        
        session.close();

	}

}
