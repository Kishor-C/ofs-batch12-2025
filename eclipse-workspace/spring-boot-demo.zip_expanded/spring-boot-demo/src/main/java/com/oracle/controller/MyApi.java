package com.oracle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oracle.beans.User;
import com.oracle.service.UserService;

/*
 * @RestController to configure the controller
 * @RequestMapping to specify the main URL
 * @GetMapping, @PostMapping, @PutMapping, @DeleteMapping to configure http methods
 */
@RestController
@RequestMapping("/v1/api")
public class MyApi {
	
	@Autowired
	private UserService service; // spring injects ServiceImp object to MyApi object
	
	// method to consume JSON - @RequestBody reads json and maps properties to User object
	@PostMapping(path = "/save", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> save(@RequestBody User user) {
		User created = service.store(user);
		return ResponseEntity.status(201).body(created);
	}
	@GetMapping(path = "/getAll")
	public ResponseEntity<Object> getAll() {
		List<User> list = service.findAll();
		return ResponseEntity.status(200).body(list);
	}
	
	
	// In Spring Boot JSON is the default response content, if string then it takes Text
	@GetMapping(path = "/test/{user}")
	public ResponseEntity<Object> greet(@PathVariable("user") String name) {
		String content = "Hello "+name;
		// body takes the response content similar to entity() of Response in JAX-RS
		return ResponseEntity.status(200).body(content);
	}
	// URL = http://localhost:9091/v1/api/test/Kishor => Select HTTP GET 
}
