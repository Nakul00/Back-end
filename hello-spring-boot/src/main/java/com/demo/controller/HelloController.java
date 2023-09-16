package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/welcome")
	public String helloThere()
	{
		return "Happy weekend";
	}
	
	@GetMapping("/welcome-with-object")
	public WelcomeBean welcomeWithObject()
	{
		return new WelcomeBean("Hello world");
	}
	
	@GetMapping("/welcome-with-parameter/name/{name}")
	public WelcomeBean welcomeWithParameter(@PathVariable String name)
	{
		return new WelcomeBean(String.format("Hello world, %s!",name));
	}
	

}


