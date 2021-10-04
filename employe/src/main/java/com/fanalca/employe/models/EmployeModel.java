package com.fanalca.employe.models;

import javax.persistence.*;

@Entity
@Table(name = "employees")
public class EmployeModel {
    @Id
    @Column(unique = true, nullable = false)
    private Long nui;
    
    private Integer typenui;
    private String  nombres;
    private String  apellidos;
    private Integer area;
    private Integer subarea;

    public void setNui(Long nui) {
        this.nui = nui;
    }

    public Long getNui() {
        return nui;
    }

    public void setTypenui(Integer typenui) {
        this.typenui = typenui;
    }

    public Integer getTypenui() {
        return typenui;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public Integer getArea() {
        return area;
    }

    public void setSubarea(Integer subarea) {
        this.subarea = subarea;
    }

    public Integer getSubarea() {
        return subarea;
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
}