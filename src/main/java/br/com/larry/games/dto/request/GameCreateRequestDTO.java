package br.com.larry.games.dto.request;

import java.math.BigDecimal;
import java.time.LocalDate;

public record GameCreateRequestDTO(
        String title,
        BigDecimal price,
        LocalDate releaseDate,
        Boolean active
) {
}
