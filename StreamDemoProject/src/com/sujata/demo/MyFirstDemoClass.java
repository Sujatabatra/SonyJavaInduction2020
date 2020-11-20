package com.sujata.demo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MyFirstDemoClass {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(11,21,31,41,52,11,21,67);
		
		System.out.println(list.stream().count());
		System.out.println("=================");
		
//		list.stream()
//		.forEach(ele->System.out.println(ele));
		
		
		list.stream()
		.forEach(System.out::println);
		
		System.out.println("=================");
		
		list.stream()
		.map(element->element+2)
		.forEach(System.out::println);
		
		System.out.println("=============================");
		
		list.stream()                     //datasource
		.filter(element->element%2==0)    //intermediate operation
		.limit(2)
		.map(ele->ele+5)                 //intermediate operation
		.forEach(System.out::println);    //terminal operation
		
		System.out.println("==================");
		list.stream()
		.distinct()
		.forEach(System.out::println);

		
		System.out.println(list.stream()
		.filter(element->element%5==0)
		.findFirst());
		
		Optional<Integer> value=list.stream()
				.filter(element->element%5==0)
				.findFirst();
		
		if(value.isPresent()){
			System.out.println(value.get());
		}
		else{
			System.out.println("No Value available which is completly divisible by 5");
		}
		
	}

}
