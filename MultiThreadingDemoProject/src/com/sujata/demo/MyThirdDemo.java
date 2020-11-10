package com.sujata.demo;

/*
 * Thread methods
 * 1. start()
 * 2. currentThread() ==> static method
 * 3. getName();
 * 4. setName();
 * 5. join()
 */

public class MyThirdDemo {

	public static void main(String[] args) {
		
		MySecondThread threadOne=new MySecondThread(); 
		DemoThread threadThree=new DemoThread();
		MySecondThread threadTwo=new MySecondThread();  
		DemoThread threadFive=new DemoThread("SomeThread");
		DemoThread threadFour=new DemoThread();
		
		
		
		threadOne.start();
		threadTwo.start();
		threadThree.start();
		threadFour.start();
		threadFive.start();
		
		
		for(int i=1;i<=5;i++){
			System.out.println(Thread.currentThread().getName()+ " i : "+i);
		}
		
		try {
			threadTwo.join(); // child thread telling parent wait for me to die before you proceed further
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		System.out.println("Good Bye from "+Thread.currentThread().getName());
	}

}
