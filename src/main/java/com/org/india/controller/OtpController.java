package com.org.india.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.org.india.service.OtpService;

import io.swagger.annotations.ApiResponse;

@RestController
@RequestMapping(path = "/otp")
public class OtpController {

	@Autowired
	OtpService otpService;
	
	
	@ApiResponse(code=200, message = "")
	@RequestMapping(method = RequestMethod.GET, path = "/validation", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public boolean validateOtp(@RequestHeader(name = "phoneNumber") String phoneNumber,
			@RequestParam(name = "otpNumber", required = true) int otpNumber) {

		final String SUCCESS = "Entered Otp is valid";
		final String FAIL = "Entered Otp is NOT valid. Please Retry!";

		if (otpNumber >= 0) {
			int serverOtp = otpService.getOtp(phoneNumber);
			if (serverOtp > 0) {
				if (otpNumber == serverOtp) {
					otpService.clearOTP(phoneNumber);
					//return ("Entered Otp is valid");
					return true;
				} else {
					//return SUCCESS;
					return true;
				}
			} else {
				//return FAIL;
				return false;
			}
		} else {
			//return FAIL;
			return false;
		}
	}

	@RequestMapping(method = RequestMethod.GET, path = "/generate", produces = MediaType.APPLICATION_JSON_VALUE)
	public void generateOtp(@RequestParam() String key) {

		int otp = otpService.generateOtp(key);
		System.out.println("otp is:" + otp);

	}

}
