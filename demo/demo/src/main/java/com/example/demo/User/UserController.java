package com.example.demo.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/public/users")
public class UserController {

    @Autowired
    private UserService userService;

    // POST request για την εγγραφή χρήστη
    @PostMapping("/signup")
    public ResponseEntity<User> registerUser(@RequestBody User user) {
        // Ελέγξτε αν το email ήδη υπάρχει
        if (userService.existsByEmail(user.getEmail())) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST); 
        }

        User createdUser = userService.create(user);  
        return new ResponseEntity<>(createdUser, HttpStatus.CREATED);  
    }

    
    @GetMapping("/all")
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> users = userService.getAllUsers();
        return ResponseEntity.ok(users);  
    }
}
