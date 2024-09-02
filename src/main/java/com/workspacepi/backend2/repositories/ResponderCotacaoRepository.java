package com.workspacepi.backend2.repositories;

import com.workspacepi.backend2.entity.Endereco;
import com.workspacepi.backend2.entity.ResponderCotacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResponderCotacaoRepository extends JpaRepository<ResponderCotacao, Long>{
    
}
