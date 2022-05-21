package com.mayanna.gradleliquibase.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mayanna.gradleliquibase.model.Usuario;

public interface UsuarioDAO extends JpaRepository<Usuario, Object>{

}
