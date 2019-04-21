package com.epita.fr.quiz.controller;

import java.util.Map;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.epita.fr.quiz.dataaccess.QuestionsRepository;
import com.epita.fr.quiz.model.Questions;

@RestController
@RequestMapping("/questions")
public class QuestionsController {
	
	private final QuestionsRepository questionsRepository;
	
	QuestionsController(QuestionsRepository questionsRepository)
	{
		this.questionsRepository = questionsRepository;
	}

	@GetMapping("/")
	@ResponseBody
	public Iterable<Questions> all() {
		return questionsRepository.findAll();
	}
	
	@GetMapping("/{id}")
	@ResponseBody
	Optional<Questions> questionById(@PathVariable Integer id) {

		return questionsRepository.findById(id);
	}
	
	@PostMapping("/")
	void addNewQuestions(@RequestBody Map<String, String> body)
	{
	   	Questions questions = new Questions();
	   	questions.setLevel(body.get("level"));
	   	questions.setText(body.get("question"));
	   	questions.setType(body.get("type"));
	   	questionsRepository.save(questions);
	   	
	}
}
