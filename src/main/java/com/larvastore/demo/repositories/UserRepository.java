package com.larvastore.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.larvastore.demo.entidades.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
