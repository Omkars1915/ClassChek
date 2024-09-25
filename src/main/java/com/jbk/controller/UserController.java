package com.jbk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.entity.User;
import com.jbk.model.LoginRequest;
import com.jbk.service.UserService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService service;
	
	@CrossOrigin(origins = "http://localhost:4200") // Allow only this origin
	@PostMapping("/login-user")
	public User loginUser(@RequestBody LoginRequest request) {
		
		return service.loginUser(request);
	}
	@CrossOrigin(methods = RequestMethod.POST)
	@PostMapping("/add-user")
	public ResponseEntity<Integer>  addUser(@RequestBody User user) {
		User registerUser = service.addUser(user);
		if (registerUser != null) {
			return new ResponseEntity<Integer>(1, HttpStatus.CREATED);
		} else {
			return new ResponseEntity<Integer>(3, HttpStatus.OK);
		}
	}
	@GetMapping("/get_all-users")
	public List<User> getAllUsers(){
		List<User> getallusers=service.getAllUsers();
		return getallusers;
	}
	@GetMapping("/get-user-by-name/{name}")
	public Object getUserById(@PathVariable String name) {
		Object getuserbyid=service.getUserById(name);
		return getuserbyid;
	}
	@PutMapping("/update-user")
	public ResponseEntity<Integer> updateUser(@RequestBody User user) {
		User updateuser = service.updateUser(user);
		if (updateuser != null) {
			return new ResponseEntity<Integer>(1, HttpStatus.CREATED);
		} else {
			return new ResponseEntity<Integer>(3, HttpStatus.OK);
		}
	}
	@DeleteMapping("/delete-user-by-id/{username}")
	public User deleteUser(@PathVariable String username) {
		
		return service.deleteUser(username);
	}
}
