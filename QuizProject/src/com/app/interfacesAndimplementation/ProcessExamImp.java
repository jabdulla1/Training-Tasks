package com.app.interfacesAndimplementation;

import java.util.Scanner;

import com.app.ojects.User;

public class ProcessExamImp implements ProcessExam {

	@Override
	public void processUserExam() {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		User loginUser = null;
		LoginUser loginedUser;
		String login;
		do {
			loginUser = new User();
			loginedUser = new LoginUserImp();
			System.out.println("-----------------------------");
			System.out.println("Login to take exam");
			System.out.println("-----------------------------");
			System.out.println("Enter User Name");
			loginUser.setUserName(input.next());
			System.out.println("Enter Password");
			loginUser.setPassword(input.next());
			
			loginUser = loginedUser.Login(loginUser);
			
			if(loginUser != null) {
				break;
			}
			
			System.out.println("Enter y to try again");
			
		}while(input.next().equals("y"));
		
		double score;
		UserCalGrade userCalGrade = new UserCalGradeImp(); 
		
		
		do {
			System.out.println("--------------------------------");
			System.out.println("Welcome "+ loginUser.getUserName() +
			"To The SNVA Quiz");
			System.out.println("--------------------------------");
			System.out.println("Lets start your " +loginUser.getQuiz().getName() +" Quiz");
			
			score = loginUser.getQuiz().TakeQuiz();
			
			System.out.println(userCalGrade.CalGrade(score));
			
			System.out.println("\nEnter y to try again");
		}while(input.next().equals("y"));
		
		System.out.println("Thank You For Taking a SNVA Quiz");
	}

}
