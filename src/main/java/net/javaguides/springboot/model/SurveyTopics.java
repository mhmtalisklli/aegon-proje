package net.javaguides.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name= "survey_topics")
public class SurveyTopics {
	
	
	
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private long id;
	
	@NotEmpty
	@Column(name = "topic")
	private String topic;
	@NotEmpty
	@Column(name = "survey_question")
	private String surveyQuestion;
	@Column(name="npm_score")
	private Integer npmScore;

	public SurveyTopics() {
 		
 	}


	public SurveyTopics(String topic, String surveyQuestion, Integer npmScore) {
		super();
		this.topic = topic;
		this.surveyQuestion = surveyQuestion;
		this.npmScore = npmScore;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getSurveyQuestion() {
		return surveyQuestion;
	}


	public void setSurveyQuestion(String surveyQuestion) {
		this.surveyQuestion = surveyQuestion;
	}


	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public Integer getNpmScore() {
		return npmScore;
	}

	public void setNpmScore(Integer npmScore) {
		this.npmScore = npmScore;
	}
	
	
	
	
	
	
	
	
}
 