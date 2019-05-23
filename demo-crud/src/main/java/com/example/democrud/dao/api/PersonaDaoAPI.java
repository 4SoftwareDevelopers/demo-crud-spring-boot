package com.example.democrud.dao.api;

import org.springframework.data.repository.CrudRepository;

import com.example.democrud.model.Persona;

public interface PersonaDaoAPI extends CrudRepository<Persona, Long> {

}
