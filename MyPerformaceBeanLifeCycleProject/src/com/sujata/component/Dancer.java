package com.sujata.component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;

import com.sun.xml.internal.bind.annotation.OverrideAnnotationOf;

public class Dancer implements Performer,BeanNameAware,InitializingBean,DisposableBean{

	private String beanName;
	private String style;
	
	
	public Dancer()
	{
		System.out.println("1. Hi I am dancer class constructor");
	}
	public void setStyle(String style) {
		System.out.println("2. Hi I am setter method");
		this.style = style;
	}

	@Override
	public void perform() {
		System.out.println(beanName+" is dancing in "+style+" Style");

	}

	@Override
	public void setBeanName(String arg0) {
		System.out.println("3. Hi I am setBeanName method from BeanNameAware");
		beanName=arg0;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("5. Hi I am afterPropertiesSet Method from InitiakizingBean Interface");
		
	}
	
	public void myCustomInit() {
		System.out.println("6. Hi I am custom init method from Dancer class");
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("Hi I am DisposableBean destroy() method");
		
	}
	
	public void myCustomDestroy() {
		System.out.println("Hi I am custom destroy method from Dancer class");
	}
	
	

}
