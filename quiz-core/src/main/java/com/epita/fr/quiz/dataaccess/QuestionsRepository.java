/**
 * 
 */
package com.epita.fr.quiz.dataaccess;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.epita.fr.quiz.model.Question;

// TODO: Auto-generated Javadoc
/**
 * The Interface QuestionsRepository.
 *
 * @author namrata
 */

@Repository
public interface QuestionsRepository extends CrudRepository<Question, Integer> {
	
	/**
	 * Gets the listof questions by topic.
	 *
	 * @param chosenTopicId the chosen topic id
	 * @param numberOfQues the number of ques
	 * @return the listof questions by topic
	 */
	@Query(value="SELECT * FROM QUESTIONS JOIN QUESTIONS_TOPIC  WHERE QUESTIONS_TOPIC.QUES_ID = QUESTIONS.ID AND QUESTIONS_TOPIC.TOPIC_ID = :chosenTopicId ORDER BY RAND() LIMIT :numberOfQues" ,nativeQuery=true)
	public Iterable<Question> getListofQuestionsByTopic(@Param("chosenTopicId") Integer chosenTopicId, @Param("numberOfQues") Integer numberOfQues);

}
