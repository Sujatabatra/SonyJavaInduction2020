package com.sujata.component;


import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("Ganesh")
public class Dancer implements Performer,BeanNameAware {

	@Value("Hip Hop")
	private String style;
	private String name;

	public void setStyle(String style) {
		this.style = style;
	}

	@Override
	public void perform() {
		System.out.println(name+" is dancing in " + style + " style!");

	}

	@Override
	public void setBeanName(String arg0) {
		this.name=arg0;
		
	}

}
