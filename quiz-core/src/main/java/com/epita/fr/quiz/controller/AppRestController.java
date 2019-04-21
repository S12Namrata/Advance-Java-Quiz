package com.epita.fr.quiz.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.epita.fr.quiz.Exceptions.QuizException;

@RestController
public class AppRestController {
	
	@RequestMapping("/")
	public String home()
	{
	
		throw new QuizException("Testing");
		//return "Home.jsp";
	}
	
	@ResponseBody
	@ExceptionHandler(QuizException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	String employeeNotFoundHandler(QuizException ex) {
		return ex.getMessage();
	}

}
