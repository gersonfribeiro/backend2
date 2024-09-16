package com.workspacepi.backend2.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.awt.*;
import java.util.UUID;


@Entity
@Table(name = "Itens")
@Getter // Gerar todos os getters necessários.
@Setter // Gerar todos os setters necessários.
@AllArgsConstructor
@NoArgsConstructor
public class ItensCotacao {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "item_id")
    private UUID id;

    @Column(name = "descricao", nullable = false, length = 50)
    private String descricao;

    @Column(name = "quantidade", nullable = false)
    private Integer quantidade;

    @Column(name = "observacoes", nullable = false)
    private TextArea observacoes;

//  Relacionamentos
    @ManyToOne
    @JoinColumn(name = "id_cotacao")
    private SolicitarCotacao solicitarCotacao;

    @OneToOne(mappedBy = "itemCotacao", cascade = CascadeType.ALL)
    private ResponderCotacaoItem responderCotacaoItem;
}
