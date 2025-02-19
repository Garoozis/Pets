package com.example.demo.Adoption;

import com.example.demo.Pets.Pet;
import com.example.demo.User.User;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "adoption")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AdoptionRequest {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Enumerated(EnumType.STRING)
    private isadopted status; // PENDING, APPROVED, REJECTED
    
    @ManyToOne
    @JoinColumn(name = "citizen_id")
    private User citizen;
    
    @ManyToOne
    @JoinColumn(name = "pet_id")
    private Pet pet;
}
