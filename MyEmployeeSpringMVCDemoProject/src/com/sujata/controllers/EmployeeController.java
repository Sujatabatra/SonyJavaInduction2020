package com.sujata.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sujata.model.bean.Employee;
import com.sujata.model.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService empService;
	
	@RequestMapping("/")
	public ModelAndView mainController(){
		ModelAndView mv=new ModelAndView();
		mv.setViewName("index");
		return mv;
	}
	
	@RequestMapping("/insert")
	public String insertEmpPageController(){
		return "addEmp";	
	}
	
	@RequestMapping("/addEmployee")
	public ModelAndView addEmployeeController(HttpServletRequest req){
		ModelAndView mv=new ModelAndView();
		Employee emp=new Employee();
		emp.setEmpId(Integer.parseInt(req.getParameter("id")));
		emp.setEmpName(req.getParameter("name"));
		emp.setEmpDesig(req.getParameter("desig"));
		emp.setEmpDeptt(req.getParameter("deptt"));
		emp.setEmpSalary(Double.parseDouble(req.getParameter("salary")));
		String message=null;
		if(empService.insertEmployee(emp)>0)
			message="Employee Record added succesfully!";
		else
			message="Employee Record not added !";
		
		mv.addObject("message", message);
		mv.setViewName("acknowlegment");
		return mv;
	}
	
	@RequestMapping("/allEmployees")
	public ModelAndView showAllEmployeesController(){
		ModelAndView mv=new ModelAndView();
		List<Employee> employees=empService.getAllEmployees();
		mv.addObject("empList", employees);
		mv.setViewName("showAllEmployees");
		return mv;
	}
	
	@RequestMapping("/acceptIdForDel")
	public String AcceptEmpIdPageController(){
		return "acceptEmpIdForDelete";
	}
	
	@RequestMapping("/acceptIdForSearch")
	public String AcceptEmpIdPageCtrl(){
		return "acceptEmpIdForSearch";
	}
	
	@RequestMapping("/deleteEmployee")
	public ModelAndView deleteEmployeeById(HttpServletRequest req){
		ModelAndView mv=new ModelAndView();
		String message=null;
		if(empService.deleteEmployee(Integer.parseInt(req.getParameter("id")))>0)
			message="Employee Deleted Succesfully!";
		else
			message="Employee Not Deleted";
		mv.addObject("message", message);
		mv.setViewName("acknowlegment");
		return mv;
	}
	
	@RequestMapping("/searchEmployee")
	public ModelAndView searchEmployeeController(HttpServletRequest req){
		ModelAndView mv=new ModelAndView();
		
		Employee emp=empService.searchEmployeeById(Integer.parseInt(req.getParameter("id")));
		mv.addObject("employee", emp);
		mv.setViewName("showEmp");
		return mv;
	}
}
