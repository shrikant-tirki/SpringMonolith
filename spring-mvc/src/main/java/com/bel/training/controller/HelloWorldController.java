package com.bel.training.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	
	@RequestMapping("/Shrikant") //Mapping name for method
	public String showHello()
	{
		return "hello";  //returns hello.jsp
	}
	
}

/*
* Work flow of Spring Web MVC Application 
* 
* Client --> Request --> index.jsp --> Front Controller (web.xml) 
*   --> UserController --> Returns views (jsp files)
*  
*/