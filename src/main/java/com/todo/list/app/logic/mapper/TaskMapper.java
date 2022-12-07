package com.todo.list.app.logic.mapper;

import com.todo.list.app.data.enums.OrderStatus;
import com.todo.list.app.domain.model.Task;
import com.todo.list.app.web.dto.TaskDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;

//:TODO hacer mappeos personalizados
@Component
public class TaskMapper {

    public TaskDto domainToDto(Task task){
       return  new TaskDto().builder()
               .coments(task.getComents())
               .status(task.getStatus() != OrderStatus.PENDING)
               .affair(task.getAffair())
               .number(task.getNumber())
               .build() ;
    }

    public Task dtoToDomain(TaskDto dto){
        return new Task().builder()
                .idTask(null)
                .coments(dto.getComents())
                .status(dto.getStatus()!=null && dto.getStatus()? OrderStatus.APPROVED: OrderStatus.PENDING)
                .affair(dto.getAffair())
                .number(null).build();
    }
}
