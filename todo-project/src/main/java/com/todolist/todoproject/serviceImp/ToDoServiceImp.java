package com.todolist.todoproject.serviceImp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.todolist.todoproject.entity.ToDo;
import com.todolist.todoproject.repository.TodoRepository;
import com.todolist.todoproject.service.ToDoService;

public class ToDoServiceImp implements ToDoService {

	@Autowired
	private TodoRepository todoRepository;

	@Override
	public ToDo createToDo(ToDo todo) {
		return todoRepository.save(todo);
	}

	@Override
	public List<ToDo> getAllToDo() {
		return todoRepository.findAll();
	}

	@Override
	public List<ToDo> getAllBystatusOfTheTask(String comp) {
		return todoRepository.findAllBystatusOfTheTask(comp);
	}

	@Override
	public List<ToDo> findAllBytaskType(String taskType) {
		return todoRepository.findAllBytaskType(taskType);
	}

	@Override
	public ToDo updateTask(long id, ToDo toDo) {

		Optional<ToDo> dbData = todoRepository.findById(id);
		if (!dbData.isPresent()) {
			dbData.get().setTaskType(toDo.getTaskType() != null ? toDo.getTaskType() : dbData.get().getTaskType());
			dbData.get().setStatusOfTheTask(
					toDo.getStatusOfTheTask() != null ? toDo.getStatusOfTheTask() : dbData.get().getStatusOfTheTask());
		} else {

		}
		return todoRepository.save(dbData.get());
	}

	@Override
	public String deleteTask(long id) {
		todoRepository.deleteById(id);
		return "Deleted";
	}
	
	/*
	 * ToDo List
	 * 
	 * 1.Entity a.ID b.Task Of the Day c.Status of the task d.TaskType(Coding
	 * Task,Self Development Task,Interview Prep Task,Office task) 2.Controller
	 * a.Get all the task b.Get all the completed task & Not Completed task c.Create
	 * a task d.Update a task e.Delete a task f.Get the task by TaskName
	 */

}
