package com.laundryapp.types;

public class UserType {

	private int userID;
	private String email;
	private String password;
	private String mobile;
	private int userMode;
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
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
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public int getUserMode() {
		return userMode;
	}
	public void setUserMode(int userMode) {
		this.userMode = userMode;
	}
}
