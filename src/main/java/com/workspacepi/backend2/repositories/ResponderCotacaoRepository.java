package com.workspacepi.backend2.repositories;

import com.workspacepi.backend2.entity.Destinatarios;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResponderCotacaoRepository extends JpaRepository<Destinatarios, Long>{
    
}
