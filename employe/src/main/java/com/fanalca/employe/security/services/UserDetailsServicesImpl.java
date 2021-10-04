package com.fanalca.employe.security.services;

import com.fanalca.employe.security.entity.Usuario;
import com.fanalca.employe.security.entity.UsuarioPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServicesImpl implements UserDetailsService {

    @Autowired
    UsuarioServices usuarioServices;

    @Override
    public UserDetails loadUserByUsername(String nombreUsuario) throws UsernameNotFoundException {
        Usuario usuario = usuarioServices.getByUserName(nombreUsuario).get();
        return UsuarioPrincipal.build(usuario);
    }
}
