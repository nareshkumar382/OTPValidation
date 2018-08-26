package com.org.india.model;

public class UserDetails {
	
	private String userName;
	private String emailId;
	private String otp;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getOtp() {
		return otp;
	}
	public void setOtp(String otp) {
		this.otp = otp;
	}
	@Override
	public String toString() {
		return "UserDetails [userName=" + userName + ", emailId=" + emailId + ", otp=" + otp + "]";
	}
	

}
