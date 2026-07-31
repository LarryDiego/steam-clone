package br.com.larry.games.dto.request;

public record UserRequestDTO(
        String username,
        String email,
        String password
) {
}
