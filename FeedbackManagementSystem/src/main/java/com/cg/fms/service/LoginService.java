package com.cg.fms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.fms.entity.Login;
import com.cg.fms.exception.UserNotFoundException;
import com.cg.fms.exception.UserAlreadyExistsException;
import com.cg.fms.repository.ILoginRepository;

@Service
public class LoginService {
	@Autowired
	private ILoginRepository loginRepository;

	public String login(String username,String password) throws UserNotFoundException {
		Login profile=loginRepository.findByUserName(username);
		if(profile!=null && profile.getPassword().equals(password))
			return "Success";
		else
			throw new UserNotFoundException ("Invalid Username and Password!");
	}
	
	public String signup(String username,String password) throws UserAlreadyExistsException {
		String userid = Integer.toString(username.hashCode());
		Login profile=new Login(userid,username,password);
		if(loginRepository.existsById(userid)) {
			throw new UserAlreadyExistsException ("Username" + username + " already exists!");
		}
		else
			return loginRepository.save(profile).toString();
	}
	
	public void deleteAccount(String userid) {
		loginRepository.deleteById(userid);
	}
}