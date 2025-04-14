package com.ads.sustancia.repository;

import com.ads.sustancia.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    boolean existsUsuarioByEmail(String email);
    Optional<Usuario> findByEmail(String email);

}
