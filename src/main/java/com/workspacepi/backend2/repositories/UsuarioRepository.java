package com.workspacepi.backend2.repositories;

import com.workspacepi.backend2.entity.Endereco;
import com.workspacepi.backend2.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
    Optional<Usuario> findByUsername(String username);
}
