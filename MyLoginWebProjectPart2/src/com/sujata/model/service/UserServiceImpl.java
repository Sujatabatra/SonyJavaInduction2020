package com.sujata.model.service;

import com.sujata.model.bean.User;
import com.sujata.model.dao.UserDao;
import com.sujata.model.dao.UserDaoImpl;

public class UserServiceImpl implements UserService {

	private UserDao userDao=new UserDaoImpl();
	
	public boolean authenticateUser(User user){
		return user.getPassword().equals(userDao.getPassword(user.getUserName()));
	}
}
