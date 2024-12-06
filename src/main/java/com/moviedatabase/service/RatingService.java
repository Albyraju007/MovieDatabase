package com.moviedatabase.service;

import org.springframework.stereotype.Service;

import com.moviedatabase.dto.Rating;
import com.moviedatabase.repository.RatingRepository;

import reactor.core.publisher.Mono;

@Service
public class RatingService {

	private final RatingRepository ratingRepository;

	public RatingService(RatingRepository ratingRepository) {
		this.ratingRepository = ratingRepository;
	}

	public Mono<Rating> saveRating(Rating rating) {
		return ratingRepository.save(rating); // Save rating reactively
	}
}
