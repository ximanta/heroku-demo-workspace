package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {

		System.out.println("I'm Running");
		SpringApplication.run(DemoApplication.class, args);
	}
@RequestMapping(value ="/hello")
public String hello(){
		return "Hello";
}

}
