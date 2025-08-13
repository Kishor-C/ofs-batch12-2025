package com.oracle.controller;

import java.util.List;

import com.oracle.beans.Employee;
import com.oracle.business.EmployeeService;
import com.oracle.business.util.EmployeeServiceFactory;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/v1/employee")
public class EmployeeRestController {
	// private EmployeeService service = new EmployeeServiceImpl();
	private EmployeeService service = EmployeeServiceFactory.getEmployeeService();
	
	// store - use @POST, @Produces, @Consumes, Employee in the method parameter
	@Path("/save")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@POST
	public Response saveEmployee(Employee emp) {
		Employee savedEmp = service.storeEmployee(emp);
		return Response.status(201).entity(savedEmp).build();
	}
	
	// findAll - use @GET, @Produces
	@Path("/findAll")
	@Produces(MediaType.APPLICATION_JSON)
	@GET
	public Response findEmployees() {
		List<Employee> list = service.findEmployees();
		return Response.status(200).entity(list).build();
	}
}
