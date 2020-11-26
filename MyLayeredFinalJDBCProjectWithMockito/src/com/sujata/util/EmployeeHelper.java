package com.sujata.util;

import java.util.Scanner;

import com.sujata.bean.Employee;

public class EmployeeHelper {

	public static Employee getEmployee(){
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Employee ID : ");
		int eId=scanner.nextInt();
		System.out.println("Enter Employee Name : ");
		String eName=scanner.next();
		System.out.println("Enter Employee Designation : ");
		String desig=scanner.next();
		System.out.println("Enter Employee Department : ");
		String deptt=scanner.next();
		System.out.println("Enter Employee Salary : ");
		double sal=scanner.nextDouble();
		Employee employee=new Employee(eId, eName, desig, deptt, sal);
		return employee;
	}
	
	public static void showEmployee(Employee employee){
		System.out.print(employee.getEmpId()+"  "+employee.getEmpName()+" "+employee.getEmpDesig()+" "+employee.getEmpDeptt()+" "+employee.getEmpSalary());
	}
}
