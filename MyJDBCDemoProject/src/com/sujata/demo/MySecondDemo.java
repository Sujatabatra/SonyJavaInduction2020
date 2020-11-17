package com.sujata.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.Scanner;

public class MySecondDemo {

	public static void main(String[] args) {
		
		Connection connection=null;
		Statement statement=null;
		Scanner scanner=new Scanner(System.in);
		try {
			//1. Connect
			//1.1 Register the driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//1.2 Connect to DataBase
			connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "sujata");
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
			
			//2 Query
			statement=connection.createStatement();
			String query="Insert into employee values("+eId+",'"+eName+"','"+desig+"','"+deptt+"',"+sal+")";
			System.out.println(query);
			//executeUpdate/execute: DML Statements
			int rows=statement.executeUpdate(query);
			
			//3.Process Result
			if(rows>0)
				System.out.println("Record Inserted!");
			else
				System.out.println("Record Not Inserted!");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		catch(SQLException exception){
			exception.printStackTrace();
		}
		finally{
			//4. Close
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
