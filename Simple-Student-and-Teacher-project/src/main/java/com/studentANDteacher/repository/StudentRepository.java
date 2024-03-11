package com.studentANDteacher.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studentANDteacher.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

	Student findByName(String studentName);

	List<Student> findByState(String studentState);

}