package com.example.springbootbackend.domain.service;

import com.example.springbootbackend.domain.repository.UsuarioRepository;

import com.example.springbootbackend.persistence.entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;
public void guardar(Usuario usuario){
    usuarioRepository.save(usuario);
}

    public List<Usuario> ObtenerTodos(){
        return (List<Usuario>) usuarioRepository.findAll();
    }

    public Optional<Usuario> ObtenerUno(String user){
        return  usuarioRepository.findById(user);
    }


}
