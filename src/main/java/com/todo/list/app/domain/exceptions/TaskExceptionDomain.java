package com.todo.list.app.domain.exceptions;

public class TaskExceptionDomain extends RuntimeException {

    public TaskExceptionDomain(String message){
        super(message);
    }

    public TaskExceptionDomain(String message, Throwable cause){
        super(message, cause);
    }


}