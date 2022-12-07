package com.todo.list.app.data.mapper;

import com.todo.list.app.data.entity.TaskEntity;
import com.todo.list.app.data.enums.OrderStatus;
import com.todo.list.app.domain.model.Task;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class TaskEntityMapper {

    public Task entityToDomain(TaskEntity entity){
        return new Task().builder()
                .idTask(entity.getUuid().toString())
                .coments(entity.getComents())
                .status(entity.getStatus())
                .affair(entity.getAffair())
                .number(null).build();
    }

    public TaskEntity domainToEntity(Task domain){
        return new TaskEntity().builder()
                .uuid(domain.getIdTask()!=null ? UUID.fromString(domain.getIdTask()):UUID.randomUUID())
                .coments(domain.getComents())
                .status(domain.getStatus())
                .affair(domain.getAffair())
                .build();
    }
}
