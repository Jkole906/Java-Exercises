package com.techelevator.validation.model;

import java.time.LocalDate;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

public class Registration {
	
	@NotBlank(message="Please enter your first name.")
	@Size(max=20, message="20 character limit.")//If the database only allows 20 spaces, this will keep it from crashing
	private String firstName;
	
	@NotBlank(message="Please enter your last name.")
	@Size(max=20, message="20 character limit.")
	private String lastName;
	
	@Email(message="That is not a real email.")//This message isn't required. Even if the "registration.jsp" has a message "<form:errors path="firstName" cssClass="error"/>"" thing.
	@NotBlank(message="Please enter valid email.")
	private String email;
	
	private String confirmEmail;
	
	
	@NotBlank(message="Must enter a valid password.")
	@Size(min=5, message="Must be 5 characters or more.")
	@Pattern(regexp=".*[%&*\\()$#@!}]+.*", message="Must include one of the following: \"%&*\\\\()$#@!\" ")
	// The regexp (Regular Expression) here makes the string REQUIRE one of the characters between the "[]". 
	// The "+" means "AT LEAST ONE". a "{2,} would mean "TWO OR MORE IN A ROW".
	private String password;
	
	
	private String confirmPassword;
	
	
	@NotBlank(message="Please enter your birth date date.")
	//@Past (message="Greetings from the future!") 
	@DateTimeFormat(pattern="yyyy-mm-dd")
	private LocalDate birthDate;
	
	
	@Min(value=1, message="Value must be greater than 0.")//put the value first.
	@Max(value=10, message="10 character limit.")
	// Alternative for Min and Max here would be "@Range(min=1, max=10)"
	private int numOfTickets;
	
	
	
	public String getFirstName()
	{
		return firstName;
	}
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	public String getLastName()
	{
		return lastName;
	}
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	public String getEmail()
	{
		return email;
	}
	public void setEmail(String email)
	{
		this.email = email;
	}
	public String getConfirmEmail()
	{
		return confirmEmail;
	}
	public void setConfirmEmail(String confirmEmail)
	{
		this.confirmEmail = confirmEmail;
	}
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}
	public String getConfirmPassword()
	{
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword)
	{
		this.confirmPassword = confirmPassword;
	}
	public LocalDate getBirthDate()
	{
		return birthDate;
	}
	public void setBirthDate(LocalDate birthDate)
	{
		this.birthDate = birthDate;
	}
	public int getNumOfTickets()
	{
		return numOfTickets;
	}
	public void setNumOfTickets(int numOfTickets)
	{
		this.numOfTickets = numOfTickets;
	}
	

}
