package br.com.larry.games.dto.request;

import java.math.BigDecimal;

public record GameUpdateRequestDTO(
        String title,
        BigDecimal price,
        Boolean active
) {
}
