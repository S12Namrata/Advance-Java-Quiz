package com.epita.fr.quiz.controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.epita.fr.quiz.Exceptions.QuizException;
import com.epita.fr.quiz.dataaccess.QuestionsRepository;
import com.epita.fr.quiz.model.Question;

@RestController
public class AppRestController {
	
	@Autowired
	private final QuestionsRepository questionsRepository;
	
	AppRestController(QuestionsRepository questionsRepository) {
		// TODO Auto-generated constructor stub
		this.questionsRepository = questionsRepository;
	}
	
	@RequestMapping("/")
	public String home()
	{
		return "Welcome to Quiz";
	}
	
	
	@GetMapping("/random/{tpc_id}")
	@ResponseBody
	Iterable<Question> generateRandomQuizBasedOnTopicId(@PathVariable Integer tpc_id) {

		return questionsRepository.getListofQuestionsByTopic(tpc_id,5);
	}
	
	@ResponseBody
	@ExceptionHandler(QuizException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	String employeeNotFoundHandler(QuizException ex) {
		return ex.getMessage();
	}

}
