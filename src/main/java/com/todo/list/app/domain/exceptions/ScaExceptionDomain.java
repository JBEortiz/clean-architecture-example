package com.todo.list.app.domain.exceptions;

public class ScaExceptionDomain extends RuntimeException {

    public ScaExceptionDomain(String message){
        super(message);
    }

    public ScaExceptionDomain(String message, Throwable cause){
        super(message, cause);
    }


}