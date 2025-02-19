package com.example.demo.healthcheck;

import com.example.demo.User.User;
import com.example.demo.Pets.Pet;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Table(name = "health")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class healthcheck {
	    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	      
    private boolean status;
   
    private String notes;
    
    @OneToOne
    @JoinColumn(name = "pet_id")
    private Pet pet;
    
    @ManyToOne
    @JoinColumn(name = "vet_id")
    private User vet;
}
