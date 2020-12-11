package com.sujata.demo;

import javax.jws.WebService;

@WebService(endpointInterface="com.sujata.demo.Greet")
public class GreetImpl implements Greet {

	public String wish(String name) {
		return "Welcome "+name+" to the world of Soap Web service ";
	}

}
