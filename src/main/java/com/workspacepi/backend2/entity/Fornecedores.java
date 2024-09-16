package com.workspacepi.backend2.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "Fornecedores")
@Getter // Gerar todos os getters necessários.
@Setter // Gerar todos os setters necessários.
@AllArgsConstructor
@NoArgsConstructor
public class Fornecedores {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_fornecedor")
    private UUID id;

//  Relacionamentos
    @ManyToOne
    @JoinColumn(name = "id_usuario", nullable = false)
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "id_solicitacao", nullable = false)
    private SolicitarCotacao solicitacao;

    @OneToMany(mappedBy = "responderCotacao", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<ResponderCotacaoItem> itensRespondidos;
}
