package com.epita.fr.quiz.Exceptions;

public class QuizException extends RuntimeException {

	public QuizException(String str) {
		super("Error has occured " + str);
	}
}
