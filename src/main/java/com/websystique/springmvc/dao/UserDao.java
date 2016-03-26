package com.websystique.springmvc.dao;

import com.websystique.springmvc.model.User;

public interface UserDao {

	void save(User user);
	
	User findById(int id);
	
	User findBySSO(String sso);
	
}

