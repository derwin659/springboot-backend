package com.example.springbootbackend.web.controller;

import com.example.springbootbackend.Pojo.User;
import com.example.springbootbackend.domain.service.UsuarioService;
import com.example.springbootbackend.persistence.entity.Usuario;
import com.example.springbootbackend.validacion.Validar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/rut")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;


    @PostMapping("/usuarios")

    public ResponseEntity<User> postBody(@RequestBody String rut,User user) {

        if (Validar.validaRut(rut)) {

            try {
                Optional<Usuario> datos = usuarioService.ObtenerUno(rut);


                if (datos.isPresent()) {

                    user.setNombre(datos.get().getNombre());
                    user.setApellido(datos.get().getApellido());
                    user.setEdad(datos.get().getEdad());
                    user.setPais(datos.get().getPais());
                    user.setResidencia(datos.get().getResidencia());

                    return new ResponseEntity<User>(user, HttpStatus.OK);
                } else {
                    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
                }
            } catch (Exception exception) {

                return new ResponseEntity("Servicio no disponible", HttpStatus.INTERNAL_SERVER_ERROR);

            }

        } else {
            return new ResponseEntity(rut, HttpStatus.BAD_REQUEST);
        }

    }


}


