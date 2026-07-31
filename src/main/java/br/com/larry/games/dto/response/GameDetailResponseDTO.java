package br.com.larry.games.dto.response;

import br.com.larry.games.model.enums.Language;

import java.util.Set;

public record GameDetailResponseDTO(
        Long idGameDetail,
        String description,
        String developer,
        String publisher,
        Set<Language> supportedLanguages
) {
}
