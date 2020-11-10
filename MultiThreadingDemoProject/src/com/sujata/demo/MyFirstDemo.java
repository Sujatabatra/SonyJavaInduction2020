package com.sujata.demo;

class MyFirstThread extends Thread{
	
	public MyFirstThread(){
		
	}
	
	public MyFirstThread(String name){
		super(name);
	}
	//method which will execute when read is in running state
	public void run(){
		for(int i=1;i<=5;i++){
			System.out.println(Thread.currentThread().getName()+ " i : "+i);
		}
		System.out.println("Good Bye from "+Thread.currentThread().getName());
	}
	
}



public class MyFirstDemo {

	public static void main(String[] args) {
		//main thread parent is JVM
		//New Born State (threadOne is a child thread of main Thread)
		MyFirstThread threadOne=new MyFirstThread(); //Thread-0 is starting if you are not supplying any name , thread get these names in constructors
		MyFirstThread threadTwo=new MyFirstThread("First"); //Thread-1 
		MyFirstThread threadThree=new MyFirstThread("someThread"); //Thread-2
		MyFirstThread threadFour=new MyFirstThread();
		
		threadOne.setName("One");
		
		//ready or running
		threadOne.start();
		threadTwo.start();
		threadThree.start();
		threadFour.start();
		
		for(int i=1;i<=5;i++){
			System.out.println(Thread.currentThread().getName()+ " i : "+i);
		}
		System.out.println("Good Bye from "+Thread.currentThread().getName());
	}

}
