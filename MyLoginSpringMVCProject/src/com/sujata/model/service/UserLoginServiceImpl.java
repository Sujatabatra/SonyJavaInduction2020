package com.sujata.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.sujata.model.bean.User;
import com.sujata.model.dao.UserDao;

@Service
public class UserLoginServiceImpl implements UserLoginService {

	@Autowired
	private UserDao userDao;
	
	@Override
	public boolean loginCheck(User user) {
		String pwd=userDao.getPassword(user.getUsername());
		return (pwd!=null && pwd.equals(user.getPassword()));
	}

}
