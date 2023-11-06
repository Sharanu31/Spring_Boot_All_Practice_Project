package com.springBootProject.quizApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springBootProject.quizApp.entity.QuestionWrapper;
import com.springBootProject.quizApp.entity.Response;
import com.springBootProject.quizApp.service.QuizService;

@RestController
@RequestMapping("quiz")
public class QuizController {

	@Autowired
	QuizService quizService;

	@PostMapping("/create")
	public ResponseEntity<String> createQuiz(@RequestParam String category, @RequestParam int numQ,
			@RequestParam String title) {
		return quizService.createQuiz(category, numQ, title);
		
		/** 
		 * ulr to create a quiz with its category,number of question and title of the quiz
		 *  http://localhost:1002/quiz/create?category=Java&numQ=5&title=JQuiz  **/

	}

	@GetMapping("/get/{id}")
	public ResponseEntity<List<QuestionWrapper>> getQuizQuestion(@PathVariable("id") int id) {
		return quizService.getQuizQuestions(id);

	}

	@PostMapping("/submit/{id}")
	public ResponseEntity<Integer> submitQuiz(@PathVariable("id") int id, @RequestBody List<Response> responses) {
		return quizService.calculateResult(id, responses);
		
		/**
		 * [    {
        "id":1,
        "response":"James Gosling"
    },
    {
        "id":2,
        "response":" Java is a platform-independent programming language"
    },
    {
      "id":3,
        "response":"JDK"
      
    },
    {
      "id":6,
        "response":"JAVA_HOME"
      
    },
    {
        "id":8,
        "response":"Passing itself to the method of the same class"
    }
    ]

		 * 
		 * 
		 *  **/
	}
}
