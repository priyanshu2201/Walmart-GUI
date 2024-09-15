package com.gui.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.gui.model.Login;
import com.gui.model.User;
import com.gui.service.AuthenticationService;

@Controller
public class AuthenticationController {
	
	@Autowired
	private HttpSession session;
	
	@Autowired
	private AuthenticationService authenticationService; 
	

	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@PostMapping("/checkUser")
	public String checkLogin(@RequestParam("username") String username, @RequestParam("password") String password) {
		Login login=new Login(username, password);
		
		if(login.getPassword()!=null || login.getUserName()!=null) {
			
			boolean checkUserLogin = authenticationService.checkUserLogin(login);
			
			if(checkUserLogin) {
				session.setAttribute("isLogin", "YES");
				String fname = authenticationService.checkEmailId(username);
				session.setAttribute("currentUserName", fname);
				return "Home";
			}
			else {
				String fname = authenticationService.checkEmailId(username);
				
				if(fname!=null) {
					session.setAttribute("loginStatusMSG", "Please enter a correct email id or password");
					return "login";
				}
				else {
					session.setAttribute("loginStatusMSG", "Please create a ID");
					return "signup";
				}
				
			}
			
		}else {
			return "login";
		}
		
		
	}
	@GetMapping("/logout")
	public String logout() {
		//
		session.setAttribute("isLogin", "NO");
		return "Home";
	}
	
	@GetMapping("/signUp")
	public String sign() {
		return "signup";
	}
	
	@PostMapping("/userSignUp")
	public String userSignUp(@RequestParam("fname") String fname, @RequestParam("lName") String lName, @RequestParam("password") String password, @RequestParam("email") String email, @RequestParam("gender") String gender ) {
		char c=gender.charAt(0);
		
		User user= new User(0, fname, lName, email, c , password);
		
		if(user.getfName()!=null || user.getlName()!=null || user.getEmailId()!=null || user.getPassword()!=null ) {
			
			boolean addUser = authenticationService.addUser(user);
			if(addUser) {
				System.out.println("seccessful signup hoga");
				return "login";
			}
			else {
				System.out.println("create sign up");
			return "signup";
			}
		}
		else {
			System.out.println("signup blank data pass");
			return "signup";
		}
	}
}
