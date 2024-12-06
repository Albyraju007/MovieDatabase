package com.moviedatabase.controller;

import org.springframework.web.bind.annotation.*;

import com.moviedatabase.dto.Movie;
import com.moviedatabase.service.MovieService;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/movies")
public class MovieController {

	private final MovieService movieService;

	public MovieController(MovieService movieService) {
		this.movieService = movieService;
	}

	@GetMapping("/{title}")
	public Mono<Movie> getMovieByTitle(@PathVariable String title) {
		return movieService.getMovieByTitle(title);
	}

	@PostMapping
	public Mono<Movie> addMovie(@RequestBody Movie movie) {
		return movieService.saveMovie(movie);
	}
}
