package com.workspacepi.backend2.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "Destinatarios")
@Getter // Gerar todos os getters necessários.
@Setter // Gerar todos os setters necessários.
@AllArgsConstructor
@NoArgsConstructor
public class Destinatarios {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_resposta")
    private UUID id;

//  Relacionamentos
    @ManyToOne
    @JoinColumn(name = "id_fornecedor", nullable = false)
    private Empresa empresa;

    @ManyToOne
    @JoinColumn(name = "id_solicitacao", nullable = false)
    private SolicitarCotacao solicitacao;

    @OneToMany(mappedBy = "itensCotacao", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<ResponderCotacaoItem> itensRespondidos;
}
