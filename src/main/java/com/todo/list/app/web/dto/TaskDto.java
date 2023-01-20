package com.todo.list.app.web.dto;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import lombok.*;

@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonAutoDetect
@Builder
public class TaskDto {

    private Boolean status;

    private String affair;

    private String idDate;

    private Integer number;


}
