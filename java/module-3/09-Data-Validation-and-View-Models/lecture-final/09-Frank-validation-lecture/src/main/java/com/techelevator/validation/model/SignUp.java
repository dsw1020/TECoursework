package com.techelevator.validation.model;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

public class SignUp {
	// Place the validation annotation before the field to be validated 
	// message= is the message to be display when invalid data is entered
	
	@NotBlank(message="Name is required")
	private String name;
	
	@NotBlank(message="Email address is required")
	@Email(message="Email must be a valid email address")
	private String email;
	
	@NotBlank(message="Verify email address is required")
	private String verifyEmail;  
	
	// \\(    - a ( is required 
	// \\d{3} - followed by a 3 digit number
	// \\}    - followed by by a ) 
	// \\d{3} - followed by a 3 digit number
	// -      -  followed by a dash
	// \\d{4} - followed by a 3 digit number
	// (440)461-1234
	
	@Pattern(regexp="^\\(\\d{3}\\)\\d{3}-\\d{4}$", message="Please enter a valid, ten digit phone number")
	private String phone;
	
	private String occupation;
	
	// Age, if present must be between 13 and 150
	
	@Min(value=13, message="You must be 13 years old or older")
	@Max(value=150, message="You're not that old!")
	private Integer age;
	
	@SuppressWarnings("unused")
	private boolean emailMatching;   // Helper attribute is sometimes required  - extra attribute just for validation
	@AssertTrue(message="Emails must match")  // validate the return value from a method 
	public boolean isEmailMatching() {  // method return a result which is validated (isBooleanName - standard getter for a a boolean)
		if(email != null) {
			return email.equals(verifyEmail);
		} else {
			return false;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getVerifyEmail() {
		return verifyEmail;
	}

	public void setVerifyEmail(String verifyEmail) {
		this.verifyEmail = verifyEmail;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
}
