package com.lucas.cursoJava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucas.cursoJava.entities.Order;

public interface OrderRepository extends JpaRepository<Order,Long> {


}
