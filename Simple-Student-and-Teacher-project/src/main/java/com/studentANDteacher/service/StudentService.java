package com.studentANDteacher.service;

import java.util.List;

import com.studentANDteacher.entity.Student;

public interface StudentService {

	Student saveStudent(Student student);

	List<Student> findAllStudents();

	Student findStudentByID(int studentID);

	Student findStudentbyName(String studentName);

	List<Student> findStudentByState(String studentState);

	Student updateStudent(int studentID, Student student);
}