package com.sujata.resource;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


import com.sujata.bean.MovieDetailsList;
import com.sujata.service.MovieCatalogService;

@RestController
public class MovieCatalogResource {

	@Autowired
	private MovieCatalogService movieCatalogService;
	
	@GetMapping(path="/catalogs/{uid}")
	public MovieDetailsList getMovieDetailsByUserId(@PathVariable("uid")String userId){
		return movieCatalogService.getMovieDetailsByUserId(userId);
	}
}
