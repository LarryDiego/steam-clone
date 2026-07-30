package br.com.larry.games.model.entity;

import br.com.larry.games.model.enums.Language;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity(name = "GameDetail")
@Table(name = "GAME_DETAIL")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class GameDetailEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_GAME_DETAIL")
    private Long idGameDetail;

    @Column(name = "DESCRIPTION", columnDefinition = "TEXT")
    private String description;

    @Column(name = "DEVELOPER", nullable = false)
    private String developer;

    @Column(name = "PUBLISHER", nullable = false)
    private String publisher;

    @ElementCollection(fetch = FetchType.LAZY)
    @CollectionTable(
            name = "GAME_SUPPORTED_LANGUAGE",
            joinColumns = @JoinColumn(name = "ID_GAME_DETAIL")
    )
    @Column(name = "LANGUAGE", nullable = false)
    @Enumerated(EnumType.STRING)
    @Builder.Default
    private Set<Language> supportedLanguages = new HashSet<>();
}
