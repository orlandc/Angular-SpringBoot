package com.fanalca.employe.models;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import org.springframework.lang.NonNull;

@Entity
@Table(name = "employees")
public class EmployeModel {
    @Id
    @Column(unique = true, nullable = false)
    private Long nui;
    
    @NonNull
    private String  nombres;

    @NonNull
    private String  apellidos;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "typenui")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private TypenuiModel typenuiModel;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "subarea")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private SubareaModel subareaModel;

    public void setNui(Long nui) {
        this.nui = nui;
    }

    public Long getNui() {
        return nui;
    }

    public void setNombre(String nombres) {
        this.nombres = nombres;
    }

    public String getNombre() {
        return nombres;
    }

    public void setApellido(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getApellido() {
        return apellidos;
    }

    public TypenuiModel getTypenuiModel(){
        return typenuiModel;
    }

    public void setTypenuiModel(TypenuiModel typenuiModel) {
        this.typenuiModel = typenuiModel;
    }

    public SubareaModel getSubareaModel(){
        return subareaModel;
    }

    public void setSubareaModel(SubareaModel subareaModel) {
        this.subareaModel = subareaModel;
    }
}