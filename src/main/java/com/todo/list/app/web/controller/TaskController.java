package com.todo.list.app.web.controller;

import com.todo.list.app.logic.service.TaskService;
import com.todo.list.app.web.dto.TaskDto;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.bytebuddy.asm.Advice;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Slf4j
@RequiredArgsConstructor
@RestController
public class TaskController {

    private final TaskService taskService;

    @GetMapping("/task")
    public ResponseEntity<List<TaskDto>> getTaskList() {
        return ResponseEntity.ok(taskService.getAllTask());
    }

    @GetMapping("/task/{id}")
    public ResponseEntity<TaskDto> findById(@PathVariable String id) {
        return ResponseEntity.ok(taskService.getById(id));
    }

    //TODO cambiar exception controllar nulos
    @PostMapping("/task/crear")
    public ResponseEntity<TaskDto> createTask(@RequestBody TaskDto taskDto) {
        log.info("null {} ",taskDto);
        if(taskDto==null){

        }
        return ResponseEntity.ok(taskService.createTask(taskDto));
    }




}
