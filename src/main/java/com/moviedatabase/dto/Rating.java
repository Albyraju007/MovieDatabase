package com.moviedatabase.dto;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table("ratings")
public class Rating {

	@Id
	private Long id;

	private double score;
	private Long movieId;
}
