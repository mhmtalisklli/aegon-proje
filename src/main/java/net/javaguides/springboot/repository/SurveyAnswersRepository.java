package net.javaguides.springboot.repository;

import java.util.List;

import org.hibernate.mapping.Map;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import net.javaguides.springboot.model.SurveyAnswers;

@Repository
public interface SurveyAnswersRepository  extends JpaRepository<SurveyAnswers , Long> {
	

	
}
