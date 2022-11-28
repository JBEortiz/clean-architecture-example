package com.todo.list.app.logic.service;

import com.todo.list.app.domain.model.Task;
import com.todo.list.app.web.dto.TaskDto;

import java.util.List;

public interface TaskService {

    List<TaskDto> getAllTask();

    TaskDto getById(String id);

    TaskDto createTask(TaskDto taskDto);
}
