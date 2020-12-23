package com.sujata.model.service;

import org.springframework.stereotype.Service;

import com.sujata.model.bean.NumbersBean;

@Service
public class CalculatorServiceImpl implements CalculatorService {

	@Override
	public int sum(NumbersBean numbers) {
		return numbers.getNumber1()+numbers.getNumber2();
	}

	@Override
	public int subtract(NumbersBean numbers) {
		return numbers.getNumber1()-numbers.getNumber2();
	}

	@Override
	public int multiply(NumbersBean numbers) {
		return numbers.getNumber1()*numbers.getNumber2();
	}

	@Override
	public int divide(NumbersBean numbers) {
		return numbers.getNumber1()/numbers.getNumber2();
	}

}
