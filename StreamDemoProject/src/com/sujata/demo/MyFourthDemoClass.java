package com.sujata.demo;

import java.util.stream.Stream;

public class MyFourthDemoClass {

	public static void main(String[] args) {
		
		Stream.iterate(0, n->n+2)
		.limit(5)
		.forEach(System.out::println);
		System.out.println("==============");
		Stream.iterate(new int[]{0,1}, t->new int[]{t[1],t[0]+t[1]})
		.limit(7)
		.map(t->t[0])
		.forEach(System.out::print);
		
	}

}
