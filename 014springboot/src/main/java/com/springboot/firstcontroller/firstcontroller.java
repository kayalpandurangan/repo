package com.springboot.firstcontroller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class firstcontroller {
	@RequestMapping("/hello")
	public String sayHello()
	{
		return "Hello from spring boot!" ; 
	}
	

}
