package com.App.SRP;

import java.util.Scanner;

public class StudentInput implements IStudentInput{

	@Override
	public Student getStudentInput() {
		Scanner input = new Scanner(System.in);
		
		//student student= new student();
		Student student = new Student();
		
		System.out.println("Please Enter School Name");
		student.setSchoolName(input.nextLine());
		System.out.println("Please Enter Sudent Name");
		student.setName(input.nextLine());
		System.out.println("Please Enter Student ID");
		student.setId(input.nextLong());
		System.out.println("Please Enter Class Grade (1 - 12)");
		student.setClassGrade(input.nextInt());
		
		
		
		
		do {			
			System.out.println("Subject Marks");
			System.out.println("Please use Numbers on the left:");
			System.out.println("1. Math");
			System.out.println("2. Science");
			System.out.println("3. English");
			System.out.println("4. Computer Science");
			System.out.println("5. Spanish");
			
			int inInt = input.nextInt();
			int in=0;
			
			switch(inInt) {
			
			case 1:
				System.out.println("Enter Math Score: ");
				in=input.nextInt();
				student.setMath(in);
				break;
			case 2:
				System.out.println("Enter Science Score: ");
				in=input.nextInt();
				student.setScience(in);
				break;
			case 3:
				System.out.println("Enter English Score: ");
				in=input.nextInt();
				student.setEnglish(in);
				break;
			case 4:
				System.out.println("Enter Computer Science Score: ");
				in=input.nextInt();
				student.setComputerScience(in);
				break;
			case 5:
				System.out.println("Enter Spanish Score: ");
				in=input.nextInt();
				student.setSpanish(in);
				break;
			default:
				System.out.println("Wrong Input");
			}
			
						
			System.out.println("Enter 'y' To Input Another Score");
			
		}while(input.next().equals("y"));
		input.close();
		
		//student.generateReportCard();
		return student;
		
		//System.out.println("Thank You");
	}

}
