package com.sujata.demo;

public abstract class Color implements Cloneable {

	protected String colorName;
	
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}

	abstract public void addColor();
	
}
