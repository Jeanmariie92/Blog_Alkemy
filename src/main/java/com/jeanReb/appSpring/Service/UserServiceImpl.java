package com.jeanReb.appSpring.Service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.jeanReb.appSpring.Entity.User;
import com.jeanReb.appSpring.Repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	
	@Autowired
	private UserRepository repository;
	
	@Override
	@Transactional
	public Iterable<User> getAllUser() throws Exception{
		try {
			Iterable<User> users = 	repository.findAll();
			return users;
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
		}

	@Override
	@Transactional

	public User getById(Long id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional

	public User updateUser(User user) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional

	public boolean deleteUser(Long id) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	@Transactional

	public User save(User user) throws Exception {
		
		try {
			User userSave = repository.save(user);
			return userSave;
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
		
		
	}


}
