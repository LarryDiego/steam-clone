package br.com.larry.games.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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
}
