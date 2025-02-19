package com.example.demo;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.example.demo.Pets.Gender;
import com.example.demo.Pets.Pet;
import com.example.demo.Pets.PetRepo;
import com.example.demo.Pets.Species;

@ComponentScan("com.example.demo.Pets")
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	
	@Bean
	CommandLineRunner commandLineRunner(PetRepo petrepo){
		return args -> {
			Pet mark = new Pet(
					"mark",Species.DOG,5,Gender.MALE,true);
			petrepo.save(mark);
			
		};
	}
	

}
