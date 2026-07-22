package com.nit.service;

import java.util.List;

import com.nit.entity.Movie;

public interface IMovieService {

	public void insertMovice(Iterable<Movie> movice);
	public List<Movie> sortByMovieName(String direction);
	public List<Movie> sortMoviesByTicketPrice(String direction);
	
}
