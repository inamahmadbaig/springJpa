package com.nit.service;

import java.util.List;

import org.hibernate.query.SortDirection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.nit.entity.Movie;
import com.nit.repository.MovieRepository;
@Service
public class MovieServiceImpl implements IMovieService {
	
	@Autowired
	private MovieRepository movieRepository;
	@Override
	public void insertMovice(Iterable<Movie> movice) {
		// TODO Auto-generated method stub
		movieRepository.saveAll(movice);
	}

	@Override
	public List<Movie> sortByMovieName(String direction) {
		// 1. Direction set kiya
		Sort.Direction sort = direction.equalsIgnoreCase("asc") ? Sort.Direction.ASC : Sort.Direction.DESC;
		// 2. Sort.by() mein direction aur field ka exact naam pass kiya
		return movieRepository.findAll(Sort.by(sort, "movieName"));
	}

	@Override
	public List<Movie> sortMoviesByTicketPrice(String direction) {
		Sort.Direction sort = direction.equalsIgnoreCase("asc") ? Sort.Direction.ASC : Sort.Direction.DESC;
		return movieRepository.findAll(Sort.by(sort,"ticketPrice"));
	}

}
