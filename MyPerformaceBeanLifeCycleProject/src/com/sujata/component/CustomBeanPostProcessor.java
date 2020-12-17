package com.sujata.component;

import org.springframework.beans.factory.config.BeanPostProcessor;

public class CustomBeanPostProcessor implements BeanPostProcessor {
	@Override
	 public Object postProcessBeforeInitialization(Object bean,String beanName) {
		 System.out.println("4. Hi I am PostProcessBeforeInitialization "+beanName);
		 return bean;
	 }
	
	@Override
	 public Object postProcessAfterInitialization(Object bean,String beanName) {
		 System.out.println("7. Hi I am PostProcessAfterInitialization "+beanName);
		 return bean;
	 }

}
