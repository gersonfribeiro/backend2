package com.workspacepi.backend2.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "Imagens")
@Getter // Gerar todos os getters necessários.
@Setter // Gerar todos os setters necessários.
@AllArgsConstructor
@NoArgsConstructor
public class Imagens {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_imagem")
    private UUID id;

    @Column(name = "url_imagem")
    private String url_imagem;

//    Relacionamentos
    @ManyToOne
    @JoinColumn(name = "id_usuario", nullable = false)
    private Usuario usuario;

}
