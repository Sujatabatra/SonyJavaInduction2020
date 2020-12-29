package com.sujata.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.sujata.bean.Employee;
import com.sujata.service.EmpService;

@Controller
@SessionAttributes({"emp","emps"})
public class EmpController {

	@Autowired
	private EmpService empService;
	
	@RequestMapping("/")
	public String mainPage(){
		return "index";
	}
	
	@RequestMapping("/getEmpId")
	public String inputPageController(){
		return "enterId";
	}
	
	@RequestMapping("/search")
	public ModelAndView searchEmpByIdController(@RequestParam("eid")int id/*,HttpSession session*/){
		ModelAndView mv=new ModelAndView();
		Employee employee=empService.getEmployee(id);
		mv.addObject("emp", employee);
//		session.setAttribute("emp", employee);
		mv.setViewName("showEmp");
		return mv;
	}
	
	@RequestMapping("/allEmps")
	public ModelAndView getAllEmpsController(){
		ModelAndView mv=new ModelAndView();
		List<Employee> employees=empService.getAllEmployees();
		mv.addObject("emps", employees);
		mv.setViewName("showAllEmps");
		return mv;
	}
}
