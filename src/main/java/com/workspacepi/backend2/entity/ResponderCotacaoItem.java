package com.workspacepi.backend2.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Respostas_itens")
@Getter // Gerar todos os getters necessários.
@Setter // Gerar todos os setters necessários.
@AllArgsConstructor
@NoArgsConstructor
public class ResponderCotacaoItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "preco_oferecido", nullable = false)
    private Double precoOferecido;

    @Column(name = "observacoes")
    private String observacoes;

//    Relacionamentos
    @OneToOne
    @JoinColumn(name = "id_item_cotacao", nullable = false)
    private ItensCotacao itemCotacao;

    @ManyToOne
    @JoinColumn(name = "id_resposta_cotacao", nullable = false)
    private ResponderCotacao responderCotacao;

}



