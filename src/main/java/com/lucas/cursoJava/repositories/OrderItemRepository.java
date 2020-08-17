package com.lucas.cursoJava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucas.cursoJava.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {

}
