package com.sapient.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class HelloDocker {
	
	@RequestMapping("/hello")
	public String sayHello() {
		log.info("Hello Docker");
		return "Hello Docker";
	}

}


