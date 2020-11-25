package com.sujata.test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.sujata.demo.Operation;

@RunWith(Parameterized.class)
public class ParametriziedTestOperation {

	private Operation operation;
	
	private int number1;
	private int number2;
	private String operator;
	private int result;
	
	public ParametriziedTestOperation(int number1, int number2, String operator, int result) {
		super();
		this.number1 = number1;
		this.number2 = number2;
		this.operator = operator;
		this.result = result;
	}
	
	@Parameterized.Parameters
	public static Collection values(){
		return Arrays.asList(new Object[][]{
			{10,20,"add",30},
			{10,20,"difference",-10},
			{10,20,"multiply",200},
			{20,10,"divide",2}
		});
	}

	@Test
	public void testPerform() {
		operation.setNumber1(number1);
		operation.setNumber2(number2);
		operation.setOp(operator);
		operation.perform();
		assertEquals(result, operation.getResult());
	}
	
	@Before
	public void setUp() throws Exception {
		operation=new Operation();
	}

	@After
	public void tearDown() throws Exception {
		operation=null;
	}

	

	
	
}
