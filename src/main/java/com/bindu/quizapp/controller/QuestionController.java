package com.bindu.quizapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bindu.quizapp.entity.Question;
import com.bindu.quizapp.service.QuestionService;

@RestController
@RequestMapping("/questions")
public class QuestionController {
	
	@Autowired
	private QuestionService questionService;
	
	@PostMapping("/saveQuestions")
	public Question saveQuestions(@RequestBody Question que) {
		return questionService.saveQuestions(que);
		
	}
	
	@GetMapping("/getQuestions")
	public ResponseEntity<List<Question>> getQuestions() {
		System.out.println("get methosd");	
		return new ResponseEntity<>(questionService.getQuestions(), HttpStatus.OK);
		
	}
	
	@GetMapping("/getQuestions/{difficultLevel}")
	public ResponseEntity<List<Question>> getQuestionsByDifficultLevel(@PathVariable String difficultLevel) {
		System.out.println("get difficultLevel....");	
		return new ResponseEntity<>(questionService.getQuestionsByDifficultLevel(difficultLevel), HttpStatus.OK);
		
	}

}
