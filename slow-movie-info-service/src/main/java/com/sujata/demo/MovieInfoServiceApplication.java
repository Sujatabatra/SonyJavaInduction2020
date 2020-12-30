package com.sujata.demo;

import javax.persistence.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.sujata.bean.Movie;
import com.sujata.persistence.MovieDao;

@SpringBootApplication(scanBasePackages="com.sujata")
@EntityScan(basePackages="com.sujata.bean")
@EnableJpaRepositories(basePackages="com.sujata.persistence")
@EnableEurekaClient
public class MovieInfoServiceApplication/* implements CommandLineRunner*/{
	
//	@Autowired
//	private MovieDao mDao;
	
	public static void main(String[] args) {
		SpringApplication.run(MovieInfoServiceApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		Movie m1=new Movie("M001", "Black And White");
//		Movie m2=new Movie("M002", "Transformer");
//		Movie m3=new Movie("M003", "Titanic");
//		Movie m4=new Movie("M004", "Oh My God");
//		mDao.save(m1);
//		mDao.save(m2);
//		mDao.save(m3);
//		mDao.save(m4);
//		
//	}

}
