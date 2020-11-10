package com.sujata.demo;

class Base{
	private int n;

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	
}

class Derived extends Base implements Runnable{
	private int value;
	
	public Derived(int value) {
		super();
		this.value = value;
	}

	public void myLoop(){
		setN(value);
		for(int i=1;i<=getN();i++){
			System.out.println(Thread.currentThread().getName()+" i : "+i);
		}
		System.out.println("Good Bye from "+Thread.currentThread().getName()+" !!!");
	}

	//Job of a Thread
	@Override
	public void run() {
		myLoop();
		
	}
}

public class MyFourthDemo {

	//main Thread
	public static void main(String[] args) {
		//job being performed by thread
		Derived threadJob1=new Derived(5);
		//New Born Thread
		Thread threadOne=new Thread(threadJob1);
		Thread threadTwo=new Thread(threadJob1,"Second");
		Thread threadThree=new Thread(threadJob1);
		
//		threadTwo.setName("Second");
		
		threadOne.start();
		threadTwo.start();
		threadThree.start();
		
		
		
		for(int i=1;i<=4;i++){
			System.out.println(Thread.currentThread().getName()+" i : "+i);
		}
		System.out.println("Good Bye from "+Thread.currentThread().getName()+" !!!");

	}

}
