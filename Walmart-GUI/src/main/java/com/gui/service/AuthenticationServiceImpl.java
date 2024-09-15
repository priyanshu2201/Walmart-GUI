package com.gui.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.gui.model.Login;
import com.gui.model.User;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {

	@Autowired
	private RestTemplate restTemplate;

	@Override
	public boolean addUser(User user) {

		Boolean postForObject = restTemplate.postForObject("http://localhost:1111/signUpUser", user, Boolean.class);
		
		return postForObject;
		
	}

	@Override
	public boolean checkUserLogin(Login login) {

		Boolean postForObject = restTemplate.postForObject("http://localhost:1111/loginUser", login, Boolean.class);
	
		return postForObject;
	}
	
	@Override
	public String checkEmailId(String email) {
		System.out.println("eeeeeeeeee:"+email);
		String postForObject = restTemplate.postForObject("http://localhost:1111/checkUserEmailId", email, String.class);
		
		
		
		return postForObject;
	}

}
