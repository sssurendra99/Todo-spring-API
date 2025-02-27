package com.example.Todo_spring_API.service;

import org.springframework.stereotype.Service;

import com.example.Todo_spring_API.dto.TodoDto;
import com.example.Todo_spring_API.entity.Todo;
import com.example.Todo_spring_API.mapper.TodoMapper;
import com.example.Todo_spring_API.repository.TodoRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class TodoService implements ITodoService{

    private TodoRepository todoRepository;


    @Override
    public TodoDto createTodo(TodoDto todoDto) {
        Todo todo = TodoMapper.mapToTodo(todoDto);
        Todo savedTodo = todoRepository.save(todo);

        return TodoMapper.mapToTodoDto(savedTodo);
        
    }
    
}
