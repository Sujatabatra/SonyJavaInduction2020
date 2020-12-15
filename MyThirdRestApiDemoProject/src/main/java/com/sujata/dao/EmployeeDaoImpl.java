package com.sujata.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.sujata.bean.Employee;
import com.sujata.util.DBConnection;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public Employee getRecord(int id) throws ClassNotFoundException, SQLException {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		Employee employee = null;

		connection = DBConnection.getConnection();

		preparedStatement = connection.prepareStatement("SELECT * FROM EMPLOYEE WHERE ID=?");
		preparedStatement.setInt(1, id);

		ResultSet resultSet = preparedStatement.executeQuery();

		if (resultSet.next()) {
			int eId = resultSet.getInt("ID");
			String eName = resultSet.getString("NAME");
			String desig = resultSet.getString("DESIGNATION");
			String deptt = resultSet.getString("DEPARTMENT");
			double sal = resultSet.getDouble("SALARY");

			employee = new Employee(eId, eName, desig, deptt, sal);
		}
		connection.close();

		return employee;
	}

	@Override
	public List<Employee> getAllRecords() throws ClassNotFoundException, SQLException {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		Employee employee = null;
		ArrayList<Employee> employees = null;

		connection = DBConnection.getConnection();

		preparedStatement = connection.prepareStatement("SELECT * FROM EMPLOYEE");

		ResultSet resultSet = preparedStatement.executeQuery();
		employees = new ArrayList<>();
		while (resultSet.next()) {
			int eId = resultSet.getInt("ID");
			String eName = resultSet.getString("NAME");
			String desig = resultSet.getString("DESIGNATION");
			String deptt = resultSet.getString("DEPARTMENT");
			double sal = resultSet.getDouble("SALARY");

			employee = new Employee(eId, eName, desig, deptt, sal);

			employees.add(employee);

		}

		connection.close();
		System.out.println("Inside dao:"+employees.size());
		return employees;
	}

	@Override
	public Employee insertRecord(Employee employee) throws ClassNotFoundException, SQLException {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		int rows = 0;

		connection = DBConnection.getConnection();

		preparedStatement = connection.prepareStatement("insert into employee values(?,?,?,?,?)");

		preparedStatement.setInt(1, employee.getEmpId());
		preparedStatement.setString(2, employee.getEmpName());
		preparedStatement.setString(3, employee.getEmpDesig());
		preparedStatement.setString(4, employee.getEmpDeptt());
		preparedStatement.setDouble(5, employee.getEmpSalary());

		rows = preparedStatement.executeUpdate();

		connection.close();
		
		 if(rows>0)
			 return employee;
		 return null;
	}

	@Override
	public Employee deleteRecord(int id) throws ClassNotFoundException, SQLException {

		Connection connection = null;
		PreparedStatement preparedStatement = null;
		int rows = 0;

		connection = DBConnection.getConnection();
		Employee employee = null;
		employee = getRecord(id);
		if (employee != null) {
			preparedStatement = connection.prepareStatement("delete from employee where id=?");

			preparedStatement.setInt(1, employee.getEmpId());

			preparedStatement.executeUpdate();
		}
		connection.close();

		return employee;
	}

	@Override
	public Employee modifyRecord(int id, Employee newEmployee) throws ClassNotFoundException, SQLException {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		int rows = 0;

		connection = DBConnection.getConnection();
		Employee employee = null;
		
		
			preparedStatement = connection.prepareStatement("update employee set name=?,designation=?,department=?,salary=? where id=?");

			preparedStatement.setString(1, newEmployee.getEmpName());
			preparedStatement.setString(2, newEmployee.getEmpDesig());
			preparedStatement.setString(3, newEmployee.getEmpDeptt());
			preparedStatement.setDouble(4, newEmployee.getEmpSalary());
			preparedStatement.setInt(5, id);

			rows=preparedStatement.executeUpdate();
		
			if(rows>0){
				employee = getRecord(id);
			}
		connection.close();

		return employee;

	}

}
