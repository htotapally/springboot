package com.example.servingwebcontent;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BabyController {

	@GetMapping("/")
	public String getAllBabies() {
		// Return all babies
		return "RestControlle says hello to: ";
	}
	
	@GetMapping("/baby/{name}")
	public String getBabyByName(@PathVariable(name="name", required=true) String name) {
		// Return baby information 
		return "RestControlle says hello to: " + name;
	}
	
	@PutMapping("/baby/{name}")
	public String updateBaby(@PathVariable(name="name", required=true) String name) {
		return "RestControlle says hello to: " + name;
	}
	
	@DeleteMapping("/baby/{name}")
	public String deleteBaby(@PathVariable(name="name", required=true) String name) {
		return "RestControlle says hello to: " + name;
	}
		
	@PostMapping("/")
	public String createBaby(@RequestParam(name="name", required=true) String name) {
		return "RestControlle says hello to: " + name;
	}

}
