package com.org.india.repository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.org.india.model.UserDetails;

@Component
public class OtpRepository {
	
	public static Map<String, UserDetails> otpRepo = new HashMap<>();
	
	

}
