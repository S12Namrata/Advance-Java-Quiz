package com.epita.fr.quiz.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.epita.fr.quiz.dataaccess.TopicsRepository;
import com.epita.fr.quiz.model.Topic;

// TODO: Auto-generated Javadoc
/**
 * The Class TopicController.
 */
@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/topics")
public class TopicController {
	
	/** The topic repository. */
	private final TopicsRepository topicRepository;
	
	/**
	 * Instantiates a new topic controller.
	 *
	 * @param topicRepository the topic repository
	 */
	TopicController(TopicsRepository topicRepository)
	{
		this.topicRepository = topicRepository;
	}

	/**
	 * All.
	 *
	 * @return the response entity
	 */
	@GetMapping("/")
	@ResponseBody
	public ResponseEntity<Iterable<Topic>> all() {
		return ResponseEntity.ok(topicRepository.findAll());
	}


}
