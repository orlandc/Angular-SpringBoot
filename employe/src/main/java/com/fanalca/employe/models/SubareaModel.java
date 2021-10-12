package com.fanalca.employe.models;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import org.springframework.lang.NonNull;

@Entity
@Table(name = "subarea")
public class SubareaModel {
    @Id
    @Column(unique = true, nullable = false, name = "id_subarea")
    private Long id;

    @NonNull
    private String  nombre;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "area")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private AreaModel areaModel;

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

    public AreaModel getAreaModel() {
        return areaModel;
    }

    public void setAreaModel(AreaModel areaModel) {
        this.areaModel = areaModel;
    }
}
