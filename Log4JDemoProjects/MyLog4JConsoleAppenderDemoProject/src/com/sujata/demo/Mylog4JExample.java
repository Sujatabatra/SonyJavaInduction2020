package com.sujata.demo;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class Mylog4JExample {

	static Logger log=Logger.getLogger(Mylog4JExample.class);
	
	public static void main(String[] args) {
		
		log.setLevel(Level.DEBUG);
		
		log.debug("Hello this is debug message");
		log.trace("Hello this is trace message");
		log.info("Hello this is info message");
		log.warn("Hello this is warn message");
		log.error("Hello this is error message");
		System.out.println("Log 4 j executed");
	}

}
