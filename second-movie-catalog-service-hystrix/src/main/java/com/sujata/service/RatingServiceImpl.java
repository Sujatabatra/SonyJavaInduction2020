package com.sujata.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.sujata.bean.Rating;
import com.sujata.bean.RatingList;

@Service
public class RatingServiceImpl implements RatingService {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@HystrixCommand(fallbackMethod="getFallBackRatingList")
	public RatingList getRatingList(String uid) {
		RatingList ratings = restTemplate.getForObject("http://rating-data-service/ratings/" + uid, RatingList.class);
		return ratings;
	}
	
	public RatingList getFallBackRatingList(String uid) {
		List<Rating> ratings=Arrays.asList(new Rating("1", "U001", "M001", 4));
		return new RatingList(ratings);
	}
}
