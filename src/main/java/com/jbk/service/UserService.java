package com.jbk.service;

import java.util.List;

import com.jbk.entity.User;
import com.jbk.model.LoginRequest;

public interface UserService {

	public User addUser(User user);

	public List<User> getAllUsers();

	public User getUserById(String name);

	public User updateUser(User user);

	public User deleteUser(String username);

	public User loginUser(LoginRequest request);

}
