package com.sujata.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sujata.bean.Employee;
import com.sujata.service.EmployeeService;

@RestController
public class EmplResource {

	@Autowired
	private EmployeeService empService;
	

	@RequestMapping(path="/empls/{eid}",method=RequestMethod.GET)
	public ResponseEntity resourceForSearchById(@PathVariable("eid") int id){
		
		Employee emp=empService.searchEmployeeById(id);
		return new ResponseEntity(emp,HttpStatus.OK);
	}
	

	@RequestMapping(path="/empls",method=RequestMethod.GET)
	public List<Employee> resourceForAllEmployees(){
		return empService.getAllEmployees();
	}
	

	@RequestMapping(path="empls",method=RequestMethod.POST)
	public Employee resourceForAddingEmployee(@RequestBody Employee employee){
		return empService.insertEmployee(employee);
	}
	

	@RequestMapping(path="/empls/{eid}",method=RequestMethod.DELETE)
	public Employee resourceForDeleteEmployee(@PathVariable("eid") int id){
		return empService.deleteEmployee(id);
	}
	

	@RequestMapping(path="/empls/{eid}/{name}",method=RequestMethod.PUT)
	public Employee resourceForUpdateEmployee(@PathVariable("eid") int id, @PathVariable("name") String name){
		return empService.updateEmployee(id, name);
	}
}
