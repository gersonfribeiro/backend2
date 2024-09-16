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
@Table(name = "Usuarios")
@Getter // Gerar todos os getters necessários.
@Setter // Gerar todos os setters necessários.
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_usuario")
    private UUID id;

    @Column(name = "nome_usuario", length = 50)
    private String nome_usuario;

    @Column(name = "senha_criptografada")
    private String senha_criptografada;

    @Column(name = "email", unique = true, nullable = false, length = 70)
    private String email;


//  Relacionamentos
    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Telefone> telefone = new HashSet<>();

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Endereco> endereco = new HashSet<>();

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Imagens> imagens = new HashSet<>();

    @OneToMany(mappedBy = "autor", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<SolicitarCotacao> solicitarCotacaos = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "id_empresa", nullable = false)
    private Empresa empresa;

}
