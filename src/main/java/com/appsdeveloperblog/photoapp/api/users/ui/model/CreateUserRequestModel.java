package com.appsdeveloperblog.photoapp.api.users.ui.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class CreateUserRequestModel {
	
	@NotNull(message = "First Name cannot be null")
	@Size(min=2, message= "First name cannot be less than 2 characters")
	private String firstName;
	
	@NotNull(message = "Last Name Name cannot be null")
	@Size(min=2, message= "Last name cannot be less than 2 characters")
	private String lastName;
	
	@NotNull(message = "Email cannot be null")
	@Email(message = "Email Address is not valid")
	private String email;
	
	@NotNull(message = "Password cannot be null")
	@Size(min=8, max = 16, message="Password must be equal or greater than 8 characters and less than 16 characters long")
    private String password;
    
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}


}
