package com.techelevator.validation.model;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

public class Login {
	
	
	
	@Email(message="Thats not a real Email.")
	@NotBlank
	private String email;
	
	@NotBlank(message="Must enter words")
	@Size(min=5, message="Must be 5 characters or more.")
	@Pattern(regexp=".*[%&*\\()$#@!}]+.*", message="Must include one of the following: \"%&*\\\\()$#@!\" ")
	private String password;
	
	
	
	

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}
	
	
	
	
}
