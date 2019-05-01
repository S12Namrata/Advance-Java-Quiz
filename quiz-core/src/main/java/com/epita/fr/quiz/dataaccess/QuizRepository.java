/**
 * 
 */
package com.epita.fr.quiz.dataaccess;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.epita.fr.quiz.model.Quiz;

// TODO: Auto-generated Javadoc
/**
 * The Interface QuizRepository.
 *
 * @author namrata
 */

@Repository
public interface QuizRepository extends CrudRepository<Quiz, Integer> {
	
	/**
	 * Gets the listof quiz.
	 *
	 * @return the listof quiz
	 */
	@Query(value="select id, text from QUIZES" ,nativeQuery=true)
	public Iterable<Quiz> getListofQuiz();

}
