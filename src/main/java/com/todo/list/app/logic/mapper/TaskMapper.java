package com.todo.list.app.logic.mapper;

import com.todo.list.app.domain.model.Task;
import com.todo.list.app.web.dto.TaskDto;
import org.mapstruct.Mapper;

//:TODO hacer mappeos personalizados
@Mapper
public interface TaskMapper {

    TaskDto domainToDto(Task task);

    Task dtoToDomain(TaskDto dto);
}
