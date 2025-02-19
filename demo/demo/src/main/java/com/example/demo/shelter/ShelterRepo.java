package com.example.demo.shelter;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShelterRepo extends JpaRepository<Shelter,Long>{

}
