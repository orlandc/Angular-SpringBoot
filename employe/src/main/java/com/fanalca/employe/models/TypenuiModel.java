package com.fanalca.employe.models;

import javax.persistence.*;

import org.springframework.lang.NonNull;

@Entity
@Table(name = "typenui")
public class TypenuiModel {
    @Id
    @Column(unique = true, nullable = false, name = "id_typenui")
    private Long id;

    @NonNull
    private String typenui;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombres() {
        return typenui;
    }

    public void setNombres(String nombre) {
        this.typenui = nombre;
    }
}
