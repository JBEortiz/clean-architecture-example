package com.todo.list.app.data.mapper;

import org.mapstruct.Mapper;

import java.util.UUID;

@Mapper(componentModel = "task")
public abstract class MapperTask {

    String transformString(UUID id){
        return id == null ? null : id.toString();
    }


}
