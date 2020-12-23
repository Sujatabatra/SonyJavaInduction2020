package com.sujata.util;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sujata.bean.Employee;

public class EmployeeRow implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		int eId = rs.getInt("ID");
		String eName = rs.getString("NAME");
		String desig = rs.getString("DESIGNATION");
		String deptt = rs.getString("DEPARTMENT");
		double sal = rs.getDouble("SALARY");

		Employee employee = new Employee(eId, eName, desig, deptt, sal);

		return employee;
	}

}
