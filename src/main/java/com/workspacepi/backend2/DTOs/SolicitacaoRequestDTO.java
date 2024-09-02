package com.workspacepi.backend2.DTOs;

// Importa a classe Date para trabalhar com datas
import java.util.Date;

// Define um registro (record) chamado SolicitacaoRequestDTO com os campos especificados
public record SolicitacaoRequestDTO(
        String cpf,
        Date data,
        String destinatario) {
    // O record automaticamente cria construtor, getters, equals, hashCode e toString
}
