package com.oracle.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oracle.beans.Employee;
import com.oracle.business.EmployeeService;

@RestController
@RequestMapping("/v1/employee/api")
public class EmployeeRestApi {
	@Autowired
	private EmployeeService serviceEmployee;
	// to store the data
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> save(@RequestBody Employee emp) {
		Employee created = serviceEmployee.storeEmployee(emp);
		return ResponseEntity.status(201).body(created);
	}
	// to get the data using id
	@GetMapping(path = "/{id}")
	public ResponseEntity<Object> find(@PathVariable("id") int id) {
		try { 
			Employee emp = serviceEmployee.findEmployee(id);
			return ResponseEntity.status(200).body(emp);
		} catch(RuntimeException e) {
			String err = e.getMessage();
			Map<String, String> map = new HashMap<String, String>();
			map.put("message", err); 
			return ResponseEntity.status(404).body(map);
		}
	}
}
