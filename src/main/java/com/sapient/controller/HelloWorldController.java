package com.sapient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/helloWorld")
public class HelloWorldController {
	
	@Value("${application.message}")
	private String message;
	
	@RequestMapping("/")
	public String getMessage() {
		log.info("Hello World");
		return this.message;
//		return "Hello World";
	}
	
	@RequestMapping("/hello")
	public String sayHello() {
		log.info("Hello Akash");
		return "Hello Akash";
	}

}
