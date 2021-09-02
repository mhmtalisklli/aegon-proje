package net.javaguides.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.javaguides.springboot.model.SurveyTopics;
import net.javaguides.springboot.repository.SurveyAnswersRepository;
import net.javaguides.springboot.repository.SurveyTopicsRepository;

@Service
public class SurveyTopicsServiceImpl implements SurveyTopicsService {

	@Autowired
	SurveyTopicsRepository surveyTopicsRepository;
	@Override
	public List<SurveyTopics> findAll() {
		return	surveyTopicsRepository.findAll();
	
	}

	@Override
	public SurveyTopics findById(Long id) {
		if(surveyTopicsRepository.findById(id).isPresent()){
			return surveyTopicsRepository.findById(id).get();
		}
		return null;
	}

	@Override
	public SurveyTopics save(SurveyTopics surveytopics) {
		
		surveyTopicsRepository.save(surveytopics);
		
		return surveytopics;
	}

}
