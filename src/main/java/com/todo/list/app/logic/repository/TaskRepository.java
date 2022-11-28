package com.todo.list.app.logic.repository;

import com.todo.list.app.domain.model.Task;
import com.todo.list.app.web.dto.TaskDto;

import java.util.List;

public interface TaskRepository {

    List<Task> getAllTask();

    Task getById(String id);

    Task createTask(Task task);


}
