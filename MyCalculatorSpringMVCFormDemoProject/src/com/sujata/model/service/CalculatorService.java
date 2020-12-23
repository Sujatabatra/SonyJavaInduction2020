package com.sujata.model.service;

import com.sujata.model.bean.NumbersBean;

public interface CalculatorService {

	public int sum(NumbersBean numbers);
	public int subtract(NumbersBean numbers);
	public int multiply(NumbersBean numbers);
	public int divide(NumbersBean numbers);
}
