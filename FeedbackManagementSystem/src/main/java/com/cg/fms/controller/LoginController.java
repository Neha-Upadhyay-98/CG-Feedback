package com.cg.fms.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.fms.exception.UserNotFoundException;
import com.cg.fms.exception.UserAlreadyExistsException;
import com.cg.fms.service.LoginService;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/auth")
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	@GetMapping("/login")
	public String login(@RequestBody Map<String, String> auth) {
		try {
		return loginService.login(auth.get("username"),auth.get("password"));
	}
		catch(UserNotFoundException e) {
			return e.getMessage();
		}
	}	
	
	@PostMapping("/signup")
	public String signup(@RequestBody Map<String, String> auth) {
		try {
			return loginService.signup(auth.get("username"),auth.get("password"));
		}
		catch(UserAlreadyExistsException e) {
			return e.getMessage();
		}
	}
	
	@PostMapping("/delete/{uId}")
	public void deleteAccount(@PathVariable(value="uId") String userid) {
		loginService.deleteAccount(userid);
	}
}
