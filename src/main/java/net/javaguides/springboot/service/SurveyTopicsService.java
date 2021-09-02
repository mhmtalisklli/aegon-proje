package net.javaguides.springboot.service;

import java.util.List;

import org.springframework.stereotype.Service;

import net.javaguides.springboot.model.SurveyAnswers;
import net.javaguides.springboot.model.SurveyTopics;

public interface SurveyTopicsService {
	
	List<SurveyTopics> findAll();
	
	SurveyTopics save(SurveyTopics surveytopics);
	
	SurveyTopics findById(Long id);

}
