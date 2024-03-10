package com.studentANDteacher.serviceImpl;

import java.util.List;

import org.hibernate.sql.exec.ExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentANDteacher.entity.Student;
import com.studentANDteacher.repository.StudentRepository;
import com.studentANDteacher.service.StudentService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class StudentServiceImpl implements StudentService {

	@Autowired
	public StudentRepository studentRepository;

	@Override
	public Student saveStudent(Student student) {
		log.info("saveStudent method");
		return studentRepository.save(student);
	}

	@Override
	public List<Student> findAllStudents() {

		return studentRepository.findAll();
	}

	@Override
	public Student findStudentByID(int studentID) {
		return studentRepository.findById(studentID).orElseThrow(() -> new RuntimeException("Data Not Found"));
	}

	@Override
	public Student findStudentbyName(String studentName) {
		Student savedStudent = studentRepository.findByName(studentName);
		if (savedStudent == null)
			throw new ExecutionException("Data not found exception : "+studentName);
		return savedStudent;
	}

	@Override
	public List<Student> findStudentByState(String studentState) {
		return studentRepository.findByState(studentState);

	}

	@Override
	public Student updateStudent(int studentID, Student student) {
		Student savedStudent = studentRepository.findById(studentID).get();
		studentRepository.save(savedStudent);
		return null;
	}
}
