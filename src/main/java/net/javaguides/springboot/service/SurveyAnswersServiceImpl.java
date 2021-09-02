package net.javaguides.springboot.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Service;

import net.javaguides.springboot.model.SurveyAnswers;
import net.javaguides.springboot.repository.SurveyAnswersRepository;
@Service
public class SurveyAnswersServiceImpl implements SurveyAnswersService {
	 private EntityManager em;
	  private SimpleJdbcCall simpleJdbcCall;
	@Autowired
	SurveyAnswersRepository surveyAnswersRepository;
	@Override
	public List<SurveyAnswers> findAll() {
		return	surveyAnswersRepository.findAll();
		 
	}
	@Override
	public SurveyAnswers save(SurveyAnswers surveyanswers) {

		surveyAnswersRepository.save(surveyanswers);
		
		return surveyanswers;
	}
	@Override
	public SurveyAnswers findById(Long id) {
		if(surveyAnswersRepository.findById(id).isPresent()){
			return surveyAnswersRepository.findById(id).get();
		}
		return null;
	}



	
}
