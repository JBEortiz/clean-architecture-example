package com.todo.list.app.logic.service.impl;

import com.todo.list.app.domain.model.Task;
import com.todo.list.app.logic.mapper.TaskMapper;
import com.todo.list.app.logic.repository.TaskRepository;
import com.todo.list.app.logic.service.TaskService;
import com.todo.list.app.web.dto.TaskDto;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class TaskServiceImpl implements TaskService {

    private final TaskRepository taskRepository;
    private final TaskMapper taskMapper;

    @Override
    public List<TaskDto> getAllTask() {
        return taskRepository.getAllTask()
                .stream()
                .map(taskMapper::domainToDto)
                .collect(Collectors.toList());
    }

    @Override
    public TaskDto getById(String id) {
        return taskMapper.domainToDto(
                taskRepository.getById(id));
    }

    @Override
    public TaskDto createTask(TaskDto taskDto) {
        Task t = taskMapper.dtoToDomain(taskDto);
        Task t2= taskRepository.createTask(t);
        return taskMapper.domainToDto(t2);
       /*
        return taskMapper.domainToDto(
                taskRepository.createTask(
                        taskMapper.dtoToDomain(taskDto)));


        */
    }
}
