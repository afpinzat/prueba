
package com.uce.modelo;

import jakarta.persistence.*;
import java.time.LocalDate;


@Entity
@Table(name = "asignatura")


public class Asignatura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String codigo;
    private String nombre;
    private String nivel;
    private Integer creditos;
    private LocalDate fechaCreacion;

    public Asignatura(){}

    public Asignatura(String codigo, String nombre, String nivel, Integer creditos){
        this.codigo = codigo;
        this.nombre = nombre;
        this.nivel = nivel;
        this.creditos = creditos;
        this.fechaCreacion = LocalDate.now();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public Integer getCreditos() {
        return creditos;
    }

    public void setCreditos(Integer creditos) {
        this.creditos = creditos;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    
    
}
