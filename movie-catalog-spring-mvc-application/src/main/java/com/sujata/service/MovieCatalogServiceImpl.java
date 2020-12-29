package com.sujata.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.sujata.bean.MovieDetailsList;

@Service
public class MovieCatalogServiceImpl implements MovieCatalogService {

	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public MovieDetailsList getDetails(String userId) {
		
		return restTemplate.getForObject("http://localhost:8087/catalogs/"+userId, MovieDetailsList.class);
	}

}
