package com.todo.list.app.data.repository;

import com.todo.list.app.data.entity.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface SpringDataTaskRepository extends JpaRepository<TaskEntity, UUID> {
    Optional<TaskEntity> findByIdDate(String idDate);
}
