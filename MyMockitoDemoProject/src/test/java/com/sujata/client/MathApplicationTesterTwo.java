package com.sujata.client;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import com.sujata.service.CalculatorService;

public class MathApplicationTesterTwo {

	private MathApplication mathApplication;
	private CalculatorService calculatorService;
	
	@Before
	public void setup(){
		mathApplication=new MathApplication();
		calculatorService=Mockito.mock(CalculatorService.class);
		mathApplication.setCalculatorService(calculatorService);
	}
	
	@Test
	public void testAdd(){
		//adding behaviour to mocked /mimiced services
		when(calculatorService.add(10, 20)).thenReturn(30);
		
		Assert.assertEquals(30, mathApplication.sum(10, 20));
		
		//verify call to calculatorService is made or not with same arguments
		verify(calculatorService).add(10, 20);
		
	}
	
}
