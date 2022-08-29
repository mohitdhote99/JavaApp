package com.lti.JavaApp.service;

import com.lti.JavaApp.beans.User;
import com.lti.JavaApp.dao.UserDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService{

	@Autowired
	UserDao dao;

	
	
	public UserDao getDao() {
		return dao;
	}



	public void setDao(UserDao dao) {
		this.dao = dao;
	}



	@Override
	public User addUser(User p) {
		// TODO Auto-generated method stub
		System.out.println("service ready for user");
		return dao.addUser(p);
	}
	
}
