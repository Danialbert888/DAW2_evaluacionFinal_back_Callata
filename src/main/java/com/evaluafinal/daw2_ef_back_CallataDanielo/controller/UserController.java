package com.evaluafinal.daw2_ef_back_CallataDanielo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.evaluafinal.daw2_ef_back_CallataDanielo.models.Ticket;
import com.evaluafinal.daw2_ef_back_CallataDanielo.models.User;
import com.evaluafinal.daw2_ef_back_CallataDanielo.service.UserService;

// origins = "*",allowedHeaders = "*"

@CrossOrigin( value = "http://localhost:4200")
@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService service;

	@GetMapping("/users")
	public List<User> listar(){
		return service.list();
	}
	
	@GetMapping("/users/{id}")
	public ResponseEntity<User> obteneruserxid(@PathVariable("id") int id){
		User user=service.buscarxid(id);
		return ResponseEntity.ok(user);
	}
	
	
	
	@PostMapping("/users")
	public User guardar(@RequestBody User user) {
		return service.add(user);
	}
	
	@PutMapping("/users/{id}")
	public ResponseEntity<User> actualizaruser(@PathVariable("id") int id,@RequestBody User userrecibido){
		User user=service.buscarxid(id);
		user.setCreateAtDate(userrecibido.getCreateAtDate());
		user.setEmailString(userrecibido.getEmailString());
		user.setIsActive(userrecibido.getIsActive());
		user.setKind(userrecibido.getKind());
		user.setLastnameString(userrecibido.getLastnameString());
		user.setNameString(userrecibido.getNameString());
		user.setPasswordString(userrecibido.getPasswordString());
		user.setUsernameString(userrecibido.getUsernameString());
		
		service.add(user);
		return ResponseEntity.ok(user);
	}
	
	@DeleteMapping("/users/{id}")
	public ResponseEntity<Map<String, Boolean>> eliminaruser(@PathVariable("is") int id){
		User user=service.buscarxid(id);
		
		service.delete(user.getIdUser());
		Map<String, Boolean> respuesta=new HashMap<>();
		respuesta.put("eliminado", Boolean.TRUE);
		return ResponseEntity.ok(respuesta);
	}
	
	
	
}
