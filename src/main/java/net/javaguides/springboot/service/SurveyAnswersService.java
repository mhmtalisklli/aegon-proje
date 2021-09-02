package net.javaguides.springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;

import net.javaguides.springboot.model.SurveyAnswers;
import net.javaguides.springboot.repository.SurveyAnswersRepository;

public interface SurveyAnswersService {
   

	List<SurveyAnswers> findAll();
	
	SurveyAnswers save(SurveyAnswers surveyanswers);

	SurveyAnswers findById(Long id);
	
	

}
