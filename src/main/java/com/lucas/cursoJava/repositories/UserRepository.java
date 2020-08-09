package com.lucas.cursoJava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucas.cursoJava.entities.User;

public interface UserRepository extends JpaRepository<User,Long> {

}
