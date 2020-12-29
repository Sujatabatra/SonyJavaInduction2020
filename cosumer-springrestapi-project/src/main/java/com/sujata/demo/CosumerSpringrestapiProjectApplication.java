package com.sujata.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.sujata.bean.Employee;

@SpringBootApplication(scanBasePackages="com.sujata")
public class CosumerSpringrestapiProjectApplication implements CommandLineRunner {

//	@Autowired
//	RestTemplate restTemplate;
	
	public static void main(String[] args) {
		SpringApplication.run(CosumerSpringrestapiProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		List<Employee> emp=restTemplate.getForObject("http://localhost:8086/employees", List.class);
//		System.out.println(emp);
//		
	}
	
	@Bean
	RestTemplate getRestTemplate(){
		return new RestTemplate();
	}

}
