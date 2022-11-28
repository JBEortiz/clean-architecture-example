package com.todo.list.app.data.mapper;

import com.todo.list.app.data.entity.TaskEntity;
import com.todo.list.app.domain.model.Task;
import org.mapstruct.Mapper;

//TODO: mejorar los mapeos 
@Mapper
public interface TaskEntityMapper {

    Task entityToDomain(TaskEntity entity);

    TaskEntity domainToEntity(Task domain);
}
