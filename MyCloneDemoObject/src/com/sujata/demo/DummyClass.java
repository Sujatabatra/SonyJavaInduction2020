package com.sujata.demo;

import com.sujata.training.Base;

class Derived extends Base{
	void display(){
		System.out.println("Display");
	}
	public void show(){
		super.show();
	}
}

public class DummyClass {

	public static void main(String[] args) {
		Derived d=new Derived();
		d.show();

	}

}
