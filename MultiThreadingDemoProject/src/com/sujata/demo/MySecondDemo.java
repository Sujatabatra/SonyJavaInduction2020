package com.sujata.demo;

class MySecondThread extends Thread{
	
	public MySecondThread(){
		
	}
	
	public MySecondThread(String name){
		super(name);
	}
	public void run(){
		for(int i=1;i<=5;i++){
			System.out.println(Thread.currentThread().getName()+ " i : "+i);
		}
		System.out.println("Good Bye from "+Thread.currentThread().getName());
	}
	
}

class DemoThread extends Thread{
	DemoThread(){
		
	}
	DemoThread(String name){
		super(name);
	}
	public void run(){
		System.out.println("Hello from "+Thread.currentThread().getName());
	}
}

public class MySecondDemo {

	public static void main(String[] args) {
		
		MySecondThread threadOne=new MySecondThread(); 
		DemoThread threadThree=new DemoThread();
		MySecondThread threadTwo=new MySecondThread();  
		DemoThread threadFive=new DemoThread("SomeThread");
		DemoThread threadFour=new DemoThread();
		
		
		
		threadOne.start();
		threadTwo.start();
		threadThree.start();
		
		
		for(int i=1;i<=5;i++){
			System.out.println(Thread.currentThread().getName()+ " i : "+i);
		}
		System.out.println("Good Bye from "+Thread.currentThread().getName());
	}

}
