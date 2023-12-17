package com.todolist.todoproject.service;

import java.util.List;

import com.todolist.todoproject.entity.ToDo;

public interface ToDoService {

	ToDo createToDo(ToDo todo);

	List<ToDo> getAllToDo();

	List<ToDo> getAllBystatusOfTheTask(String comp);

	List<ToDo> findAllBytaskType(String taskName);

	ToDo updateTask(long id, ToDo toDo);

	String deleteTask(long id);
}
