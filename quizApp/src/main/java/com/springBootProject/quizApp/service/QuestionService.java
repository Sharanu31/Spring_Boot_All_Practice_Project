package com.springBootProject.quizApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.springBootProject.quizApp.dao.QuestionDao;
import com.springBootProject.quizApp.entity.Question;

@Service
public class QuestionService {

	@Autowired
	QuestionDao questionDao;
	
	public ResponseEntity<List<Question>> getAllQuestions() {
		return new ResponseEntity<>(questionDao.findAll(),HttpStatus.OK);
	}

	public ResponseEntity<Question> saveQuestion(Question question) {
		return new ResponseEntity<>(questionDao.save(question),HttpStatus.CREATED);
	}

	public List<Question> getAllQuestionsBycategory(String category) {
		return questionDao.findByCategory(category);
	}

}
