package com.sujata.consumer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.sujata.component.Performer;

public class Client {

	public static void main(String[] args) {

		// springcontainer : maintaining the life cycle : constuctor call(default call
		// to default constructor), setter
//		ApplicationContext springContainer = new ClassPathXmlApplicationContext("com/sujata/consumer/performance.xml");

		ApplicationContext springContainer = new FileSystemXmlApplicationContext("D:\\Sony\\workspace\\SpringWorkSpace\\SpringCore\\MyPerformaceSixthProject\\src\\com\\sujata\\consumer\\performance.xml");
		Performer p1 = (Performer) springContainer.getBean("Disha");

		p1.perform();
		System.out.println("======================");
		Performer p2 = (Performer) springContainer.getBean("Naveen");

		p2.perform();

	}

}
