package com.jbk.dao;

import java.util.List;

import com.jbk.entity.User;
import com.jbk.model.LoginRequest;

public interface UserDao {

	User addUser(User user);

	List<User> getAllUsers();

	User getUserById(String name);

	User updateUser(User user);

	User deleteUser(String username);

	User loginUser(LoginRequest request);

}
