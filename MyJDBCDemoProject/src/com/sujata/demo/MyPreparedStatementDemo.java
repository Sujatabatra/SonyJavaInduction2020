package com.sujata.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.Scanner;

public class MyPreparedStatementDemo {

	public static void main(String[] args) {
		
		Connection connection=null;
		PreparedStatement preparedStatement=null;
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
			preparedStatement=connection.prepareStatement("insert into employee values(?,?,?,?,?)");
			
			preparedStatement.setInt(1, eId);
			preparedStatement.setString(2, eName);
			preparedStatement.setString(3, desig);
			preparedStatement.setString(4, deptt);
			preparedStatement.setDouble(5, sal);
			
			//executeUpdate/execute: DML Statements
			int rows=preparedStatement.executeUpdate();
			
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
