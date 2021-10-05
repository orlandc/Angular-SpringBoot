package com.fanalca.employe.security.dto;

import javax.validation.constraints.NotBlank;

import java.util.HashSet;
import java.util.Set;

public class NuevoUsuario {
    @NotBlank
    private String userName;

    @NotBlank
    private String Password;

    private Set<String> roles = new HashSet<>();

    public String getUserName() {
        return userName;
    }

    public void setUserName(String username) {
        this.userName = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        this.Password = password;
    }

    public Set<String> getRoles() {
        return roles;
    }

    public void setRoles(Set<String> roles) {
        this.roles = roles;
    }
}
