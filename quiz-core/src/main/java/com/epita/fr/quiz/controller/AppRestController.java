package com.epita.fr.quiz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.epita.fr.quiz.Exceptions.QuizException;
import com.epita.fr.quiz.dataaccess.QuestionsRepository;
import com.epita.fr.quiz.model.Question;

// TODO: Auto-generated Javadoc
/**
 * The Class AppRestController.
 */
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class AppRestController {
	
	/** The questions repository. */
	@Autowired
	private final QuestionsRepository questionsRepository;
	
	/**
	 * Instantiates a new app rest controller.
	 *
	 * @param questionsRepository the questions repository
	 */
	AppRestController(QuestionsRepository questionsRepository) {
		// TODO Auto-generated constructor stub
		this.questionsRepository = questionsRepository;
	}
	
	/**
	 * Home.
	 *
	 * @return the string
	 */
	@RequestMapping("/")
	public String home()
	{
		return "Welcome to Quiz";
	}
	
	
	/**
	 * Generate random quiz based on topic id.
	 *
	 * @param tpc_id the tpc id
	 * @return the iterable
	 */
	@GetMapping("/random/{tpc_id}")
	@ResponseBody
	Iterable<Question> generateRandomQuizBasedOnTopicId(@PathVariable Integer tpc_id) {

		return questionsRepository.getListofQuestionsByTopic(tpc_id,5);
	}
	
	/**
	 * Questions not found handler.
	 *
	 * @param ex the ex
	 * @return the string
	 */
	@ResponseBody
	@ExceptionHandler(QuizException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	String questionsNotFoundHandler(QuizException ex) {
		return ex.getMessage();
	}

}
