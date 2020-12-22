package com.sujata.model.service;


import java.util.ArrayList;
import java.util.List;


import org.springframework.stereotype.Service;

import com.sujata.model.bean.Employee;
import com.sujata.model.dao.EmployeeDao;

@Service
public class EmployeeServiceImpl implements EmployeeService {

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

	@Override
	public int deleteEmployee(int id) {
		return employeeDao.deleteRecord(id);
	}

	@Override
	public int updateEmployee(int id, String name) {
		return employeeDao.updateRecord(id, name);
	}
}
