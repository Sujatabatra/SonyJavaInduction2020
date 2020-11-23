package com.sujata.demo;

public class CloneMainClass {

	public static void main(String[] args) {

		Address addr=new Address(111, "Noida", "UP");
		Employee employee=new Employee(101, "AAAA", 5000);
		employee.setAddress(addr);
		System.out.println("Employee :"+employee);
		employee.setSalary((int)(employee.getSalary()+(employee.getSalary()*0.10)));
		System.out.println("Employee after salary Increment : "+employee);
		
		Employee employee1=null;
		try {
			employee1=(Employee)(employee.clone());
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("==================================");
		System.out.println("Cloned employee1:"+employee1);
		employee1.setSalary(employee1.getSalary()+1000);
		
		Address add=employee1.getAddress();
		add.sethNo(222);
		employee1.setAddress(add);
		System.out.println("================================");
		System.out.println("Employee :"+employee);
		System.out.println("Employee1 :"+employee1);
		
		
		
		System.out.println("=========================");
		System.out.println("DEEP Cloning");

		Address addr1=new Address(111, "Noida", "UP");
		EmployeeWithDeepCloning demployee=new EmployeeWithDeepCloning(101, "AAAA", 5000);
		demployee.setAddress(addr1);
		System.out.println("Employee :"+demployee);
		demployee.setSalary((int)(demployee.getSalary()+(demployee.getSalary()*0.10)));
		System.out.println("Employee after salary Increment : "+demployee);
		
		EmployeeWithDeepCloning demployee1=null;
		try {
			demployee1=(EmployeeWithDeepCloning)(demployee.clone());
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("==================================");
		System.out.println("Cloned employee1:"+demployee1);
		demployee1.setSalary(demployee1.getSalary()+1000);
		
		Address add1=demployee1.getAddress();
		add1.sethNo(222);
		demployee1.setAddress(add1);
		System.out.println("================================");
		System.out.println("Employee :"+demployee);
		System.out.println("Employee1 :"+demployee1);
		

	}

}
