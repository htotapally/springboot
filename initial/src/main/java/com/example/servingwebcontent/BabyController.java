package com.example.servingwebcontent;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.baby.model.BabyModel;

import io.swagger.v3.oas.annotations.Operation;

@RestController
public class BabyController {

	@Operation(summary = "Returns all baby names")
	@GetMapping("/")
	public String getAllBabies() {
		// Return all babies
		
		// Get Read all babies from file, and return the information
		// Create a StringBuild, append all babies information by appending to the StringBuilder
		
		return "RestControlle says hello to: ";
	}
	
	@Operation(summary = "Returns baby information for the given baby name")
	@GetMapping("/baby/{name}")
	public String getBabyByName(@PathVariable(name="name", required=true) String name) {
		
		// Return baby information based on the baby name
		
		// Create a StringBuilder, append all baby info to the StringBuilder
		// return STrinbuilder.toSTring
		
		return "RestControlle says hello to: " + name;
	}
	
	@PutMapping("/baby/{name}")
	public String updateBaby(@PathVariable(name="name", required=true) String name) {
		// Write code to update baby info
		
		// Retrieve baby info
		
		// Update baby info based on the parameters passed
		
		return "RestControlle says hello to: " + name;
	}
	
	@DeleteMapping("/baby/{name}")
	public String deleteBaby(@PathVariable(name="name", required=true) String name,
			@RequestParam(name="lastname", required=true) String lasttname,
			@RequestParam(name="gender", required=true) String gender,
			@RequestParam(name="dob", required=true) String dob) {
		
		// Write code to delete baby
		
		// First retrieved tby baby info
		
		// delete baby info
		return "RestControlle says hello to: " + name;
	}
		
	@PostMapping("/")
	public String createBaby(@RequestParam(name="firstname", required=true) String firstname,
			@RequestParam(name="lastname", required=true) String lasttname,
			@RequestParam(name="gender", required=true) String gender,
			@RequestParam(name="dob", required=true) String dob
			) {
		// Write code to append baby to the file
		
		BabyModel babyModel = new BabyModel();
		babyModel.setFirstname(firstname);
		
		// Append BAbyModel to the file
		return "RestControlle says baby was created successfully " + firstname;
	}

}
