package com.app.ojects;

import java.util.List;

public abstract class Quiz {
	long quizId;
	String name;
	List<String> questions;
	List<String> answers;
	List<String> explanations;
	double score;
	
	
	
	public long getQuizId() {
		return quizId;
	}



	public void setQuizId(long quizId) {
		this.quizId = quizId;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public List<String> getQuestions() {
		return questions;
	}



	public void setQuestions(List<String> questions) {
		this.questions = questions;
	}



	public List<String> getAnswers() {
		return answers;
	}



	public void setAnswers(List<String> answers) {
		this.answers = answers;
	}



	public double getScore() {
		return score;
	}



	public void setScore(double score) {
		this.score = score;
	}

	

	public List<String> getExplanations() {
		return explanations;
	}



	public void setExplanations(List<String> explanations) {
		this.explanations = explanations;
	}



	public abstract double TakeQuiz();
}
