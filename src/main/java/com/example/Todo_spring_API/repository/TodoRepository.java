package com.example.Todo_spring_API.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Todo_spring_API.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, UUID>{
    
}
