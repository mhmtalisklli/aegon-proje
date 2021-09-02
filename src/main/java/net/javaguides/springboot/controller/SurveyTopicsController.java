package net.javaguides.springboot.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import net.javaguides.springboot.repository.SurveyTopicsRepository;
import net.javaguides.springboot.service.SurveyTopicsService;
import net.javaguides.springboot.exception.ResourceNotFoundException;
import net.javaguides.springboot.model.SurveyAnswers;
import net.javaguides.springboot.model.SurveyTopics;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin(origins = "http://localhost:4200")
public class SurveyTopicsController {
	
	 
	@Autowired
	 SurveyTopicsService surveyTopicsService;
	
	@GetMapping("/surveytopics")
	public ResponseEntity<List<SurveyTopics>> get(){
			try {
		 List<SurveyTopics> surveyTopics = surveyTopicsService.findAll();
				
		 return  new ResponseEntity<List<SurveyTopics>>(surveyTopics , HttpStatus.OK);
		}
			catch (ResourceNotFoundException exc) {
     throw new ResponseStatusException(
       HttpStatus.NOT_FOUND, "Foo Not Found", exc);
}
	}
	
	
	@PostMapping("/surveytopics")
	public ResponseEntity<SurveyTopics> save(@RequestBody SurveyTopics surveyTopics ){
		SurveyTopics surveyTopic = surveyTopicsService.save(surveyTopics);
				
		 return  new ResponseEntity<SurveyTopics>(surveyTopic , HttpStatus.OK);
	}

	
	
	@GetMapping("/surveytopics/{id}")
	
	public ResponseEntity<SurveyTopics> get(@PathVariable("id") Long id) {
		try {
		SurveyTopics surveyTopics = surveyTopicsService.findById(id);
		return new ResponseEntity<SurveyTopics>(surveyTopics, HttpStatus.OK);
		}
		catch (ResourceNotFoundException exc) {
				throw new ResponseStatusException(
				HttpStatus.NOT_FOUND, "Foo Not Found", exc);
			}
	}
	 
    
	
}
