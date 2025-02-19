package com.example.demo.Pets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service 
public class PetImpl implements PetService{

	@Autowired
	PetRepo petrepo;
	
	@Override
	public Pet create(Pet pet) {
		
		return petrepo.save(pet);
	}
	
	
}
