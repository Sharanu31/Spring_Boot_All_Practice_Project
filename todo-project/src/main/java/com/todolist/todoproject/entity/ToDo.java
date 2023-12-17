package com.todolist.todoproject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ToDo {

	@Id
	private Long iD;

	@NotNull(message = "Field Should not be empty")
	private String taskType;

	@NotNull(message = "Field Should not be empty")
	private String TaskOfTheDay;

	@NotNull(message = "Field Should not be empty")
	private String statusOfTheTask;
}
