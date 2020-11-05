package com.sujata.onedarray;

public class OneDArrayClass {

	private int array[];
	private int totalElements;
	
	public OneDArrayClass(int totalElements){
		this.totalElements=totalElements;
		array=new int[this.totalElements];
	}

	public int getTotalElements() {
		return totalElements;
	}
	
	public void input(int element, int location){
		array[location]=element;
	}
	
	public int getElementByLocation(int location){
		return array[location];
	}
}
