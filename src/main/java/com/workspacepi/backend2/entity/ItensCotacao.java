package com.workspacepi.backend2.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "Itens")
@Getter // Gerar todos os getters necessários.
@AllArgsConstructor
@NoArgsConstructor
public class ItensCotacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_id")
    private Long id;

    @Column(name = "descricao", nullable = false)
    private String descricao;

    @Column(name = "quantidade", nullable = false)
    private Integer quantidade;

    @Column(name = "observacoes", nullable = false)
    private String observacoes;

    @ManyToOne
    @JoinColumn(name = "id_cotacao")
    private SolicitarCotacao solicitarCotacao;

    // Nova relação com ResponderCotacaoItem
    @OneToOne(mappedBy = "itemCotacao", cascade = CascadeType.ALL)
    private ResponderCotacaoItem responderCotacaoItem;
}
