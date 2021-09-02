package net.javaguides.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.springboot.model.SurveyTopics;

public interface SurveyTopicsRepository  extends JpaRepository<SurveyTopics , Long>{

}
