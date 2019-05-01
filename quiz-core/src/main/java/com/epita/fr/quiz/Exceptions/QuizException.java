package com.epita.fr.quiz.Exceptions;

// TODO: Auto-generated Javadoc
/**
 * The Class QuizException.
 */
public class QuizException extends RuntimeException {

	/**
	 * Instantiates a new quiz exception.
	 *
	 * @param str the str
	 */
	public QuizException(String str) {
		super("Error has occured " + str);
	}
}
