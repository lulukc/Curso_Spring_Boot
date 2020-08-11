package com.lucas.cursoJava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucas.cursoJava.entities.Product;

public interface ProductRepository extends JpaRepository<Product,Long> {

}
