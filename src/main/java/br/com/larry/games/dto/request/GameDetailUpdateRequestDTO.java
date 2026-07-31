package br.com.larry.games.dto.request;

import br.com.larry.games.model.enums.Language;

import java.util.Set;

public record GameDetailUpdateRequestDTO(
        String description,
        String developer,
        String publisher,
        Set<Language> supportedLanguages
) {
}
