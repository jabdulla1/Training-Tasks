package com.app.ojects;

public class User {
	long userId;
	String userName;
	String password;
	Quiz quiz;
	
	public User() {
		super();
	}


	public User(long userId, String userName, String password, Quiz quiz) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.quiz = quiz;
	}


	public long getUserId() {
		return userId;
	}


	public void setUserId(long userId) {
		this.userId = userId;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public Quiz getQuiz() {
		return quiz;
	}


	public void setQuiz(JavaQuiz quiz) {
		this.quiz = quiz;
	}
	
	
	
	
}
