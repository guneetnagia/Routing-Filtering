package com.example.routingandfilteringbook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class RoutingAndFilteringBookApplication {

	public static void main(String[] args) {
		SpringApplication.run(RoutingAndFilteringBookApplication.class, args);
	}
	
	@RequestMapping(value="/available")
	public String available(){
		return "Spring in action";
	}
	
	@RequestMapping(value="/checked-out")
	public String checkedOut() {
		return "Spring boot in action";
	}

}


/*
 * RestController mark class as a controller class and ensure the return value from 
 * RequestMapping methods in this class
 * are automatically converted and directly written into HTTP response. 
 */
