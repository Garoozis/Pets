package com.example.demo.Pets;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum Species {
	DOG, CAT, BIRD, TURTLE, HORSE;
	
	@JsonCreator
    public static Gender fromString(String value) {
        return Gender.valueOf(value.toUpperCase());
    }
}
