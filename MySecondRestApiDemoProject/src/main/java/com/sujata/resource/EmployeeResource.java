package com.sujata.resource;

import java.sql.SQLException;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.sujata.bean.Employee;
import com.sujata.service.EmployeeService;
import com.sujata.service.EmployeeServiceImpl;

@Path("employees")
public class EmployeeResource {

	private EmployeeService empService = new EmployeeServiceImpl();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Employee> resourceForGetAllEmployees() {

		List<Employee> employees = null;

		try {
			employees = empService.getAllEmployees();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return employees;
	}

	@Path("/{eid}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Employee resourceForSearchByID(@PathParam("eid") int id) {
		Employee employee = null;
		try {
			employee = empService.searchEmployeeById(id);
		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}
		return employee;
	}

	@POST
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.APPLICATION_JSON)
	public String resourceforInsertEmployee(Employee employee) {
		String message = null;
		int rows = 0;
		try {
			rows = empService.insertEmployee(employee);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (rows > 0)
			message = "Employee Added Succesfully";
		else
			message = "Employee not Added1";
		return message;
	}

	@Path("/{eid}")
	@DELETE
	@Produces(MediaType.APPLICATION_JSON)
	public Employee resourceforDeleteEmployee(@PathParam("eid") int id) {
		Employee employee = null;
		try {
			employee = empService.deleteEmployee(id);
		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}
		return employee;

	}

	@Path("/{eid}")
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Employee resourceForModifyEmployee(@PathParam("eid")int id, Employee emp) {
		Employee employee = null;

		try {
			employee = empService.modifyEmployee(id, emp);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return employee;
	}
}
