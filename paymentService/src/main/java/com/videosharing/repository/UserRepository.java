package com.videosharing.repository;

import org.springframework.data.repository.CrudRepository;

import com.videosharing.model.User;

public interface UserRepository extends CrudRepository<User, String>{
	
}
