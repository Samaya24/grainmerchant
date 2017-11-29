package com.isu.graduateproject.grainmerchant.dao;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

public class User {
	
	@NotBlank(message="Cannot be left blank")
	@Email
	private String username;
	
	@NotBlank(message="Cannot be left blank")
	@Pattern(regexp="^\\S+$")
	@Size(min=8, max=15)
	private String password;
	
	@NotBlank(message="Cannot be left blank")
	private String firstname;
	
	private String lastname;
	private String authority;
	private int enabled;
	
	public User(){
		
	}

	public User(String username, String password, String firstname, String lastname, String authority, int enabled) {
		this.username = username;
		this.password = password;
		this.firstname = firstname;
		this.lastname = lastname;
		this.authority = authority;
		this.enabled = enabled;
	}

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

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	public int getEnabled() {
		return enabled;
	}

	public void setEnabled(int enabled) {
		this.enabled = enabled;
	}
}
