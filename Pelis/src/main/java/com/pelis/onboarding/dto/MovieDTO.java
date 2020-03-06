package com.pelis.onboarding.dto;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class MovieDTO {

	private Integer id;
	private String title;
	private String genre;
	private String year;
	private String oscars;
	@JsonIgnoreProperties("movies")
	private Set<ActorSimpleDTO> actors;
	 
	
	public Integer getId() { 
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getOscarAwards() {
		return oscars;
	}
	public void setOscarAwards(String oscarAwards) {
		this.oscars = oscarAwards;
	}
	public Set<ActorSimpleDTO> getActors() {
		return actors;
	}
	public void setActors(Set<ActorSimpleDTO> characters) {
		this.actors = characters;
	}
}
