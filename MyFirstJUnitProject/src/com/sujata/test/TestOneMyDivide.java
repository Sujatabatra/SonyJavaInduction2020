package com.sujata.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.sujata.demo.MyDivide;


public class TestOneMyDivide {

	private MyDivide myDivide;
	@Before
	public void setUp() throws Exception {
		myDivide=new MyDivide();
	}

	@After
	public void tearDown() throws Exception {
		myDivide=null;
	}

	@Test
	public void testDivide1() {
		assertEquals(5, myDivide.divide(10, 2));
	}
	
	@Test
	public void testDivide2() {
		assertEquals(0, myDivide.divide(10, -2));
	}
	
	@Test
	public void testDivide3() {
		Assert.assertEquals(0, myDivide.divide(-10, 2));
	}
	
	@Test
	public void testDivide4() {
		Assert.assertEquals(0, myDivide.divide(-10, -5));
	}
	
	@Test(expected=ArithmeticException.class)
	public void testDivide5() {
		Assert.assertEquals(0, myDivide.divide(10, 0));
	}
	
	@Test
	public void testDivide6() {
		Assert.assertEquals(0, myDivide.divide(0,4));
	}
	
	@Ignore
	@Test
	public void testDivide7() {
		assertEquals(0, myDivide.divide(0, 0));
	}
	
	@Test
	public void testWish1(){
		assertEquals("Hi", myDivide.wish("Sujata"));
	}

	@Ignore
	@Test
	public void testWish2(){
		assertEquals(null, myDivide.wish("Sujata Batra"));
	}
	
	@Test
	public void testWish3(){
		assertEquals(null, myDivide.wish(null));
	}
	
	@Test(timeout=2000)
	public void testWish4(){
		assertEquals("Hello", myDivide.wish("Batra"));
	}
	
}
