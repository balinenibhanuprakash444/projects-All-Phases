package com.example.UserManager.services;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.UserManager.entities.User;
import com.example.UserManager.exceptions.UserNotFoundException;
//import com.example.UserManager.repositories.UserRepository;
@Service 
public class UserService {

	public void UpdateUser(User user) {
		// TODO Auto-generated method stub
		
	}
//	@Autowired
	//private UserRepository userRepository;
	//public Iterable<User> GetAllUsers() {
	//return userRepository.findAll();

	public User GetUserById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Iterable<User> GetAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}
	}
	//public User GetUserByName(String name) {
	//return userRepository.findByName(name);
	//}
	//public User GetUserById(Integer id) {
	//Optional<User> foundUser = userRepository.findById(id);
	//if(!foundUser.isPresent()) throw new UserNotFoundException();
	//return foundUser.get();
	//}
	//public User UpdateUser(User userToUpdate) {
	//return userRepository.save(userToUpdate);
	//}
//}
