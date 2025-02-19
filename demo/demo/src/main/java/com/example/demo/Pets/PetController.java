package com.example.demo.Pets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pet")
public class PetController {
	
	@Autowired
	PetService petservice;
	
	@PostMapping("/savepet")
	public Pet savePet(@RequestBody @Validated Pet pet) {
		return petservice.create(pet);
		
	}
	
	
}
