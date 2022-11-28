package com.todo.list.app.logic.service.impl;

import com.todo.list.app.domain.model.Task;
import com.todo.list.app.logic.mapper.TaskMapper;
import com.todo.list.app.logic.repository.TaskRepository;
import com.todo.list.app.logic.service.TaskService;
import com.todo.list.app.web.dto.TaskDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service
public class TaskServiceImpl implements TaskService {

    private final TaskRepository taskRepository;

    private final TaskMapper taskMapper;

    @Override
    public List<TaskDto> getAllTask() {
        return taskRepository.getAllTask()
                .stream()
                .map(taskMapper::domainToDto)
                .toList();
    }

    @Override
    public TaskDto getById(String id) {
        return taskMapper.domainToDto(
                taskRepository.getById(id));
    }

    @Override
    public TaskDto createTask(TaskDto taskDto) {
        return taskMapper.domainToDto(
                taskRepository.createTask(
                        taskMapper.dtoToDomain(taskDto)));
    }
}
