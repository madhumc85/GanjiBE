package com.websystique.springmvc.service;

import com.websystique.springmvc.model.User;

public interface UserService {

	void save(User user);
	
	User findById(int id);
	
	User findBySso(String sso);
	
}