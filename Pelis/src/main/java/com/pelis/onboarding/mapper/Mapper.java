package com.pelis.onboarding.mapper;

import java.util.ArrayList;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.pelis.onboarding.dto.ActorDTO;
import com.pelis.onboarding.dto.ActorSimpleDTO;
import com.pelis.onboarding.dto.MovieDTO;
import com.pelis.onboarding.dto.MovieSimpleDTO;
import com.pelis.onboarding.entity.Actor;
import com.pelis.onboarding.entity.Movie;
import com.pelis.onboarding.repository.ActorRepository;
import com.pelis.onboarding.repository.MovieRepository;

public class Mapper {

	@Autowired
	MovieRepository peliculas;

	
	public static Iterable<MovieSimpleDTO> convertPeliculaToDto(Iterable<Movie> movies, MovieRepository repository) {
		ModelMapper modelMapper = new ModelMapper();
		ArrayList<MovieSimpleDTO> arrDTO = new ArrayList<MovieSimpleDTO>();
		for(Movie movie : movies) {
			Movie entity = repository.save(movie);
			MovieSimpleDTO dto  = modelMapper.map(entity, MovieSimpleDTO.class);
			arrDTO.add(dto);
		}
		Iterable<MovieSimpleDTO> iterableDTO = arrDTO;
		return iterableDTO;
	} 
	
	public static Optional<MovieDTO> convertPeliculaToDto(Optional<Movie> peli, MovieRepository repository) {
		ModelMapper modelMapper = new ModelMapper();
		Movie entity = repository.save(peli.get());
		MovieDTO dto  = modelMapper.map(entity, MovieDTO.class);
		Optional<MovieDTO> optDTO = Optional.of(dto);
		return optDTO;
	} 
	
	public static Iterable<ActorSimpleDTO> convertActorToDto(Iterable<Actor> actores, ActorRepository repository) {
		ModelMapper modelMapper = new ModelMapper();
		ArrayList<ActorSimpleDTO> arrDTO = new ArrayList<ActorSimpleDTO>();
		for(Actor actor : actores) {
			Actor entity = repository.save(actor);
			ActorSimpleDTO dto  = modelMapper.map(entity, ActorSimpleDTO.class);
			arrDTO.add(dto);
		}
		Iterable<ActorSimpleDTO> iterableDTO = arrDTO;
		return iterableDTO;
	} 
	
	public static Optional<ActorDTO> convertActorToDto(Optional<Actor> actor, ActorRepository repository) {
		ModelMapper modelMapper = new ModelMapper();
		Actor entity = repository.save(actor.get());
		ActorDTO dto  = modelMapper.map(entity, ActorDTO.class);
		Optional<ActorDTO> optDTO = Optional.of(dto);
		return optDTO;
	} 
}
