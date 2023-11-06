package com.stuclg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stuclg.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
