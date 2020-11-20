package com.sujata.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MyThirdDemoClass {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(11,22,33,44,55);
		
		List<Integer> evenList=list.stream()
		.filter(element->element%2==0)
		.collect(Collectors.toList());

		System.out.println(evenList);
		
		int sumEven=list.stream()
				.filter(element->element%2==0)
				.reduce(0, (no1,no2)->no1+no2);
		
		System.out.println("Sum of even Nos : "+sumEven);
		
		
		
	}

}
