package net.javaguides.springboot.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import net.javaguides.springboot.exception.ResourceNotFoundException;
import net.javaguides.springboot.model.SurveyAnswers;
import net.javaguides.springboot.repository.SurveyAnswersRepository;
import net.javaguides.springboot.repository.SurveyTopicsRepository;
import net.javaguides.springboot.service.SurveyAnswersService;


@RestController
@RequestMapping("/api/v1/")
@CrossOrigin(origins = "http://localhost:4200")

public class SurveyAnswersController {
	 
	 
	@Autowired
	 SurveyAnswersService surveyAnswersService;
	
	@GetMapping("/surveyanswers")
	public ResponseEntity<List<SurveyAnswers>> get(){
		 List<SurveyAnswers> surveyAnswers = surveyAnswersService.findAll();
				
		 return  new ResponseEntity<List<SurveyAnswers>>(surveyAnswers , HttpStatus.OK);
	}
	
	@PostMapping("/surveyanswers")
	public ResponseEntity<SurveyAnswers> save(@Valid @RequestBody SurveyAnswers surveyAnswers ){
		SurveyAnswers surveyAnswer = surveyAnswersService.save(surveyAnswers);
				
		 return  new ResponseEntity<SurveyAnswers>(surveyAnswer , HttpStatus.OK);
	}

	
	@GetMapping("/surveyanswers/{id}")
	public ResponseEntity<SurveyAnswers> get(@PathVariable("id") Long id) {
		try {
		SurveyAnswers surveyAnswers = surveyAnswersService.findById(id);
		return new ResponseEntity<SurveyAnswers>(surveyAnswers, HttpStatus.OK);
		 }
	    catch (ResourceNotFoundException exc) {
	         throw new ResponseStatusException(
	           HttpStatus.NOT_FOUND, "Foo Not Found", exc);
	    }
		
	}
	
	
	

	
	
}
