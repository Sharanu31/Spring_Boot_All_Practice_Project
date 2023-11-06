package com.revsionProj.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revsionProj.entity.Student;

public interface StudentRepository extends JpaRepository<Student, String> {

}
