package com.project.Authentication.services;

import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.project.Authentication.entities.User;

@Repository
public class AuthenticationRepository {
	public Optional<User> findUserByName(String name) {
		return null;
	}
}
