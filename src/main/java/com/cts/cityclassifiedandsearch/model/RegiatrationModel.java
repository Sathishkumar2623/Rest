package com.cts.cityclassifiedandsearch.model;

public class RegiatrationModel {

	private String firstName;
	private String lastName;
	private String contactNumber;
	private String alternateNumber;
	private String email;
	private String userId;
	private String password;
	private String role;
	private String userName;
	private String ans1;
	private String ans2;
	private String ans3;
	private String ans4;
	private String ans5;
	private String ans6;

	public String getAns4() {
		return ans4;
	}

	public void setAns4(String ans4) {
		this.ans4 = ans4;
	}

	public String getAns5() {
		return ans5;
	}

	public void setAns5(String ans5) {
		this.ans5 = ans5;
	}

	public String getAns6() {
		return ans6;
	}

	public void setAns6(String ans6) {
		this.ans6 = ans6;
	}

	@Override
	public String toString() {
		return "AdminModel [firstName=" + firstName + ", lastName=" + lastName + ", contactNumber=" + contactNumber
				+ ", alternateNumber=" + alternateNumber + ", email=" + email + ", userId=" + userId + ", password="
				+ password + ", role=" + role + ", userName=" + userName + ", ans1=" + ans1 + ", ans2=" + ans2
				+ ", ans3=" + ans3 + ", ans4=" + ans4 + ", ans5=" + ans5 + ", ans6=" + ans6 + "]";
	}

	public String getAns1() {
		return ans1;
	}

	public void setAns1(String ans1) {
		this.ans1 = ans1;
	}

	public String getAns2() {
		return ans2;
	}

	public void setAns2(String ans2) {
		this.ans2 = ans2;
	}

	public String getAns3() {
		return ans3;
	}

	public void setAns3(String ans3) {
		this.ans3 = ans3;
	}

	public String getFirstName() {
		return firstName;
	}

	public RegiatrationModel(String firstName, String lastName, String contactNumber, String alternateNumber, String email,
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

	public RegiatrationModel() {
		super();
	}

}
