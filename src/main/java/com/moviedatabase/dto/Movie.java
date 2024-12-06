package com.moviedatabase.dto;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

@Data
@Table("movies")
public class Movie {

	@Id
	private Long id;
	
	private String title;
	private String genre;
	private int year;
	private String director;
	private String cast;
	private String description;
	private double rating;
}
