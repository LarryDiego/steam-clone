package br.com.larry.games.api;

import br.com.larry.games.dto.request.UserCreateRequestDTO;
import br.com.larry.games.dto.request.UserUpdateRequestDTO;
import br.com.larry.games.dto.response.UserResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(path = "/users")
public interface UserAPI {

    @PostMapping
    ResponseEntity<UserResponseDTO> createUser(@RequestBody UserCreateRequestDTO request);

    @GetMapping
    ResponseEntity<List<UserResponseDTO>> getAllUsers();

    @GetMapping(path = "/{idUser}")
    ResponseEntity<UserResponseDTO> getUserById(@PathVariable(name = "idUser") String idUser);

    @PutMapping(path = "/{idUser}")
    ResponseEntity<UserResponseDTO> updateUser(@PathVariable(name = "idUser") String idUser, @RequestBody UserUpdateRequestDTO request);

    @DeleteMapping(path = "/{idUser}")
    ResponseEntity<Void> deleteUserById(@PathVariable(name = "idUser") String idUser);
}
