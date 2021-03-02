package com.example.servingwebcontent;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

	@GetMapping("/greeting")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("name", name);
		return "greeting";
	}
	
	@GetMapping("/lastname")
	public String lastname(@RequestParam(name="lastname", required=false, defaultValue="World") String lastname, Model model) {
		model.addAttribute("lastname", lastname);
		model.addAttribute("deepthi", "htyderabad");
		
		return "lastname";
	}
	
	@GetMapping("/fullname")
	public String fullname(@RequestParam(name="lastname", required=false, defaultValue="World") String lastname,
			@RequestParam(name="firstname", required=false, defaultValue="World") String firstname,
			Model model) {
		model.addAttribute("lastname", lastname);
		model.addAttribute("firstname", firstname);
		model.addAttribute("fullname", lastname + " " + firstname);
		return "fullname";
	}
	
	@GetMapping("/square")
	public String square(@RequestParam(name="num", required=false, defaultValue="0") int num, Model model) {
		model.addAttribute("num", Math.square(num));	
		return "square";
	}
	
	@GetMapping("/addition")
	public String additio(@RequestParam(name="num1", required=false, defaultValue="World") int num1,
			@RequestParam(name="num2", required=false, defaultValue="World") int num2,
			Model model) {
		model.addAttribute("num", Math.addition(num1, num2));
		return "addition";
	}

	
	
	
}

