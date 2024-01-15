package com.githubcicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
@RequestMapping("/api/v1")
public class CicdApplication {

	@Getmapping("/hello")
	public static void main(String[] args) {
		System.out.println("Hello, Welcome to cicd congiguration!");
		SpringApplication.run(CicdApplication.class, args);
	}

}
