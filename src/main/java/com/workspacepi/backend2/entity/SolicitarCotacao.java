package com.workspacepi.backend2.entity;

import com.workspacepi.backend2.enumns.StatusEnumns;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "Cotacoes")
@Getter // Gerar todos os getters necessários.
@Setter // Gerar todos os setters necessários.
@AllArgsConstructor
@NoArgsConstructor
public class SolicitarCotacao {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "Id_cotacao")
    private UUID id;

    @CreationTimestamp
    @Column(name = "data_solicitacao")
    private Timestamp data_registro = Timestamp.from(Instant.now());

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private StatusEnumns status;

//  Relacionamentos
    @ManyToOne
    @JoinColumn(name = "id_autor", nullable = false)
    private Usuario autor;

    @OneToMany(mappedBy = "solicitarCotacao", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<ItensCotacao> itensCotacao = new HashSet<>();

    @OneToMany(mappedBy = "solicitacao", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Destinatarios> respostaCotacao = new HashSet<>();

}
