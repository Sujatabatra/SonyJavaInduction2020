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
@RequestMapping("/ems")
public class EmResource {

	@Autowired
	private EmployeeService empService;
	
	@GetMapping(path="{eid}",produces="application/json")
	public ResponseEntity resourceForSearchById(@PathVariable("eid") int id){
		
		Employee emp=empService.searchEmployeeById(id);
		return new ResponseEntity(emp,HttpStatus.OK);
	}
	
	@GetMapping(path="/")
	public List<Employee> resourceForAllEmployees(){
		return empService.getAllEmployees();
	}
	
	@PostMapping(path="/")
	public Employee resourceForAddingEmployee(@RequestBody Employee employee){
		return empService.insertEmployee(employee);
	}
	
	@DeleteMapping(path="/{eid}")
	public Employee resourceForDeleteEmployee(@PathVariable("eid") int id){
		return empService.deleteEmployee(id);
	}
	
	@PutMapping(path="/{eid}/{name}")
	public Employee resourceForUpdateEmployee(@PathVariable("eid") int id, @PathVariable("name") String name){
		return empService.updateEmployee(id, name);
	}
}
