package com.sujata.resources;

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
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.sujata.bean.Employee;
import com.sujata.service.EmployeeService;
import com.sujata.service.EmployeeServiceImpl;

@Path("/xml/employees")
public class MyXMLResponseResource {

	private EmployeeService empService = new EmployeeServiceImpl();

	@Path("/{eid}")
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public Response resourceForSerachEmpByID(@PathParam("eid") int id) {
		Response response = null;
		Employee employee = null;

		try {
			employee = empService.searchEmployeeById(id);
		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}
		if (employee != null)
			response = Response.status(Status.OK).entity(employee).build();
		else
			response = Response.status(Status.NO_CONTENT).build();

		return response;
	}

	@GET
	@Produces(MediaType.APPLICATION_XML)
	public Response resourceForGetAllEmployees() {
		List<Employee> employees = null;
		Response response = null;
		try {
			employees = empService.getAllEmployees();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		if (employees.size() != 0) {

			GenericEntity<List<Employee>> empListEntity=new GenericEntity<List<Employee>>(employees){};

			response = Response.status(Status.OK).entity(empListEntity).build();
		} else
			response = Response.status(Status.NO_CONTENT).build();
		return response;
	}

	@POST
	@Produces(MediaType.APPLICATION_XML)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response resourceForAddingEmployee(Employee employee) {
		Response response = null;
		Employee emp = null;
		try {
			emp = empService.insertEmployee(employee);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		if (emp != null) {
			response = Response.status(Status.CREATED).entity(emp).build();
		} else {
			response = Response.status(Status.CONFLICT).build(); // or either
																	// 422
																	// entity
																	// not
																	// supported
		}

		return response;
	}

	@DELETE
	@Produces(MediaType.APPLICATION_XML)
	@Path("/{eid}")
	public Response resourceForDeletingEmployee(@PathParam("eid") int id) {
		Response response = null;
		Employee emp = null;
		try {
			emp = empService.deleteEmployee(id);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		if (emp != null)
			response = Response.status(Status.OK).entity(emp).build();
		else
			response = Response.status(Status.NO_CONTENT).build();
		return response;
	}

	@Path("/{eid}")
	@PUT
	@Produces(MediaType.APPLICATION_XML)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response resourceForUpdateEmployee(@PathParam("eid") int id, Employee employee) {
		Response response = null;
		Employee emp = null;

		try {
			emp = empService.modifyEmployee(id, employee);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		if (emp != null)
			response = Response.status(Status.OK).entity(emp).build();
		else
			response = Response.status(Status.NO_CONTENT).entity(new Employee()).build();

		return response;
	}
}
