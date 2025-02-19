package com.example.demo.shelter;

import org.springframework.beans.factory.annotation.Autowired;

public class ShelterserviceImp implements Shelterservice{
	
	@Autowired
	ShelterRepo shelterrepo;
	
	@Override
	public Shelter create(Shelter shelter) {
			
			return shelterrepo.save(shelter);
		
	}

}
