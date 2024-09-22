package com.larvastore.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.larvastore.demo.entidades.Order;


public interface OrderRepository extends JpaRepository<Order, Long>{

}
