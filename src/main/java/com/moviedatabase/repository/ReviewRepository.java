package com.moviedatabase.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.moviedatabase.dto.Review;

public interface ReviewRepository extends ReactiveCrudRepository<Review, Long> {
	// Custom queries for reviews can be added here
}
