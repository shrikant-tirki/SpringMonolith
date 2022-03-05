package com.bel.training.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RameshController {

	@RequestMapping("/Ramesh") //Mapping name for method
	public String showHome(ModelMap model)
	{
		model.addAttribute("user", "Ramesh Koppad");  //returns ramesh.jsp
		model.addAttribute("d", new java.util.Date());  //returns ramesh.jsp
		return "home";
	}
	
	@RequestMapping("/spring") //Mapping name for method
	public String showSecond(ModelMap model)
	{		
		return "spring";
	}
	
}
