package com.moviedatabase.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.moviedatabase.dto.Movie;

import reactor.core.publisher.Mono;

public interface MovieRepository extends ReactiveCrudRepository<Movie, Long> {
	Mono<Movie> findByTitle(String title); // Reactive method to find by title
}
