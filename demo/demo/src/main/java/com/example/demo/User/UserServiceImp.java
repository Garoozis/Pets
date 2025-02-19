package com.example.demo.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImp implements UserService{
	@Autowired
	UserRepo userrepo;
	
	@Override
	public User create(User user) {
			
			return userrepo.save(user);
		
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return userrepo.findAll();
	}

	@Override
	public boolean existsByEmail(Object email) {
		// TODO Auto-generated method stub
		return false;
	}
}
