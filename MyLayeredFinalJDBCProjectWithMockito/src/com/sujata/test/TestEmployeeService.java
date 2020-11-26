package com.sujata.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import static org.mockito.Mockito.when;

import java.sql.SQLException;

import com.sujata.bean.Employee;
import com.sujata.dao.EmployeeDao;
import com.sujata.service.EmployeeService;
import com.sujata.service.EmployeeServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class TestEmployeeService {

	@InjectMocks
	private EmployeeService empService=new EmployeeServiceImpl();
	
	@Mock
	private EmployeeDao empDao;

	@Test
	public void testSearchEmployeeById() {
		
		Employee emp=new Employee(10, "Charu", "Associate", "IT", 12345);
		try {
			when(empDao.getRecord(10)).thenReturn(emp);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		try {
			assertEquals(emp, empService.searchEmployeeById(10));
		} catch (ClassNotFoundException | SQLException e1) {
			
			e1.printStackTrace();
		}
		
	}

}
