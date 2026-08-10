package br.com.larry.games.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity(name = "Category")
@Table(name = "CATEGORY")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class CategoryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CATEGORY")
    private Long idCategory;

    @Column(name = "NAME", unique = true, nullable = false, updatable = false)
    private String name;

    @ManyToMany(mappedBy = "categories")
    @Builder.Default
    private Set<GameEntity> games = new HashSet<>();
}
