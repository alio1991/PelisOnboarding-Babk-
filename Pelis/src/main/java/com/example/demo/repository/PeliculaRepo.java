package com.example.demo.repository;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Pelicula;

public interface PeliculaRepo extends CrudRepository<Pelicula, Integer>{

	
}
