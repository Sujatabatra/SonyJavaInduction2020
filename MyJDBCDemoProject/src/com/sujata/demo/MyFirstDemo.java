package com.sujata.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyFirstDemo {

	public static void main(String[] args) {
		
		Connection connection=null;
		Statement statement=null;
		try {
			//1. Connect
			//1.1 Register the driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//1.2 Connect to DataBase
			connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "sujata");
			
			//2 Query
			statement=connection.createStatement();
			//executeQuery: DQL Statements
			ResultSet resultSet=statement.executeQuery("select * from employee");
			
			//3.Process Result
			while(resultSet.next()){
				int eId=resultSet.getInt("ID");
				String eName=resultSet.getString("NAME");
				String desig=resultSet.getString("DESIGNATION");
				String deptt=resultSet.getString("DEPARTMENT");
				double sal=resultSet.getDouble("SALARY");
				System.out.println(eId+" "+eName+" "+desig+" "+deptt+" "+sal);
				
			}
			
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
