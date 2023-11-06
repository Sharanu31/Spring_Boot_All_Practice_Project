package com.revsionProj.serviceimp;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revsionProj.entity.Student;
import com.revsionProj.repository.StudentRepository;
import com.revsionProj.service.StudentService;

@Service
public class StudentServiceImp implements StudentService {

	@Autowired
	StudentRepository studentRepository;

	@Override
	public Student createStudent(Student student) {
		String id = UUID.randomUUID().toString();
		student.setStuID(id);
		return studentRepository.save(student);
	}

	@Override
	public List<Student> getAllStudent() {
		return studentRepository.findAll();
	}

}
