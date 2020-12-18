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

import javax.sql.DataSource;

import com.sujata.bean.Employee;


public class EmployeeDaoImpl implements EmployeeDao {

	private DataSource dataSource;
	
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public Employee getRecord(int id) throws SQLException {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		Employee employee = null;

		connection = dataSource.getConnection();

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
	public List<Employee> getAllRecords() throws SQLException {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		Employee employee = null;
		ArrayList<Employee> employees = null;
		
		connection = dataSource.getConnection();
		
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

		return employees;
	}

	@Override
	public int insertRecord(Employee employee) throws SQLException {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		int rows = 0;

		connection = dataSource.getConnection();
		
		preparedStatement = connection.prepareStatement("insert into employee values(?,?,?,?,?)");

		preparedStatement.setInt(1, employee.getEmpId());
		preparedStatement.setString(2, employee.getEmpName());
		preparedStatement.setString(3, employee.getEmpDesig());
		preparedStatement.setString(4, employee.getEmpDeptt());
		preparedStatement.setDouble(5, employee.getEmpSalary());

		rows = preparedStatement.executeUpdate();

		connection.close();

		return rows;
	}

}
