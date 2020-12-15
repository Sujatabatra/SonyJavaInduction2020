package com.sujata.client;

import java.util.Scanner;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;



import com.sujata.bean.Employee;



public class MyClient {

	private static final String REST_URI="http://localhost:8085/MyThirdRestApiDemoProject/webapi/json/employees";
	private Client client=ClientBuilder.newClient();
	
	public Employee getJsonEmployee(int id){
		return client.target(REST_URI)
				.path(String.valueOf(id))
				.request(MediaType.APPLICATION_JSON)
				.get(Employee.class);
	}
	public static void main(String[] args) {
		MyClient myClient=new MyClient();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee id : ");
		int id=sc.nextInt();
		Employee emp=myClient.getJsonEmployee(id);
		System.out.println(emp.getEmpName());
		
	}

}
