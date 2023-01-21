package com.todo.list.app.logic.service;

import com.todo.list.app.domain.model.Task;
import com.todo.list.app.web.dto.TaskDto;

import java.util.List;

public interface TaskService {

    List<TaskDto> getAllTask();

    TaskDto getByIdDate(String idDate);

    TaskDto createTask(TaskDto taskDto);

     List<TaskDto> getAllTasks();
}
