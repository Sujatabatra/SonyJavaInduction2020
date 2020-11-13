package com.sujata.generics;
/*
 * create a class which is independent of any of the object type
 */
public class GenericInput<T> {

	private T value;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	
}
