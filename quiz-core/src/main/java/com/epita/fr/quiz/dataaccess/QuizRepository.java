/**
 * 
 */
package com.epita.fr.quiz.dataaccess;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.epita.fr.quiz.model.Quiz;

/**
 * @author namrata
 *
 */

@Repository
public interface QuizRepository extends CrudRepository<Quiz, Integer> {
	@Query(value="select id, text from QUIZES" ,nativeQuery=true)
	public Iterable<Quiz> getListofQuiz();

}
