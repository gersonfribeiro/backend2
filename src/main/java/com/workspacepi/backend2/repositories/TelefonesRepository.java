package com.workspacepi.backend2.repositories;

import com.workspacepi.backend2.entity.Endereco;
import com.workspacepi.backend2.entity.Telefone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TelefonesRepository extends JpaRepository<Telefone, Long>{

}
