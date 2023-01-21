package com.todo.list.app.web.controller;

import com.todo.list.app.logic.service.TaskService;
import com.todo.list.app.web.dto.TaskDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
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

    @GetMapping("/task/{idDate}")
    public ResponseEntity<TaskDto> getByIdDate(@PathVariable String idDate) {
        return ResponseEntity.ok(taskService.getByIdDate(idDate));
    }

    @PostMapping("/task/crear")
    public ResponseEntity<TaskDto> createTask(@RequestBody TaskDto taskDto) {
        if (taskDto == null) {
            //TODO cambiar exception controllar nulos
        }
        return ResponseEntity.ok(taskService.createTask(taskDto));
    }
    @PostMapping("/task/crear")
    public ResponseEntity<TaskDto> createeTask(@RequestBody TaskDto taskDto) {
        if (taskDto == null) {
            //TODO cambiar exception controllar nulos
        }
        return ResponseEntity.ok(taskService.createTask(taskDto));
    }


}
