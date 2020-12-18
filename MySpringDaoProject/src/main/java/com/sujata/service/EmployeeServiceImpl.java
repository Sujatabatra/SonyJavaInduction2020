package com.sujata.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sujata.bean.Employee;
import com.sujata.dao.EmployeeDao;
import com.sujata.dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao employeeDao;

	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	@Override
	public Employee searchEmployeeById(int id) throws SQLException {
		return convertUpperCase(employeeDao.getRecord(id));
	}

	@Override
	public List<Employee> getAllEmployees() throws SQLException {
		ArrayList<Employee> employees = new ArrayList<>();
		for (Employee employee : employeeDao.getAllRecords()) {
			employees.add(convertUpperCase(employee));
		}
		return employees;
	}

	@Override
	public int insertEmployee(Employee employee) throws SQLException {
		return employeeDao.insertRecord(employee);

	}

	public double calculateNetSalary(Employee employee) throws SQLException {
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
