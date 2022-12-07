package com.todo.list.app.data.entity;

import com.todo.list.app.data.enums.OrderStatus;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.UUID;
@Entity
@Builder
@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "task")
public class TaskEntity {


    @Id
    @GenericGenerator(name = "system-uuid", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "uuid", length = 36,unique = true)
    private UUID uuid ;

    private OrderStatus status;

    private String affair;

    private String coments;


}
