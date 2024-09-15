package com.gui.service;

import com.gui.model.Login;
import com.gui.model.User;

public interface AuthenticationService {

	public boolean addUser(User user);

	public boolean checkUserLogin(Login login);
	
	public String checkEmailId(String email);
}
