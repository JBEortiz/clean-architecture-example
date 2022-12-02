package com.todo.list.app.data.mapper;

import com.todo.list.app.data.entity.TaskEntity;
import com.todo.list.app.domain.model.Task;
import org.mapstruct.Mapper;

@Mapper(componentModel= "task", uses = {MapperTask.class})
public interface TaskEntityMapper {

    Task entityToDomain(TaskEntity entity);

    TaskEntity domainToEntity(Task domain);
}
