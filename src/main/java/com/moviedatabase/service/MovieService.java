package com.moviedatabase.service;

import org.springframework.stereotype.Service;

import com.moviedatabase.dto.Movie;
import com.moviedatabase.repository.MovieRepository;

import reactor.core.publisher.Mono;

@Service
public class MovieService {

	private final MovieRepository movieRepository;

	public MovieService(MovieRepository movieRepository) {
		this.movieRepository = movieRepository;
	}

	public Mono<Movie> getMovieByTitle(String title) {
		return movieRepository.findByTitle(title); // Return Mono for asynchronous handling
	}

	public Mono<Movie> saveMovie(Movie movie) {
		return movieRepository.save(movie); // Save movie reactively
	}
}
