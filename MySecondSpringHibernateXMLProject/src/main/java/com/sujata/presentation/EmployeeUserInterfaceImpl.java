package com.sujata.presentation;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.sujata.bean.Employee;
import com.sujata.service.EmployeeService;
import com.sujata.service.EmployeeServiceImpl;
import com.sujata.util.EmployeeHelper;

public class EmployeeUserInterfaceImpl implements EmployeeUserInterface {

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
		System.out.println("4. Delete Record By ID ");
		System.out.println("5. Update name of Employee");
		System.out.println("6. EXIT");

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
				System.out.println("Enter employee if whoes record you want to delete : ");
				int id1=scanner.nextInt();
				if(employeeService.deleteEmployee(id1)>0)
					System.out.println("Record Deleted!");
				else
					System.out.println("Record not Deleted!");
				break;
			case 5:
				System.out.println("Enter employee if whoes record you want to update : ");
				int id2=scanner.nextInt();
				System.out.println("Enter new employee name : ");
				String name=scanner.next();
				if(employeeService.updateEmployee(id2,name)>0)
					System.out.println("Record updated!");
				else
					System.out.println("Record not update!");
				break;
			case 6:
				System.out.println("GOOD BYE , HAVE A NICE DAY!!");
				System.exit(0);
				break;

			default:
				break;
			}
		
	}

}
