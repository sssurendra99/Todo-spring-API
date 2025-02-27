package com.example.Todo_spring_API.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Todo_spring_API.dto.TodoDto;
import com.example.Todo_spring_API.service.TodoService;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@AllArgsConstructor
@RestController
@RequestMapping("api/todos")
public class TodoController {
    private TodoService todoService;
    
    
    @PostMapping
    public ResponseEntity<TodoDto> createTodo(TodoDto todoDto) {
        TodoDto savedTodo = todoService.createTodo(todoDto);
        return new ResponseEntity<>(savedTodo, HttpStatus.CREATED);
    }
}
