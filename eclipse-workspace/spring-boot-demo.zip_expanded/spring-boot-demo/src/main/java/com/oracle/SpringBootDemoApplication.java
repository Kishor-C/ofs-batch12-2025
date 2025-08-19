package com.oracle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * Every class you create must be inside com.oracle
 * You need to run this class only once, if you want to 
 * run once again make sure that the server is stopped 
 * else you will get port already in use ERROR
 */

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}

}
