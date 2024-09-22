package com.larvastore.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.larvastore.demo.entidades.Category;


public interface CategoryRepository extends JpaRepository<Category, Long>{

}
