package com.sujata.consumer;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.sujata.producer.Greet;

public class App {
	public static void main(String[] args) {
		
		Resource resource = new ClassPathResource("greet.xml");
		// We need not to create objects but life cycle of producer component
		// will be maintained by spring container, i.e the object of BeanFactory
		BeanFactory springContainer = new XmlBeanFactory(resource);
		
		Greet greet1=(Greet)springContainer.getBean("eve");
		greet1.wish("Sujata");
	}
}
