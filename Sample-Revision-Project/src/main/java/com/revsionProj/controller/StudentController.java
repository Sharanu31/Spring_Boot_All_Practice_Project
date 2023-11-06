package com.revsionProj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revsionProj.entity.Student;
import com.revsionProj.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	StudentService studentService;

	@PostMapping
	Student createStudenr(@RequestBody Student student) {
		return studentService.createStudent(student);

	}

	@GetMapping
	List<Student> allStudent() {
		
		return studentService.getAllStudent();
	}

}
