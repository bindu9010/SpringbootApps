package com.bindu.quizapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bindu.quizapp.Repository.QuestionRepository;
import com.bindu.quizapp.entity.Question;

@Service
public class QuestionService {
	
	@Autowired
	private QuestionRepository questionreposiory;
	
	
	public Question saveQuestions(Question questions) {
		
		return questionreposiory.save(questions);
		
	}
	
    public List<Question> getQuestions() {
		
		return questionreposiory.findAll();
			
	}

	public List<Question> getQuestionsByDifficultLevel(String val) {
		
		return questionreposiory.findByDifficultLevel(val);
	}


}
