package com.lucas.cursoJava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucas.cursoJava.entities.Category;

public interface CategoryRepository extends JpaRepository<Category,Long> {

}
