package com.sujata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.sujata.bean.MovieDetailsList;
import com.sujata.service.MovieCatalogService;

@Controller
public class MovieCatalogController {

	@Autowired
	private MovieCatalogService movieCatalogService;
	
	@RequestMapping("/")
	public String mainPage(){
		return "index";
	}
	
	@RequestMapping("/getUserId")
	public String userIdInputPage(){
		return "inputUserId";
	}
	
	@RequestMapping("/search")
	public ModelAndView searchRating(String userId){
		ModelAndView mv=new ModelAndView();
		MovieDetailsList movieDetailList=movieCatalogService.getDetails(userId);
		mv.addObject("movieDetailList", movieDetailList.getMoviesDetails());
		mv.setViewName("showRating");
		return mv;
	}
}
