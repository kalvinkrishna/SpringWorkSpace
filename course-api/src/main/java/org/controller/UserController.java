package org.controller;

import java.util.List;

import org.models.User;
import org.models.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import net.minidev.json.JSONObject;


@RestController
@RequestMapping(value="/")

public class UserController {
	
	private final Logger LOG = LoggerFactory.getLogger(getClass());

	private final UserRepository userRepository;

	public UserController(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	
	@RequestMapping(value="", method= RequestMethod.GET)
	public List<User> getAllUser(){
		LOG.info("Getting all users.");
		return userRepository.findAll();
	}
	@RequestMapping(value="/{userId}", method= RequestMethod.GET)
	public User getUser(@PathVariable String userID) {
		return userRepository.findOne(userID);
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public ResponseEntity<User> addNewUsers(@RequestBody User user) {
		LOG.info("Saving user.");
		
		HttpHeaders responseHeader = new HttpHeaders();
		
		return new ResponseEntity<>(userRepository.save(user),responseHeader,HttpStatus.CREATED);
		
	}
	
	@RequestMapping(value = "/settings/{userId}", method = RequestMethod.GET)
	public ResponseEntity<Object> getAllUserSettings(@PathVariable String userId) {
		User user = userRepository.findOne(userId);
		if (user != null) {
			return new ResponseEntity<>(user.getUserSettings(),new HttpHeaders(),HttpStatus.FOUND);
		} else {
			return new ResponseEntity<Object>(null,null,HttpStatus.NOT_FOUND);
		}
	}

	@RequestMapping(value = "/settings/{userId}/{key}", method = RequestMethod.GET)
	public String getUserSetting(@PathVariable String userId, @PathVariable String key) {
		User user = userRepository.findOne(userId);
		if (user != null) {
			return user.getUserSettings().get(key);
		} else {
			return "User not found.";
		}
	}
	
	

	@RequestMapping(value = "/settings/{userId}/{key}/{value}", method = RequestMethod.GET)
	public String addUserSetting(@PathVariable String userId, @PathVariable String key, @PathVariable String value) {
		User user = userRepository.findOne(userId);
		if (user != null) {
			user.getUserSettings().put(key, value);
			userRepository.save(user);
			return "Key added";
		} else {
			return "User not found.";
		}
	}


}
