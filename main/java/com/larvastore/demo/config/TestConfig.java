package com.larvastore.demo.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.larvastore.demo.entidades.Category;
import com.larvastore.demo.entidades.Order;
import com.larvastore.demo.entidades.User;
import com.larvastore.demo.entidades.enums.OrderStatus;
import com.larvastore.demo.repositories.CategoryRepository;
import com.larvastore.demo.repositories.OrderRepository;
import com.larvastore.demo.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Category cat1 = new Category(null, "Eletronicos");
		Category cat2 = new Category(null, "Livros");
		Category cat3 = new Category(null, "Esportes");
		
		

		
		User u1 = new User(null, "juan", "teste@gmail.com", "27592195", "1234567");
		User u2 = new User(null, "juan2", "teste2@gmail.com", "275921951", "12345673");
		
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.WAITING_PAYMENT, u1);
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.PAID, u2);
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.DELIVERED, u1);
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
		categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
	}
}
