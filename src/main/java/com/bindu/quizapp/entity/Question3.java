package com.bindu.quizapp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Question3 {

	@Id
	private int id;
	private String questionTitle;
	private String option1;
	private String option2;
	private String rightAnswer;
	private String difficultLevel;
	
	public Question3() {}
	
	public Question3(int id, String questionTitle, String option1, String option2, String rightAnswer,
			String difficultLevel) {
		super();
		this.id = id;
		this.questionTitle = questionTitle;
		this.option1 = option1;
		this.option2 = option2;
		this.rightAnswer = rightAnswer;
		this.difficultLevel = difficultLevel;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQuestionTitle() {
		return questionTitle;
	}
	public void setQuestionTitle(String questionTitle) {
		this.questionTitle = questionTitle;
	}
	public String getOption1() {
		return option1;
	}
	public void setOption1(String option1) {
		this.option1 = option1;
	}
	public String getOption2() {
		return option2;
	}
	public void setOption2(String option2) {
		this.option2 = option2;
	}
	public String getRightAnswer() {
		return rightAnswer;
	}
	public void setRightAnswer(String rightAnswer) {
		this.rightAnswer = rightAnswer;
	}
	public String getDifficultLevel() {
		return difficultLevel;
	}
	public void setDifficultLevel(String difficultLevel) {
		this.difficultLevel = difficultLevel;
	}
	
	@Override
	public String toString() {
		return "Question [id=" + id + ", questionTitle=" + questionTitle + ", option1=" + option1 + ", option2="
				+ option2 + ", rightAnswer=" + rightAnswer + ", difficultLevel=" + difficultLevel + "]";
	}
}
