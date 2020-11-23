package com.sujata.demo;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet {

	private Internet internet=new RealInternet();
	private static List<String> bannedSites=new ArrayList<>();
	
	static{
		bannedSites.add("aaa.com");
		bannedSites.add("abc.com");
		bannedSites.add("mno.com");
		bannedSites.add("xyz.com");
	}
	
	@Override
	public void connectTo(String serverhost) throws Exception {
		if(bannedSites.contains(serverhost.toLowerCase()))
				throw new Exception("Access Denined");
		
		internet.connectTo(serverhost);
		

	}

}
