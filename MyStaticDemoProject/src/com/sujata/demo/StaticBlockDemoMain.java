package com.sujata.demo;

//1. static block is the first block which gets executed when class loads in the memory
//2. before every constructor call instance block will get executed.

// Netra
//1. static block of base
//2. static block of derived
//3. instance block of base
//4. constructor of base
//5.instance blockof derived
//6. constructor of derived


class StaticBlockBase{
	//instance block
	{
		System.out.println("Hi I am instance block of StaticBlockBase class!!!");
	}
	
	//static block
	static{
		System.out.println("Hi I am static block of StaticBlockBase class!!!");
	}
	public StaticBlockBase() {
		System.out.println("Hi I am Constructor of StaticBlockBase class");
	}
}

class StaticBlockDerived extends StaticBlockBase{
	//instance block
	{
		System.out.println("Hi I am instance block of StaticBlockDerived class!!!");
	}
	
	//static block
	static{
		System.out.println("Hi I am static block of StaticBlockDerived class!!!");
	}
	public StaticBlockDerived() {
		System.out.println("Hi I am Constructor of StaticBlockDerived class");
	}
}

public class StaticBlockDemoMain {

	public static void main(String[] args) {
//		StaticBlockBase staticBlockBase1=new StaticBlockBase();
/*
 * 1. static block base
 * 2. instance block of base
 * 3. constructor of base
 *
 * 2. static block of derived
 * 3. instance block of base
 * 4. constructor of base
 * 5.instance blockof derived
 * 6. constructor of derived

 * 
 */
		StaticBlockBase staticBlockBase2=new StaticBlockBase();
		System.out.println("======================");

		StaticBlockDerived staticBlockDerived=new StaticBlockDerived();
	}

}
