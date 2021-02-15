package com.example.democrud.dao.api;

import com.example.democrud.model.Usuario;

import org.springframework.data.repository.CrudRepository;

public interface UsuarioDaoAPI extends CrudRepository<Usuario, Long> {

	Usuario findByUsuario(String usuario);
}
