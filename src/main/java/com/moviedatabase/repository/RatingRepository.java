package com.moviedatabase.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.moviedatabase.dto.Rating;

public interface RatingRepository extends ReactiveCrudRepository<Rating, Long> {
	// Custom queries for ratings can be added here
}
