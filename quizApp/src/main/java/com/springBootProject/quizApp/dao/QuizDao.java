package com.springBootProject.quizApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springBootProject.quizApp.entity.Quiz;

public interface QuizDao extends JpaRepository<Quiz, Integer> {

}
