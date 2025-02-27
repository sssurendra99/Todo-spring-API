package com.example.Todo_spring_API.mapper;

import com.example.Todo_spring_API.dto.TodoDto;
import com.example.Todo_spring_API.entity.Todo;

public class TodoMapper {

    public static TodoDto mapToTodoDto(Todo todo){
        return new TodoDto(
            todo.getId(),
            todo.getTitle(),
            todo.isClosed()
        );
    }

    public static Todo mapToTodo(TodoDto todoDto) {
        Todo todo = new Todo();
        todo.setTitle(todoDto.getTitle());
        todo.setClosed(todoDto.isClosed());
        return todo;
    }
}
