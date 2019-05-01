package com.epita.fr.quiz.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.epita.fr.quiz.dataaccess.AnswersRepository;
import com.epita.fr.quiz.model.Answer;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/result")
public class ResultController {
	
	@Autowired
	private final AnswersRepository answersRepository;
	
	ResultController( AnswersRepository answersRepository) {
		// TODO Auto-generated constructor stub
		this.answersRepository = answersRepository;
	}
	
	
	@PostMapping("/")
	public ResponseEntity<Map> evaluateResult(@RequestBody Map<Integer,String> quizAnswers)
	{
		HashMap<String,String> result = new HashMap<>();
		Integer marks = 0;
		
		for (Entry<Integer, String> entry : quizAnswers.entrySet()) {
			
			Answer answer = answersRepository.getCorrectAnswerbyQuesId(Integer.valueOf(entry.getKey()));
			if(entry.getValue().equals(answer.getText()))
			{
				marks++;
			}
		}
		result.put("correct", marks.toString());
		result.put("total", ((Integer)quizAnswers.size()).toString());
		
	   	return ResponseEntity.ok(result);

	}

}
