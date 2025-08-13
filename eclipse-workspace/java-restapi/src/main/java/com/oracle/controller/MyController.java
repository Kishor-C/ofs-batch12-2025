package com.oracle.controller;

import com.oracle.beans.Employee;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

/*
 * 
 * @Path - URL
 * @GET, @POST, @PUT, @DELETE
 * @Cosumes, @Produces
 */
@Path("/v1/api")
public class MyController {

	@POST
	@Path("/save")
	@Consumes(MediaType.APPLICATION_JSON) // takes json from request body & maps to the parameter
	@Produces(MediaType.APPLICATION_JSON)
	public Response testSave(Employee emp) {
		System.out.println(emp);
		return Response.status(201).entity(emp).build();
		// 201 - CREATED
	}
	
	@GET
	@Produces(MediaType.TEXT_PLAIN) // MediaType is from jakarta.ws.core
	// Response is from jakarta.ws.rs.core
	public Response testing() {
		return Response.status(200).entity("HELLO REST").build();
	}
}
