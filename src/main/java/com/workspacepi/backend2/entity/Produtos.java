package com.workspacepi.backend2.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "Produtos")
@Getter // Gerar todos os getters necessários.
@Setter // Gerar todos os setters necessários.
@AllArgsConstructor
@NoArgsConstructor
public class Produtos {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_produto")
    private UUID id;

    @Column(name = "descricao_produto")
    private String descricao;

}
