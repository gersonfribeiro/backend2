//package com.workspacepi.backend2.DTOs;
//
//// Importa a classe Date para trabalhar com datas
//import com.workspacepi.backend2.entity.SolicitarCotacao;
//
//import java.util.Date;
//
//// Define um registro (record) chamado SolicitacaoResponseDTO com os campos especificados
//public record SolicitacaoResponseDTO(
//        Long id, // Identificador único da solicitacao
//        String cpf, // CPF do solicitante
//        Date data, // Data da solicitacao
//        String destinado // Nome do destinado
//        ) {
//    // Construtor que cria um SolicitacaoResponseDTO a partir de uma instância de Solicitacao
//    public SolicitacaoResponseDTO(SolicitarCotacao solicitacao) {
//        // Chama o construtor principal do record usando os dados da instância de Solicitacao fornecida
//        this(
//                solicitacao.getId(),
//                solicitacao.getCpf(),
//                solicitacao.getData(),
//                solicitacao.getDestinado()
//        );
//    }
//}
