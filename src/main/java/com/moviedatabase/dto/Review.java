package com.moviedatabase.dto;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table("reviews")
public class Review {

	@Id
	private Long id;
	
	private String reviewText;
	private Long movieId;
}
