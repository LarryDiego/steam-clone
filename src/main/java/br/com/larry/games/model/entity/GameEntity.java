package br.com.larry.games.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

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
}
