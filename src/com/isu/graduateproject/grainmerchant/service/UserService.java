package com.isu.graduateproject.grainmerchant.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isu.graduateproject.grainmerchant.dao.User;
import com.isu.graduateproject.grainmerchant.dao.UserDao;

@Service("userService")
public class UserService {

	private UserDao userDao;

	@Autowired
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	public void create(User user){
		userDao.create(user);
	}
}
