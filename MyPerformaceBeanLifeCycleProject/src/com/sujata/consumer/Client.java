package com.sujata.consumer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sujata.component.Performer;

public class Client {

	public static void main(String[] args) {
		AbstractApplicationContext springContainer=new ClassPathXmlApplicationContext("performance.xml");
		
		springContainer.registerShutdownHook();
		
		Performer p1=(Performer)springContainer.getBean("Ganesh");
		p1.perform();
		
		Performer p2=(Performer)springContainer.getBean("Ganesh");
		p2.perform();
		
		System.out.println("p1 : "+p1);
		System.out.println("p2 : "+p2);
		

	}

}
