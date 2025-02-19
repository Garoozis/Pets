package com.example.demo.Pets;

import org.springframework.stereotype.Service;

@Service
public interface PetService {

	public Pet create(Pet pet);
}
