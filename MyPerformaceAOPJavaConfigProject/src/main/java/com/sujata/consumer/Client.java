package com.sujata.consumer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sujata.component.Performer;

public class Client {

	public static void main(String[] args) {

		ApplicationContext springContainer = new AnnotationConfigApplicationContext(PerformanceConfig.class);
		Performer p1 = (Performer) springContainer.getBean("Ganesh");

		p1.perform();

		System.out.println("=============================");

		Performer p2 = (Performer) springContainer.getBean("Manju");
		p2.perform();

	}

}
