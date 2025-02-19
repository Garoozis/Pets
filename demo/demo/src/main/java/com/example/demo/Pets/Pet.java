
package com.example.demo.Pets;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.shelter.Shelter;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "pet")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Pet {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    
    @Enumerated(EnumType.STRING)
    private Species species;
    
    private int age;
    
    @Enumerated(EnumType.STRING)
    private Gender gender; 
    
    private boolean healthy;
    
    private List<String> adoptionHistory = new ArrayList<>();

    public Pet(String name, Species species, int age, Gender gender, boolean healthy) {
        this.name = name;
        this.species = species;
        this.age = age;
        this.gender = gender;
        this.healthy = healthy;
    }
    
    @ManyToOne
    @JoinColumn(name = "shelter_id")
    private Shelter shelter;
	public void addAdoptionRecord(String record) {
        this.adoptionHistory.add(record);
    }
	

   
}
