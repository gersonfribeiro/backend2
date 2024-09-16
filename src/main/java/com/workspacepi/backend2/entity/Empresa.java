package com.workspacepi.backend2.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "Empresas")
@Getter // Gerar todos os getters necessários.
@Setter // Gerar todos os setters necessários.
@AllArgsConstructor
@NoArgsConstructor
public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_empresa")
    private UUID id;

    @Column(name = "cnpj", length = 20, nullable = false)
    private String cnpj;

    @Column(name = "nome_empresa", length = 100)
    private String nome_empresa;

    @Column(name = "nome_fantasia", length = 50)
    private String nomeFantasia;

//  Relacionamentos
    @OneToMany(mappedBy = "empresa", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Usuario> usuarios = new HashSet<>();

}
