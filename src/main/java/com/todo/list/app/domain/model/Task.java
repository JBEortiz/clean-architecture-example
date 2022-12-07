package com.todo.list.app.domain.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.todo.list.app.data.enums.OrderStatus;
import lombok.*;

@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Task {

    private String idTask;

    private OrderStatus status;

    private String affair;

    private String coments;

    private Integer number;
}
