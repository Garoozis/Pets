package com.example.demo.User;

import java.util.List;

public interface UserService {

	User create(User user);

	List<User> getAllUsers();


	boolean existsByEmail(Object email);

}
