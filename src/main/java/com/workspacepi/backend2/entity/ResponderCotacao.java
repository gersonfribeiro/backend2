package com.workspacepi.backend2.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Table(name = "Cotacoes_respondidas")
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ResponderCotacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_usuario", nullable = false)
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "id_solicitacao", nullable = false)
    private SolicitarCotacao solicitacao;

    @OneToMany(mappedBy = "responderCotacao", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<ResponderCotacaoItem> itensRespondidos;
}

