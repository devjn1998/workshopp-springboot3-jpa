package com.larvastore.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.larvastore.demo.entidades.OrderItem;
import com.larvastore.demo.entidades.pk.OrderItemPk;


public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPk>{

}
