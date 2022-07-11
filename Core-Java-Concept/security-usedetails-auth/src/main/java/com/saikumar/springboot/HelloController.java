package com.saikumar.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	
	@GetMapping("/hello")
	public String sayHello()
	{
		return ("<h1>Hello Everyone Good Evening...</h1>");
	}


	
}
