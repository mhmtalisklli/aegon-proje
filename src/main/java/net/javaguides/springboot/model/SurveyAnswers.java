package net.javaguides.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.ParameterMode;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

import org.springframework.data.jpa.repository.query.Procedure;

@Entity   
@Table(name= "survey_answers")


public class SurveyAnswers {
	
	
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "survey_id")
	private Integer surveyId;
	@NotEmpty
	@Column(name = "answer")
	private String answer;
	
	@Column(name = "topic")
	private String topic;

	 @Min(0)
	 @Max(10)
	@Column(name="user_score")
	private Integer userScore;
	
	

	
       public SurveyAnswers() {
 		
 	}



	


	public SurveyAnswers(Integer surveyId, String answer, String topic, Integer userScore) {
		super();
		this.surveyId = surveyId;
		this.answer = answer;
		this.topic = topic;
		this.userScore = userScore;
	}






	public String getTopic() {
		return topic;
	}






	public void setTopic(String topic) {
		this.topic = topic;
	}






	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}

	public Integer getSurveyId() {
		return surveyId;
	}



	public void setSurveyId(Integer surveyId) {
		this.surveyId = surveyId;
	}



	public String getAnswer() {
		return answer;
	}



	public void setAnswer(String answer) {
		this.answer = answer;
	}



	public Integer getUserScore() {
		return userScore;
	}



	public void setUserScore(Integer userScore) {
		this.userScore = userScore;
	}
	
       
       
	

}
