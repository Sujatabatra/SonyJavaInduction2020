package com.sujata.consumer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sujata.component.Performer;

public class Client {

	public static void main(String[] args) {

		// springcontainer : maintaining the life cycle : constuctor call(default call
		// to default constructor), setter
		ApplicationContext springContainer = new ClassPathXmlApplicationContext("perform.xml");

		Performer p1 = (Performer) springContainer.getBean("Naveen");

		p1.perform();



	}

}
