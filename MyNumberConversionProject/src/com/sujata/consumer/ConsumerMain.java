package com.sujata.consumer;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

import com.dataaccess.webservicesserver.NumberConversion;
import com.dataaccess.webservicesserver.NumberConversionSoapType;

public class ConsumerMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//ServiceName
		NumberConversion numberConversion=new NumberConversion();
		//Binding name
		NumberConversionSoapType conv=numberConversion.getNumberConversionSoap();
		System.out.println("Enter value: ");
		int val=sc.nextInt();
		System.out.println("Dollar : "+conv.numberToDollars(new BigDecimal(val)));
		System.out.println("Enter value to be converted to words : ");
		String value=sc.next();
		System.out.println("Number in words : "+conv.numberToWords(new BigInteger(value)));
		


	}

}
