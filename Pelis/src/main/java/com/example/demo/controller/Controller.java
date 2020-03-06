package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.ActorDTO;
import com.example.demo.dto.ActorSimpleDTO;
import com.example.demo.dto.PeliculaDTO;
import com.example.demo.dto.PeliculaSimpleDTO;
import com.example.demo.entity.Actor;
import com.example.demo.entity.Pelicula;
import com.example.demo.mapper.MapperDTO;
import com.example.demo.repository.ActorRepo;
import com.example.demo.repository.PeliculaRepo;

@RestController
@RequestMapping("/")
public class Controller {
	
	@Autowired
	PeliculaRepo peliculas;
	@Autowired
	ActorRepo actores;

	/**
	 * CRUD PELICULAS
	 * @return
	 */
	@RequestMapping(value = "peliculas/", method = RequestMethod.GET)
	public Iterable<PeliculaSimpleDTO> getPelis (){ 
		return MapperDTO.convertPeliculaToDto(peliculas.findAll(),peliculas);
	}

	@RequestMapping(value = "peliculas/peli", method = RequestMethod.GET)
	public Optional<PeliculaDTO> getPeli(Integer id) {
		return MapperDTO.convertPeliculaToDto(peliculas.findById(id),peliculas);
	}
	
	@RequestMapping(value = "peliculas/peli", method = RequestMethod.DELETE)
	public String deletePeli(Integer id) {
		peliculas.deleteById(id);
		return "Movie DELETED";
	}
	 
	@RequestMapping(value = "peliculas/peli", method = RequestMethod.PUT)
	public String modifyPeli(Pelicula peli) {
		peliculas.save(peli);
		return "Movie UPDATED";
	}
 
	@RequestMapping(value = "peliculas/peli", method = RequestMethod.POST)
	public String addPeli(Pelicula peli) {
		peliculas.save(peli);
		return "Movie CREATED";
	}
 
	 
	/**
	 * CRUD ACTORES
	 * @return
	 */
	@RequestMapping(value = "actores/", method = RequestMethod.GET)
	public Iterable<ActorSimpleDTO> getActores (){
		return MapperDTO.convertActorToDto(actores.findAll(),actores);
	}

	@RequestMapping(value = "actores/actor", method = RequestMethod.GET)
	public Optional<ActorDTO> getActor(Integer id) {
		return MapperDTO.convertActorToDto(actores.findById(id),actores);
	}
	
	
	@RequestMapping(value = "actores/actor", method = RequestMethod.DELETE)
	public String deleteActor(Integer id) {
		actores.deleteById(id);
		return "Character DELETED";
	}
	
	@RequestMapping(value = "actores/actor", method = RequestMethod.PUT)
	public String modifyActor(Actor actor) {
		actores.save(actor);
		return "Character UPDATED";
	}
	
	@RequestMapping(value = "actores/actor", method = RequestMethod.POST)
	public String addActor(Actor actor) {
		actores.save(actor);
		return "Character CREATED";
	}
	
}
