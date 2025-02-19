package com.example.demo.shelter;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public")
public class ShelterController {
	
	@Autowired
	Shelterservice shelterservice;
	
	@PostMapping("/saveshelter")
	public Shelter saveShelter(@RequestBody Shelter shelter) {
		return shelterservice.create(shelter);
		
	}
		
}
