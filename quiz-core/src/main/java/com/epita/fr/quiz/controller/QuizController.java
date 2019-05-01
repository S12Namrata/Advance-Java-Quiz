package com.epita.fr.quiz.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.epita.fr.quiz.dataaccess.QuizRepository;
import com.epita.fr.quiz.model.Quiz;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/quiz")
public class QuizController {
	
	private final QuizRepository quizRepository;
	
	@Autowired
	Quiz quiz;
	
	QuizController(QuizRepository quizRepository)
	{
		this.quizRepository = quizRepository;
	}

	@GetMapping("/")
	@ResponseBody
	public ResponseEntity<Iterable<Quiz>> all() {
		return ResponseEntity.ok(quizRepository.getListofQuiz());
	}
	
	@GetMapping("/{id}")
	@ResponseBody
	public ResponseEntity<Optional<Quiz>> quizById(@PathVariable Integer id) {

		return ResponseEntity.ok(quizRepository.findById(id));
	}
	
	@PostMapping("/")
	public ResponseEntity<Quiz> addNewQuiz(@RequestBody Quiz quiz)
	{
	   	return ResponseEntity.ok(quizRepository.save(quiz));

	}
	
	@DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Integer id) {
        if (quizRepository.findById(id).isPresent()) {
           
        	quizRepository.deleteById(id);
            return ResponseEntity.ok().build();
        }

        return  ResponseEntity.badRequest().build();
    }
}
