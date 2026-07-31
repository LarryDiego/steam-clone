package br.com.larry.games.dto.request;

import java.util.Set;

public record GameOrderCreateRequestDTO(
        Long idUser,
        Set<Long> idGamesList
) {
}
