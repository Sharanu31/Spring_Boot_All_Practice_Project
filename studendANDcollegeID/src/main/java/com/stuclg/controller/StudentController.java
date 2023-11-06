package com.stuclg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stuclg.entity.Student;
import com.stuclg.service.StudentService;

@RestController
@RequestMapping("Student")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@GetMapping
	private List<Student> fetchAllStudentDetails(){
		return studentService.getAllStudentDetsils();
	}
	
}
