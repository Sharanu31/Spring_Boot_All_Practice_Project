package com.revsionProj.service;

import java.util.List;

import com.revsionProj.entity.Student;

public interface StudentService {

	Student createStudent(Student student);

	List<Student> getAllStudent();

}
