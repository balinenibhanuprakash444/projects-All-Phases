package com.project.SpringSecurity.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.SpringSecurity.entities.User;

@Repository
public class UsersRepositoryextendsCrudRepository<User, Integer> {
	public Optional<User> findUserByName(String name) {
		return null;
	} 
}
