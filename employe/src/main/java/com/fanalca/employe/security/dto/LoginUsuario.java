package com.fanalca.employe.security.dto;

import javax.validation.constraints.NotBlank;

public class LoginUsuario {
    @NotBlank
    private String username;
    @NotBlank
    private String password;

    public String getUserName() {
        return username;
    }

    public void setUserName(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
