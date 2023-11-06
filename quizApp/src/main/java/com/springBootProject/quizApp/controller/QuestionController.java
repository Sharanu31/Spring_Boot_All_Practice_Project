package com.springBootProject.quizApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springBootProject.quizApp.entity.Question;
import com.springBootProject.quizApp.service.QuestionService;

@RestController
@RequestMapping("/question")
public class QuestionController {

	@Autowired
	QuestionService questionService;

	@GetMapping("/allquestions")
	public ResponseEntity<List<Question>> getAllQuestions() {
		return questionService.getAllQuestions();
	}

	@GetMapping("/category/{category}")
	public List<Question> getAllQuestionsBycategory(@PathVariable String category) {
		return questionService.getAllQuestionsBycategory(category);
	}

	@PostMapping("/addquestions")
	public ResponseEntity<Question> addQuestion(@RequestBody Question question) {
		return questionService.saveQuestion(question);
	}

	/**
	 * Jason Format of Quesyion
	 * 
	 * { "questionTitle":" Which module in the python standard library parses
	 * options received from the command line?",
	 *  "option1":"getarg",
	 * "option2":"getopt", 
	 * \"option3":"main",
	 *  "option4":"os", 
	 *  "rightAnswer":"getopt",
	 * "difficultyLevel":"Easy",
	 *  "category":"Python" }
	 * 
	 * 
	 **/
}
