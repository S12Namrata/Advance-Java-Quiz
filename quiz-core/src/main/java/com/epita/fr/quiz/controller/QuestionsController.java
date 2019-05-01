package com.epita.fr.quiz.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.epita.fr.quiz.dataaccess.QuestionsRepository;
import com.epita.fr.quiz.model.Question;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/questions")
public class QuestionsController {
	
	private final QuestionsRepository questionsRepository;
	
	@Autowired
	Question questions;

	
	QuestionsController(QuestionsRepository questionsRepository)
	{
		this.questionsRepository = questionsRepository;
	}

	@GetMapping("/")
	@ResponseBody
	public Iterable<Question> all() {
		return questionsRepository.findAll();
	}
	
	@GetMapping("/{id}")
	@ResponseBody
	ResponseEntity<Optional<Question>> questionById(@PathVariable Integer id) {

		return ResponseEntity.ok(questionsRepository.findById(id));
	}
	
	
	@PostMapping("/")
	public ResponseEntity<Question> addNewQuestions(@Valid @RequestBody Question ques)
	{
		return ResponseEntity.ok(questionsRepository.save(ques));

	}
	
    @PutMapping("/{id}")
    public ResponseEntity<Question> update(@PathVariable Integer id, @Valid @RequestBody Question ques) {
        if (questionsRepository.findById(id).isPresent()) {
            //log.error("Id " + id + " is not existed");
            return ResponseEntity.ok(questionsRepository.save(ques));
        }
        return ResponseEntity.badRequest().build();
        
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Integer id) {
        if (questionsRepository.findById(id).isPresent()) {
            //log.error("Id " + id + " is not existed");
           
            questionsRepository.deleteById(id);
            return ResponseEntity.ok().build();
        }

        return  ResponseEntity.badRequest().build();
    }
    
}
