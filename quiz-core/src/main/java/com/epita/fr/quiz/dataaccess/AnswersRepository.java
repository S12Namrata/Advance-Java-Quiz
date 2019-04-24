/**
 * 
 */
package com.epita.fr.quiz.dataaccess;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.epita.fr.quiz.model.Answer;

/**
 * @author namrata
 *
 */

@Repository
public interface AnswersRepository extends CrudRepository<Answer, Integer> {
	@Query(value="SELECT * FROM ANSWERS JOIN QUESTION_ANSWERS WHERE QUESTION_ANSWERS.ANS_ID = ANSWERS.ID AND QUESTION_ANSWERS.QUES_ID = :quesID AND ANSWERS.IS_CORRECT = TRUE" ,nativeQuery=true)
	public Answer getCorrectAnswerbyQuesId(@Param("quesID") Integer quesID);


}
