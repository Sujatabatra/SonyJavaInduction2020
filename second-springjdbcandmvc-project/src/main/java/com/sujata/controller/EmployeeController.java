package com.sujata.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sujata.bean.Employee;
import com.sujata.service.EmployeeService;

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
	public ModelAndView insertEmpPageController(){
		
		return new ModelAndView("addEmp", "emp", new Employee());	
	}
	
	@ModelAttribute("empIds")
	public List<Integer> getemployeeIds(){
		List<Employee> employees=empService.getAllEmployees();
		List<Integer> empIds=new ArrayList<>();
		empIds=employees.stream().map(Employee::getEmpId).collect(Collectors.toList());
		return empIds;
	}
	@ModelAttribute("departments")
	public List<String> getDepartmentList(){
		List<String> departments=new ArrayList<String>();
		departments.add("IT");
		departments.add("Sales");
		departments.add("Marketing");
		departments.add("HR");
		departments.add("Purchase");
		return departments;
	}
	
	@ModelAttribute("designations")
	public List<String> getDesignationList(){
		List<String> designation=new ArrayList<String>();
		designation.add("Assoicate");
		designation.add("Sr. Associate");
		designation.add("Manager");
		designation.add("Sr. Manager");
		designation.add("Executive");
		designation.add("Sr. Executive");
		return designation;
	}
	@RequestMapping("/addEmployee")
	public ModelAndView addEmployeeController(@ModelAttribute Employee emp){
		ModelAndView mv=new ModelAndView();
		
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
	public ModelAndView AcceptEmpIdPageController(){
		return new ModelAndView("acceptEmpIdForDelete", "command", new Employee());
	}
	
	@RequestMapping("/acceptIdForSearch")
	public String AcceptEmpIdPageCtrl(){
		return "acceptEmpIdForSearch";
	}
	
//	@RequestMapping("/deleteEmployee")
//	public ModelAndView deleteEmployeeById(@ModelAttribute Employee employee){
//		ModelAndView mv=new ModelAndView();
//		String message=null;
//		if(empService.deleteEmployee(employee.getEmpId())>0)
//			message="Employee Deleted Succesfully!";
//		else
//			message="Employee Not Deleted";
//		mv.addObject("message", message);
//		mv.setViewName("acknowlegment");
//		return mv;
//	}
	
	@RequestMapping("/searchEmployee")
	public ModelAndView searchEmployeeController(HttpServletRequest req){
		ModelAndView mv=new ModelAndView();
		
		Employee emp=empService.searchEmployeeById(Integer.parseInt(req.getParameter("id")));
		mv.addObject("employee", emp);
		mv.setViewName("showEmp");
		return mv;
	}
}
