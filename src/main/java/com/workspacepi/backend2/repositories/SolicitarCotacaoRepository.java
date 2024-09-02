package com.workspacepi.backend2.repositories;

import com.workspacepi.backend2.entity.Endereco;
import com.workspacepi.backend2.entity.SolicitarCotacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SolicitarCotacaoRepository extends JpaRepository<SolicitarCotacao, Long>{
    
}
