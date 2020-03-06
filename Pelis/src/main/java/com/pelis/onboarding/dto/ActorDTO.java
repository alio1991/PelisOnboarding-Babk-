package com.pelis.onboarding.dto;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class ActorDTO {

	private Integer id;
	private String name;
	private String surname;
	@JsonIgnoreProperties("actors")
	private Set<MovieSimpleDTO> movies;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public Set<MovieSimpleDTO> getMovies() {
		return movies;
	}
	public void setMovies(Set<MovieSimpleDTO> movies) {
		this.movies = movies;
	}
	

}
