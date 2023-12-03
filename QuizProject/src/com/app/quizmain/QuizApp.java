package com.app.quizmain;

import com.app.interfacesAndimplementation.ProcessExam;
import com.app.interfacesAndimplementation.ProcessExamImp;

public class QuizApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProcessExam processExam = new ProcessExamImp();
		
		processExam.processUserExam();
	}

}
