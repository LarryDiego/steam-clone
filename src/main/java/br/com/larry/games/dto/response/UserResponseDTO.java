package br.com.larry.games.dto.response;

public record UserResponseDTO(
        Long id,
        String username,
        String email
) {
}
