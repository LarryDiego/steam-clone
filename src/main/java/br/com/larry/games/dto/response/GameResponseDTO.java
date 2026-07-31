package br.com.larry.games.dto.response;

import java.math.BigDecimal;
import java.time.LocalDate;

public record GameResponseDTO(
        Long idGame,
        String title,
        BigDecimal price,
        LocalDate releaseDate,
        Boolean active,
        GameDetailResponseDTO gameDetail
) {
}
