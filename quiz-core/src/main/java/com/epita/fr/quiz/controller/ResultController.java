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

// TODO: Auto-generated Javadoc
/**
 * The Class ResultController.
 */
@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/result")
public class ResultController {
	
	/** The answers repository. */
	@Autowired
	private final AnswersRepository answersRepository;
	
	/**
	 * Instantiates a new result controller.
	 *
	 * @param answersRepository the answers repository
	 */
	ResultController( AnswersRepository answersRepository) {
		// TODO Auto-generated constructor stub
		this.answersRepository = answersRepository;
	}
	
	
	/**
	 * Evaluate result.
	 *
	 * @param quizAnswers the quiz answers
	 * @return the response entity
	 */
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
