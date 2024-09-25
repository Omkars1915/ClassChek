package com.jbk.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class User {
	
	@Id
	private String username;
	private String password;
	private String firstName;
	private String lastName;
	private String role; // e.g., student, teacher, admin
	private String email;
	
	

	// Default constructor
	public User() {
	}

	// Parameterized constructor
	public User( String username, String password, String firstName, String lastName, String role,
			String email) {
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.role = role;
		this.email = email;
	}

	// Getters and Setters
	

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "username=" + username + ", firstName=" + firstName + ", lastName="
				+ lastName + ", role=" + role + ", email=" + email + "]";
	}
}
