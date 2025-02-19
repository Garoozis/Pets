
package com.example.demo.shelter;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.Pets.Pet;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "shelter")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Shelter {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    
    private String street;
    
    private int number;
    
    private int postalcode; 
    
    private String area;
    
    private String phonenumber;
    
    private String email;
    
    @OneToMany(mappedBy = "shelter", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Pet> petlist = new ArrayList<>();
    
    private List<String> adoptionapplic = new ArrayList<>();
        
}