package com.sujata.model.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {

	private static Map<String, String> userDetails=new HashMap<>();
	static{
		userDetails.put("sujata", "batra");
		userDetails.put("admin1", "abc");
		userDetails.put("user1", "abc");
	}
	
	@Override
	public String getPassword(String username) {
		
		return userDetails.get(username);
		
	}

}
