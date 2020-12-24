package com.sujata.presentation;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sujata.bean.Employee;
import com.sujata.service.EmployeeService;
import com.sujata.service.EmployeeServiceImpl;
import com.sujata.util.EmployeeHelper;

@Component
public class EmployeeUserInterfaceImpl implements EmployeeUserInterface {

	@Autowired
	private EmployeeService employeeService;

	public EmployeeUserInterfaceImpl(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}

	@Override
	public void shomenu() {
		System.out.println("1. Enter New Employee ");
		System.out.println("2. Search Employee by Employee id  ");
		System.out.println("3. Display All Employees ");
		System.out.println("4. EXIT");

	}

	@Override
	public void performMenu(int choice) {
		Scanner scanner = new Scanner(System.in);
		
			switch (choice) {
			case 1:
				Employee employee1 = EmployeeHelper.getEmployee();

				if (employeeService.insertEmployee(employee1) > 0)
					System.out.println("Employee Added!!");
				else
					System.out.println("Employee not Added!");
				break;
			case 2:
				System.out.println("Enter Employee Id you want to serach for : ");
				int id = scanner.nextInt();
				Employee employee2 = employeeService.searchEmployeeById(id);
				if (employee2 != null) {
					EmployeeHelper.showEmployee(employee2);
					System.out.println(" " + employeeService.calculateNetSalary(employee2));
				} else
					System.out.println("Employee with Employee ID " + id + " does not exist!");
				break;
			case 3:
				List<Employee> employees = employeeService.getAllEmployees();
				for (Employee emp : employees) {
					EmployeeHelper.showEmployee(emp);
					System.out.println(" " + employeeService.calculateNetSalary(emp));
				}
				break;
			case 4:
				System.out.println("GOOD BYE , HAVE A NICE DAY!!");
				System.exit(0);
				break;

			default:
				break;
			}
		
	}

}
