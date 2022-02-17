package com.cts.cityclassifiedandsearch.model;

public class AdminModel {

	private String firstName;
	private String lastName;
	private String contactNumber;
	private String alternateNumber;
	private String email;
	private String userId;
	private String password;
	private String role;
	private String userName;

	public String getFirstName() {
		return firstName;
	}

	public AdminModel(String firstName, String lastName, String contactNumber, String alternateNumber, String email,
			String userId, String password, String role, String userName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.contactNumber = contactNumber;
		this.alternateNumber = alternateNumber;
		this.email = email;
		this.userId = userId;
		this.password = password;
		this.role = role;
		this.userName = userName;
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

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getAlternateNumber() {
		return alternateNumber;
	}

	public void setAlternateNumber(String alternateNumber) {
		this.alternateNumber = alternateNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public AdminModel() {
		super();
	}

}
