package com.example.demo3.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo3.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
