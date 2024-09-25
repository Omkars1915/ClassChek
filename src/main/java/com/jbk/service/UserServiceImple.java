package com.jbk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.dao.UserDao;
import com.jbk.entity.User;
import com.jbk.model.LoginRequest;

@Service
public class UserServiceImple implements UserService {
	
	@Autowired
	private UserDao dao;

	@Override
	public User addUser(User user) {
		return dao.addUser(user);
	}

	@Override
	public List<User> getAllUsers() {
		List<User> getallusers=dao.getAllUsers();
		return getallusers;
	}

	@Override
	public User getUserById(String name) {
		User getuserbyid=dao.getUserById(name);
		return getuserbyid;
	}

	@Override
	public User updateUser(User user) {
	
		return dao.updateUser(user);
	}

	@Override
	public User deleteUser(String username) {
		
		return dao.deleteUser(username);
	}

	@Override
	public User loginUser(LoginRequest request) {
		return dao.loginUser(request);
	}
	

}
