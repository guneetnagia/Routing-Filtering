package com.example.routingandfilteringgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.example.routingandfilteringgateway.filters.pre.SimpleFilter;

@EnableZuulProxy
@SpringBootApplication
public class RoutingAndFilteringGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(RoutingAndFilteringGatewayApplication.class, args);
	}
	
	@Bean
	public SimpleFilter simpleFilter() {
		return new SimpleFilter();
	}

}


/*
 * To forward request to gateway, we need to tell the zuul application the routes it should watch and the services to 
 * which to forward requests that are made to those routes.
 * Specify routes by setting property under 
 * zuul.routes
 * zuul.routes.{APPLICATION-NAME}  
 * example : zuul.routes.books
 * 
 * zuul.routes.books.url = http://localhost:8090
 * 
 */