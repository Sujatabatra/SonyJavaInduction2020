package com.sujata.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.sujata.bean.Movie;
import com.sujata.bean.MovieDetails;
import com.sujata.bean.MovieDetailsList;
import com.sujata.bean.Rating;
import com.sujata.bean.RatingList;

@Service
public class MovieCatalogServiceImpl implements MovieCatalogService {

	@Autowired
	RatingService ratingService;
	@Autowired
	MovieService movieService;

	@Override
	public MovieDetailsList getMovieDetailsByUserId(String uid) {
		List<MovieDetails> moviesDetails = new ArrayList<>();

		// rest api call method
		RatingList ratings = ratingService.getRatingList(uid);

		for (Rating rating : ratings.getRatings()) {

			// rest api call method
			Movie movie = movieService.getMovie(rating.getMovieId());

			MovieDetails movieDetail = new MovieDetails(movie.getMovieName(), rating.getRating(), uid);

			moviesDetails.add(movieDetail);
		}
		MovieDetailsList movieDetailsList = new MovieDetailsList(moviesDetails);
		return movieDetailsList;
	}

}
