package com.todo.list.app.data.repository.impl;

import com.todo.list.app.data.entity.TaskEntity;
import com.todo.list.app.data.mapper.TaskEntityMapper;
import com.todo.list.app.data.repository.SpringDataTaskRepository;
import com.todo.list.app.domain.model.Task;
import com.todo.list.app.logic.repository.TaskRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;
@Slf4j
@Component
@RequiredArgsConstructor
public class TaskRepositoryImpl implements TaskRepository {

    private final SpringDataTaskRepository springDataTaskRepository;
    private final TaskEntityMapper taskEntityMapper;
    @Override
    public List<Task> getAllTask() {
        return springDataTaskRepository.findAll()
                .stream()
                .map(taskEntityMapper::entityToDomain)
                .toList();
    }

    //:TODO poner excepcion personalizada
    @Override
    public Task getById(String id) {
        return taskEntityMapper.entityToDomain(
                springDataTaskRepository.findById(UUID.fromString(id))
                        .orElse(new TaskEntity()));
    }

    @Override
    public Task createTask(Task task) {
        log.info("create tarea {}",task);
        return taskEntityMapper.entityToDomain(
                springDataTaskRepository.save(
                        taskEntityMapper.domainToEntity(task)));
    }
}
