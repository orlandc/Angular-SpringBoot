package com.fanalca.employe.security.dto;


import javax.validation.constraints.NotBlank;
import java.util.HashSet;
import java.util.Set;

public class NuevoUsuario {
    @NotBlank
    private String userName;

    @NotBlank
    private String password;
    private Set<String> roles = new HashSet<>();

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<String> getRoles() {
        return roles;
    }

    public void setRoles(Set<String> roles) {
        this.roles = roles;
    }
}
