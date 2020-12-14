package com.sujata.resource;

import java.sql.SQLException;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.sujata.bean.Employee;
import com.sujata.service.EmployeeService;
import com.sujata.service.EmployeeServiceImpl;


@Path("emps")
public class MyResource {
    private EmployeeService empService=new EmployeeServiceImpl(); 
	
//    http://localhost:8085/MySecondRestApiDemoProject/webapi/employees/102/secondvalue
    @Path("/{eid}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Employee resourceForSearchByID(@PathParam("eid")int id) {
        Employee employee=null;
    	try {
			employee=empService.searchEmployeeById(id);
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
    	return employee;
    }
    
    @Path("xml/{eid}")
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public Employee resourceForSearchByIDForXmlResponse(@PathParam("eid")int id) {
        Employee employee=null;
    	try {
			employee=empService.searchEmployeeById(id);
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
    	return employee;
    }
    //http://localhost:8085/MySecondRestApiDemoProject/webapi/employees?eid=102&secondkey=value
//    @Path("/{eid}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Employee oneMoreResourceForSearchByID(@DefaultValue("101") @QueryParam("eid")int id) {
        Employee employee=null;
    	try {
			employee=empService.searchEmployeeById(id);
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
    	return employee;
    }
    
    //http://localhost:8085/MySecondRestApiDemoProject/webapi/employees/matrix;eid=102;secondkey=value
    @Path("/matrix")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Employee resourceForSearchByIDUsingMatrixParam(@MatrixParam("eid")int id) {
        Employee employee=null;
    	try {
			employee=empService.searchEmployeeById(id);
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
    	return employee;
    }
}
