package com.example.Todo_spring_API.service;

import com.example.Todo_spring_API.dto.TodoDto;

public interface ITodoService {
    TodoDto createTodo(TodoDto todoDto);
}
