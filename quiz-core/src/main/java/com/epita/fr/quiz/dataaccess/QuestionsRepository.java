/**
 * 
 */
package com.epita.fr.quiz.dataaccess;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.epita.fr.quiz.model.Questions;

/**
 * @author namrata
 *
 */

@Repository
public interface QuestionsRepository extends CrudRepository<Questions, Integer> {

}
