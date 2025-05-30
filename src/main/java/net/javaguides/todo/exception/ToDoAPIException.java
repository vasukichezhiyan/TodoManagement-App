package net.javaguides.todo.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public class ToDoAPIException extends RuntimeException{
    private HttpStatus status;
    private String message;
}
