package com.todo.list.app.data.entity;

import com.todo.list.app.data.enums.OrderStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.UUID;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "task")
public class TaskEntity {

    @Id
    @Column
    @GeneratedValue
    private UUID idTask;

    private OrderStatus status;

    private String affair;

    private String coments;


}
