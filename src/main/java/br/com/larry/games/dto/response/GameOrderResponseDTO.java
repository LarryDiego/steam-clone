package br.com.larry.games.dto.response;

import br.com.larry.games.model.enums.GameOrderStatus;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Set;

public record GameOrderResponseDTO(
        Long idGameOrder,
        BigDecimal totalPrice,
        GameOrderStatus status,
        UserResponseDTO user,
        Set<GameResponseDTO> games,
        LocalDateTime purchaseDate,
        LocalDateTime updatedAt
) {
}
