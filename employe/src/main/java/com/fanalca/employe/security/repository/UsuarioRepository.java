package com.fanalca.employe.security.repository;

import com.fanalca.employe.security.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    Optional<Usuario> findByUserName(String username);
    boolean existsByUserName(String username);
}
