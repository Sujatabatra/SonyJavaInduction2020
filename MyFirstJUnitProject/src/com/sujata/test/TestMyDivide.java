package com.sujata.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestMyDivide {

	@BeforeClass
	public static void globalInit() throws Exception {
		System.out.println("Hi I am setup Before Class");
	}

	@AfterClass
	public static void globalDestroy() throws Exception {
		System.out.println("Hi I am tear down after class");
	}

	@Before
	public void init() throws Exception {
		System.out.println("Hi i am setup");
	}

	@After
	public void destroy() throws Exception {
		System.out.println("Hi I am teardown");
	}

	@Test
	public void testDivide1() {
		System.out.println("Hi I am test case 1");
	}
	
	@Test
	public void testDivide2() {
		System.out.println("Hi I am test case 2");
	}

}


