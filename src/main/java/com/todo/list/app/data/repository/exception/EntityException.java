package com.todo.list.app.data.repository.exception;

public class EntityException extends RuntimeException {

    public EntityException(String message){
        super(message);
    }

    public EntityException(String message, Throwable cause){
        super(message, cause);
    }
}
