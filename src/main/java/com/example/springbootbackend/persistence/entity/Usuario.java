package com.example.springbootbackend.persistence.entity;


import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;


@Entity
@Table(name="tbl_usuario")
public class Usuario {
    @Id
    @JsonProperty("rutUsuario")
    @Column(unique = true,nullable = true,updatable = false)
    private String rutUsuario;
    @JsonProperty("nombre")
    private String nombre;
    @JsonProperty("apellido")
    private String apellido;

    @JsonProperty("edad")
    private Long edad;

    @JsonProperty("pais")
    private String pais;

    @JsonProperty("residencia")
    private String residencia;

    public Usuario() {
    }

    public Usuario(String rutUsuario, String nombre, String apellido, Long edad, String pais, String residencia) {

        this.rutUsuario = rutUsuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.pais = pais;
        this.residencia = residencia;
    }

    public String getRutUsuario() {

        return rutUsuario;
    }

    public Long getEdad() {
        return edad;
    }

    public void setEdad(Long edad) {
        this.edad = edad;
    }

    public void setRutUsuario(String rutUsuario) {
        this.rutUsuario = rutUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }



    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getResidencia() {
        return residencia;
    }

    public void setResidencia(String residencia) {
        this.residencia = residencia;
    }

    @Override
    public String toString() {
        return "Usuario{" +

                ", rutUsuario='" + rutUsuario + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad='" + edad + '\'' +
                ", pais='" + pais + '\'' +
                ", residencia='" + residencia + '\'' +
                '}';
    }
}