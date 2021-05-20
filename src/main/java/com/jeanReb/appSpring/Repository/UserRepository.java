package com.jeanReb.appSpring.Repository;

import java.io.Serializable;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jeanReb.appSpring.Entity.User;


@Repository
public interface UserRepository extends CrudRepository<User, Serializable> {

	
	public Optional<User> findByEmail(String email);
	
	
}
