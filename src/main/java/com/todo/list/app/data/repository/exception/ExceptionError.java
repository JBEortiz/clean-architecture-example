package com.todo.list.app.data.repository.exception;

public interface ExceptionError {
    String getCode();
    String getMessage();
    String getHttpCode();
}
