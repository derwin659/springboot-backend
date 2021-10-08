package com.example.springbootbackend.domain.repository;

import com.example.springbootbackend.persistence.entity.Usuario;
import org.springframework.context.annotation.Bean;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, String> {


    //Optional<Usuario> findById(String id);


}
