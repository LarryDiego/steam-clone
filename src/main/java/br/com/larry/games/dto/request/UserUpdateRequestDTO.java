package br.com.larry.games.dto.request;

public record UserUpdateRequestDTO(
        String email,
        String password
) {
}
