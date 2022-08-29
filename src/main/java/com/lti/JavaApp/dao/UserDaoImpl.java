package com.lti.JavaApp.dao;

import com.lti.JavaApp.beans.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao{


	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	@Transactional
	public User addUser(User p) {
		// TODO Auto-generated method stub
		System.out.println("ready to add user");
		entityManager.persist(p);
		System.out.println("user added");
		return p;
	}


}
