package com.sujata.consumer;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.sujata.producer.GoodMorning;
import com.sujata.producer.Greet;

public class App 
{
    public static void main( String[] args )
    {
        Resource resource=new ClassPathResource("wish.xml");
        BeanFactory springContainer=new XmlBeanFactory(resource);
        
        Greet gr=(Greet)springContainer.getBean("mrn");
        gr.wish("Sujata");
        
//        Greet gr1=new GoodMorning();
    }
}
