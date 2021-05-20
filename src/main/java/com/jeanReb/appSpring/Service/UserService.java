package com.jeanReb.appSpring.Service;

import org.springframework.stereotype.Service;


import com.jeanReb.appSpring.Entity.User;

@Service
public interface UserService {

	public Iterable<User> getAllUser() throws Exception;
	
	   public User getById(Long id) throws Exception ;
	   
	   public User updateUser(User user) throws Exception;
	     
	   public boolean deleteUser(Long id) throws Exception;
	   
	   public User save(User user) throws Exception;

	   
}
