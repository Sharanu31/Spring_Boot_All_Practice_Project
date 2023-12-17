package com.todolist.todoproject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.todolist.todoproject.entity.ToDo;

public interface TodoRepository extends JpaRepository<ToDo, Long> {

	List<ToDo> findAllBystatusOfTheTask(String statusOfTheTask);

	List<ToDo> findAllBytaskType(String taskType);
}
