package com.larvastore.demo.resourcers;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.larvastore.demo.entidades.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User(1L, "juan", "teste@gmail.com", "27963451", "12345678");
		
		return ResponseEntity.ok().body(u);
	}

	
}
