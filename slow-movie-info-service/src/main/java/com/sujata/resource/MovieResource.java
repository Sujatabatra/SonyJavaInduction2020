package com.sujata.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sujata.bean.Movie;
import com.sujata.service.MovieService;

@RestController
public class MovieResource {

	@Autowired
	private MovieService movieService;
	
	@GetMapping(path="/movies/{id}")
	public Movie getMovieByIdResource(@PathVariable("id")String mId){
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return movieService.getMovieById(mId);
	}
	
}
