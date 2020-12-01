package com.sujata.model.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sujata.model.bean.Employee;
import com.sujata.model.dao.EmployeeDao;
import com.sujata.model.dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao employeeDao = new EmployeeDaoImpl();

	@Override
	public Employee searchEmployeeById(int id)throws ClassNotFoundException,SQLException {
		Employee employee=employeeDao.getRecord(id);
		if(employee!=null)
			return convertUpperCase(employee);
		return employee;
	}

	@Override
	public List<Employee> getAllEmployees()throws ClassNotFoundException,SQLException {
		ArrayList<Employee> employees=new ArrayList<>();
		for(Employee employee:employeeDao.getAllRecords()){
			employees.add(convertUpperCase(employee));
		}
		return employees;
	}

	@Override
	public int insertEmployee(Employee employee) throws ClassNotFoundException,SQLException{
		return employeeDao.insertRecord(employee);

	}

	public double calculateNetSalary(Employee employee)throws ClassNotFoundException,SQLException{
		Employee emp=employeeDao.getRecord(employee.getEmpId());
		double allowances=0.10*emp.getEmpSalary();
		double deductions=0.08*emp.getEmpSalary();
		double netsalary=emp.getEmpSalary()+allowances-deductions;
		return netsalary;
	}
	private Employee convertUpperCase(Employee employee){
		employee.setEmpName(employee.getEmpName().toUpperCase());
		employee.setEmpDesig(employee.getEmpDesig().toUpperCase());
		employee.setEmpDeptt(employee.getEmpDeptt().toUpperCase());
		return employee;
	}
}
