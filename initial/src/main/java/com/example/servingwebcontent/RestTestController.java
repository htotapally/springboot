package com.example.servingwebcontent;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestTestController {

	@GetMapping("/rest")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name) {
		System.out.println("What a pian?");
		return "RestControlle says hello to: " + name;
	}
}
