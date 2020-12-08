package com.sujata.client;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.sujata.bean.Husband;
import com.sujata.bean.Wife;



public class MyMain {

	public static void main(String[] args) {
		StandardServiceRegistry standardServiceRegistry = new StandardServiceRegistryBuilder()
				.configure("hibernate.cfg.xml").build();
		Metadata metadata = new MetadataSources(standardServiceRegistry).getMetadataBuilder().build();

		SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();		
		Session session = sessionFactory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
//		Wife w1=new Wife("W001", "Wife 1");
//		Wife w2=new Wife("W002", "Wife 2");
//		Wife w3=new Wife("W003", "Wife 3");
//		Wife w4=new Wife("W004", "Wife 4");
//		
//		Husband h1=new Husband("H001", "Husband 1");
//		Husband h2=new Husband("H002", "Husband 2");
//		Husband h3=new Husband("H003", "Husband 3");
//		Husband h4=new Husband("H004", "Husband 4");
//		h1.setWife(w4);
//		h2.setWife(w3);
//		h3.setWife(w2);
//		h4.setWife(w1);
//		
//		w1.setHusband(h4);
//		w2.setHusband(h3);
//		w3.setHusband(h2);
//		w4.setHusband(h1);
//		
//		session.save(h1);
//		session.save(h2);
//		session.save(h3);
//		session.save(h4);
//		
//		session.save(w1);
//		session.save(w2);
//		session.save(w3);
//		session.save(w4);

		
		Wife wife=session.get(Wife.class, "W001");
//		System.out.println(wife.getWifeId()+" "+wife.getWifeName());
		System.out.println(wife.getWifeId()+" "+wife.getWifeName()+" has husband with name "+wife.getHusband().getHusbandName());
		transaction.commit();

		session.close();

	}

}
