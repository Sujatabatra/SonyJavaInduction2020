package com.sujata.client;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;

import com.sujata.service.CalculatorService;

@RunWith(MockitoJUnitRunner.class)
public class MathApplicationTester {

	@InjectMocks
	MathApplication mathApplication=new MathApplication();
	
	//Mimic service
	@Mock
	CalculatorService calculatorService;
	
	@Test
	public void testAdd(){
		//adding behaviour to mocked /mimiced services
		when(calculatorService.add(10, 20)).thenReturn(30);
		
		Assert.assertEquals(30, mathApplication.sum(10, 20));
		
		//verify call to calculatorService is made or not with same arguments
		verify(calculatorService).add(10, 20);
		
	}
	
}
