package br.com.larry.games.dto.request;

import br.com.larry.games.model.enums.GameOrderStatus;

public record GameOrderUpdateRequestDTO(
        GameOrderStatus status
) {
}
