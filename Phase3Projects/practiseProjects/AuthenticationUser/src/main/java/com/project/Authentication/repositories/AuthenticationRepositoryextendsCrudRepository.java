package com.project.Authentication.repositories;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.Authentication.entities.User;

@Repository
public interface AuthenticationRepositoryextendsCrudRepository<User, Integer> {
	public Optional<User> findUserByName(String name);
}
