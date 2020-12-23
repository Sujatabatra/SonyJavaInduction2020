package com.sujata.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sujata.model.bean.NumbersBean;
import com.sujata.model.service.CalculatorService;

@Controller
public class CalculatorController {

	@Autowired
	private CalculatorService calService;

	@RequestMapping("/")
	public ModelAndView mainController() {
		return new ModelAndView("index", "numbers", new NumbersBean());
	}

	// @RequestMapping("/perform")
	// public ModelAndView performOperation(@ModelAttribute NumbersBean numbers,HttpServletRequest req){
	// ModelAndView mv=new ModelAndView();
	// String op=req.getParameter("operator");
	// return mv;
	// }

	@RequestMapping("/perform")
	public ModelAndView performOperation(@ModelAttribute NumbersBean numbers, @RequestParam("operator") String op) {
		ModelAndView mv = new ModelAndView();
		int result = 0;
		String message=null;
		switch (op) {
		case "Add":
			result = calService.sum(numbers);
			message="Addition";
			break;
		case "Difference":
			result = calService.subtract(numbers);
			message="Difference";
			break;
		case "Product":
			result = calService.multiply(numbers);
			message="Product";
			break;
		case "Divide":
			result = calService.divide(numbers);
			message="Division";
			break;
		}
		mv.addObject("result", result);
		mv.addObject("message", message);
		mv.setViewName("result");
		return mv;
	}
}
