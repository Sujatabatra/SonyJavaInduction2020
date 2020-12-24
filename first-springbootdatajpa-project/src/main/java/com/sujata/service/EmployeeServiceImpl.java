package com.sujata.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sujata.bean.Employee;
import com.sujata.dao.EmployeeDao;


@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	@Override
	public Employee searchEmployeeById(int id){
		return convertUpperCase(employeeDao.findById(id).get());
	}

	@Override
	public List<Employee> getAllEmployees(){
		ArrayList<Employee> employees = new ArrayList<>();
		for (Employee employee : employeeDao.findAll()) {
			employees.add(convertUpperCase(employee));
		}
		return employees;
	}

	@Override
	public int insertEmployee(Employee employee){
		employeeDao.save(employee);
		return 1;

	}

	public double calculateNetSalary(Employee employee){
		Employee emp = employeeDao.findById(employee.getEmpId()).get();
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
		employeeDao.deleteById(id);
		return 1;
	}

	@Override
	public int updateEmployee(int id, String name) {
		employeeDao.updateEmployeeName(id, name);
		return 1;
//		return employeeDao.updateRecord(id, name);
	}
}
