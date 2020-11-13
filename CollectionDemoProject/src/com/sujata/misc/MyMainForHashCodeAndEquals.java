package com.sujata.misc;

public class MyMainForHashCodeAndEquals {

	public static void main(String[] args) {
		Person p1=new Person(101,"ABC");
		Person p2=new Person(101,"ABC");
		if(p1.equals(p2)){
			System.out.println("p1 and p2 are equal");
		}
		else{
			System.out.println("p1 and p2 are not equal");
		}
		
		System.out.println("hashcode of p1 :"+p1.hashCode());
		System.out.println("hashcode of p2 :"+p2.hashCode());
		
		//as p1 and p2 are not pointing to same address in heap
		if(p1==p2){
			System.out.println("p1 and p2 references are same");
		}
		else{
			System.out.println("p1 and p2 references are different");
		}

	}

}
