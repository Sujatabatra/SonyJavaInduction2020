package com.sujata.consumer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sujata.component.Performer;

public class Client {

	public static void main(String[] args) {
		ApplicationContext springContainer=new ClassPathXmlApplicationContext("performance.xml");
		
		Performer p1=(Performer)springContainer.getBean("Ganesh");
		p1.perform();

	}

}