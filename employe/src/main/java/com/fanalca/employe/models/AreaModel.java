package com.fanalca.employe.models;

import javax.persistence.*;

import org.springframework.lang.NonNull;

@Entity
@Table(name = "area")
public class AreaModel {
    @Id
    @Column(unique = true, nullable = false, name = "id_area")
    private Long id;

    @NonNull
    private String  nombre;
    
    public void setId(Long id) {
        this.id = id;
    }

    public Long getID() {
        return id;
    }

    public void setNombre(String nombres) {
        this.nombre = nombres;
    }

    public String getNombre() {
        return nombre;
    }
}
