package br.com.larry.games.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "Game")
@Table(name = "GAME")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class GameEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_GAME")
    private Long idGame;

    @Column(name = "TITLE", unique = true, nullable = false)
    private String title;

    @Column(name = "PRICE", nullable = false)
    private BigDecimal price;

    @Column(name = "RELEASE_DATE", nullable = false, updatable = false)
    private LocalDate releaseDate;

    @Column(name = "ACTIVE")
    private Boolean active = true;

    @OneToOne
    @JoinColumn(name = "ID_GAME_DETAIL")
    private GameDetailEntity gameDetail;

    @ManyToMany(mappedBy = "games")
    private Set<GameOrderEntity> orders;

    @ManyToMany
    @JoinTable(
            name = "GAME_CATEGORY",
            joinColumns = @JoinColumn(name = "ID_GAME"),
            inverseJoinColumns = @JoinColumn(name = "ID_CATEGORY")
    )
    @Builder.Default
    private Set<CategoryEntity> categories = new HashSet<>();
}
