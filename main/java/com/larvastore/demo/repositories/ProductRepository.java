package com.larvastore.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.larvastore.demo.entidades.Product;


public interface ProductRepository extends JpaRepository<Product, Long>{

}
