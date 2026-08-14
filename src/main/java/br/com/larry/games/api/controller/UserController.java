package br.com.larry.games.api.controller;

import br.com.larry.games.api.UserAPI;
import br.com.larry.games.dto.request.UserCreateRequestDTO;
import br.com.larry.games.dto.request.UserUpdateRequestDTO;
import br.com.larry.games.dto.response.UserResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class UserController implements UserAPI {

    @Override
    public ResponseEntity<UserResponseDTO> createUser(UserCreateRequestDTO request) {
        return null;
    }

    @Override
    public ResponseEntity<List<UserResponseDTO>> getAllUsers() {
        List<UserResponseDTO> list = Arrays.asList(
                new UserResponseDTO(1L, "larry_diego", "larry@email.com"),
                new UserResponseDTO(2L, "nicole_limac", "nicole@email.com")
        );

        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<UserResponseDTO> getUserById(String idUser) {
        UserResponseDTO user = new UserResponseDTO(1L, "larry_diego", "larry@email.com");

        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<UserResponseDTO> updateUser(String idUser, UserUpdateRequestDTO request) {
        return null;
    }

    @Override
    public ResponseEntity<Void> deleteUserById(String idUser) {
        return null;
    }
}
