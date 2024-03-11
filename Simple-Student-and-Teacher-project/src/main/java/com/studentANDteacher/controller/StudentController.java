
package com.studentANDteacher.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.studentANDteacher.entity.Student;
import com.studentANDteacher.service.StudentService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/student")
public class StudentController {

	@Autowired
	StudentService studentService;

	@GetMapping("/info")
	public String student() {
		log.info("Calling student method");
		return "Welcome to Student and Teacher project";
	}

	@GetMapping
	public List<Student> getAllListedStudent() {

		return studentService.findAllStudents();
	}

	@PostMapping
	public Student addNewStudent(@RequestBody Student student) {
		return studentService.saveStudent(student);
	}

	@GetMapping("/{id}")
	public Student findStudentBythereID(@PathVariable int id) {
		return studentService.findStudentByID(id);

	}

	@GetMapping("/resourse")
	public Student findbyStudentName(@RequestParam String name) {
		return studentService.findStudentbyName(name);
	}

	@GetMapping("/bystate")
	public List<Student> findbyStudentState(@RequestParam String state) {
		return studentService.findStudentByState(state);
	}

	@PutMapping
	public Student updateStudent(@RequestBody Student newStudent, @PathVariable Integer id) {
		return studentService.updateStudent(id, newStudent);
	}
}
