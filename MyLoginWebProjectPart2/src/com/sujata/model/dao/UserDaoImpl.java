package com.sujata.model.dao;

import java.util.HashMap;
import java.util.Map;

public class UserDaoImpl implements UserDao {

	private Map<String, String> userData=new HashMap<>();
	
	public UserDaoImpl(){
		userData.put("admin", "admin");
		userData.put("sujata", "batra");
		userData.put("userx", "user123");
		userData.put("usery", "usery");
	}
	
	public String getPassword(String userName){
		return userData.get(userName);
	}
}
