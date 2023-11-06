package com.stuclg.service;

import java.util.List;

import com.stuclg.entity.College;
import com.stuclg.entity.Student;

public interface StudentService {

	Student saveStudentDetsils(Student student);

	List<Student> getAllStudentDetsils();

}
