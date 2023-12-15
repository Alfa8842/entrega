package com.alfaairlines.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alfaairlines.models.UserModel;
import com.alfaairlines.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	private final UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}
	@PostMapping
	public ResponseEntity<UserModel> createUser(@RequestBody UserModel user) {
		UserModel createdUser = userService.createUser(user);
		return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
	}
	
	@GetMapping
	public ResponseEntity<List<UserModel>> getAllUser(){
		List<UserModel> user = userService.listUsers();
		return new ResponseEntity<>(user, HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable("id") String userId) {
        userService.delete(userId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
	@PutMapping("/{id}")
    public ResponseEntity<UserModel> updateUser(@PathVariable("id") String userId, @RequestBody UserModel updatedUser) {
        updatedUser.setId(userId);
        UserModel updated = userService.updateUser(updatedUser);
        return new ResponseEntity<>(updated, HttpStatus.OK);
    }
	
	@PostMapping("/{idUser}/{idPacote}")
    public ResponseEntity<Object> buyPacote(@PathVariable("idUser") String idUser, @PathVariable("idPacote") String idPacote) {
        try {
            if (idUser != null && idPacote != null) {
                var compra = userService.byPacotes(idUser, idPacote);
                return ResponseEntity.status(HttpStatus.OK).body(compra);
            } else {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
            }
        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
