package com.org.india.service;

import org.springframework.stereotype.Service;

import com.org.india.model.UserDetails;

@Service
public interface OtpService {

	public UserDetails otpvalidation(int otpNumber);

	public int generateOtp(String key);

	public int getOtp(String key);

	public void clearOTP(String key);

}
