package com.sujata.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.sujata.demo.Operation;

public class TestOperation {

	private Operation operation;
	@Before
	public void setUp() throws Exception {
		operation=new Operation();
	}

	@After
	public void tearDown() throws Exception {
		operation=null;
	}

	@Test
	public void testPerform1() {
		operation.setNumber1(10);
		operation.setNumber2(20);
		operation.setOp("add");
		operation.perform();
		assertEquals(30, operation.getResult());
	}

	@Test
	public void testPerform2() {
		operation.setNumber1(10);
		operation.setNumber2(20);
		operation.setOp("difference");
		operation.perform();
		assertEquals(-10, operation.getResult());
	}
	
	@Test
	public void testPerform3() {
		operation.setNumber1(10);
		operation.setNumber2(20);
		operation.setOp("multiply");
		operation.perform();
		assertEquals(200, operation.getResult());
	}
	
	@Test
	public void testPerform4() {
		operation.setNumber1(20);
		operation.setNumber2(10);
		operation.setOp("divide");
		operation.perform();
		assertEquals(2, operation.getResult());
	}
	
	@Test(expected=ArithmeticException.class)
	public void testPerform5() {
		operation.setNumber1(10);
		operation.setNumber2(0);
		operation.setOp("divide");
		operation.perform();
		assertEquals(0, operation.getResult());
	}
}
