package com.todo.list.app.data.repository.exception;

public class ScaException extends RuntimeException {

    public ScaException(String message){
        super(message);
    }

    public ScaException(String message, Throwable cause){
        super(message, cause);
    }
}
