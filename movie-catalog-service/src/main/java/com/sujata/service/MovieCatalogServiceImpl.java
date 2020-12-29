package com.sujata.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.sujata.bean.Movie;
import com.sujata.bean.MovieDetails;
import com.sujata.bean.MovieDetailsList;
import com.sujata.bean.Rating;
import com.sujata.bean.RatingList;


@Service
public class MovieCatalogServiceImpl implements MovieCatalogService {

	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public MovieDetailsList getMovieDetailsByUserId(String uid) {
		List<MovieDetails> moviesDetails=new ArrayList<>();
		
//		RatingList ratings=restTemplate.getForObject("http://localhost:8086/ratings/"+uid, RatingList.class);
		RatingList ratings=restTemplate.getForObject("http://rating-data-service/ratings/"+uid, RatingList.class);
		
		for(Rating rating:ratings.getRatings()){
//			Movie movie=restTemplate.getForObject("http://localhost:8085/movies/"+rating.getMovieId(), Movie.class);
			Movie movie=restTemplate.getForObject("http://movie-info-service/movies/"+rating.getMovieId(), Movie.class);
			
			MovieDetails movieDetail=new MovieDetails(movie.getMovieName(), rating.getRating(), uid);
			
			moviesDetails.add(movieDetail);
		}
		MovieDetailsList movieDetailsList=new MovieDetailsList(moviesDetails);
		return movieDetailsList;

	}

}
