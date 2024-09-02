package com.workspacepi.backend2.entity;

import com.workspacepi.backend2.enumns.Categorias;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Solicitacoes")
@Getter // Gerar todos os getters necessários.
@AllArgsConstructor
@NoArgsConstructor
public class SolicitarCotacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_cotacao")
    private Long id;

    @CreationTimestamp
    private Instant creationTimestamp;

    @ManyToOne
    @JoinColumn(name = "id_autor", nullable = false)
    private Usuario autor;

    @Column(name = "categoria")
    private Categorias categoria;

    @OneToMany(mappedBy = "solicitarCotacao", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<ItensCotacao> itensCotacao = new HashSet<>();

    @OneToMany(mappedBy = "solicitacao", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<ResponderCotacao> respostaCotacao = new HashSet<>();

}
