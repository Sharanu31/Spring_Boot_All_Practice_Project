package com.stuclg.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stuclg.entity.Student;
import com.stuclg.repository.StudentRepository;
import com.stuclg.service.StudentService;

@Service
public class StudentServiceImp implements StudentService {

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public Student saveStudentDetsils(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public List<Student> getAllStudentDetsils() {
		return studentRepository.findAll();
	}

}
