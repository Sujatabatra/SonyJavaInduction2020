package com.sujata.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.sujata.bean.Employee;

@Service
public class EmpServiceImpl implements EmpService {

	@Autowired
	RestTemplate restTemplate;
	
	@Override
	public Employee getEmployee(int id) {
		return restTemplate.getForObject("http://localhost:8086/employees/"+id,Employee.class);
	}

	@Override
	public List<Employee> getAllEmployees() {
		
		return restTemplate.getForObject("http://localhost:8086/employees/",List.class);
	}
	

}
