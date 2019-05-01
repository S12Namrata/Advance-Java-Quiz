/**
 * 
 */
package com.epita.fr.quiz.dataaccess;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.epita.fr.quiz.model.Topic;

/**
 * The Interface TopicsRepository.
 *
 * @author namrata
 */

@Repository
public interface TopicsRepository extends CrudRepository<Topic, Integer> {

}
