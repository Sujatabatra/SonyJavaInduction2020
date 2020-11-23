package com.sujata.demo;

public class MyMain {

	public static void main(String[] args) {
		try {
			ColorStore.getColor("blue").addColor();
			ColorStore.getColor("yellow").addColor();
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
		}

	}

}
