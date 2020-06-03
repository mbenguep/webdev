package com.webdev.user.service.implemented;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webdev.model.Users;
import com.webdev.repository.UserRepository;
import com.webdev.services.UserService;
@Service
public class UserServiceimplemented implements UserService {
	
	@Autowired
	private UserRepository ur;
	
	public void save(Users user) {
		ur.save(user);
	}
	public Users findUsersByusername(String username) {
		return ur.findUsersByusername(username);
	}
	

}
