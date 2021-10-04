package com.fanalca.employe.security.services;

import com.fanalca.employe.security.entity.Usuario;
import com.fanalca.employe.security.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class UsuarioServices {

    @Autowired
    UsuarioRepository usuarioRepository;

    public Optional<Usuario> getByUserName(String nombreUsuario){
        return usuarioRepository.findByUsername(nombreUsuario);
    }

    public boolean existsByUserName(String nombreUsuario){
        return usuarioRepository.existsByUsername(nombreUsuario);
    }

    public void save(Usuario usuario){
        usuarioRepository.save(usuario);
    }
}
