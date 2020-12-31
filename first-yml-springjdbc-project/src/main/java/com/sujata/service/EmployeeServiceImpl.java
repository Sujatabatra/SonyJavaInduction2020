package com.sujata.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sujata.bean.Employee;
import com.sujata.dao.EmployeeDao;
import com.sujata.dao.EmployeeDaoImpl;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	@Override
	public Employee searchEmployeeById(int id){
		return convertUpperCase(employeeDao.getRecord(id));
	}

	@Override
	public List<Employee> getAllEmployees(){
		ArrayList<Employee> employees = new ArrayList<>();
		for (Employee employee : employeeDao.getAllRecords()) {
			employees.add(convertUpperCase(employee));
		}
		return employees;
	}

	@Override
	public int insertEmployee(Employee employee){
		return employeeDao.insertRecord(employee);

	}

	public double calculateNetSalary(Employee employee){
		Employee emp = employeeDao.getRecord(employee.getEmpId());
		double allowances = 0.10 * emp.getEmpSalary();
		double deductions = 0.08 * emp.getEmpSalary();
		double netsalary = emp.getEmpSalary() + allowances - deductions;
		return netsalary;
	}

	private Employee convertUpperCase(Employee employee) {
		employee.setEmpName(employee.getEmpName().toUpperCase());
		employee.setEmpDesig(employee.getEmpDesig().toUpperCase());
		employee.setEmpDeptt(employee.getEmpDeptt().toUpperCase());
		return employee;
	}
}
