package com.larvastore.demo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.larvastore.demo.entidades.User;
import com.larvastore.demo.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "juan", "teste@gmail.com", "27592195", "1234567");
		User u2 = new User(null, "juan2", "teste2@gmail.com", "275921951", "12345673");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
	}
}
