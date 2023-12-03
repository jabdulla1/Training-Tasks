package com.app.ojects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaQuiz extends Quiz{
	
	public JavaQuiz(String name) {
		super();
		this.name = name;
		this.questions = new ArrayList<String>();
		this.questions.add("1. Who invented Java Programming?\r\n"
				+ "a) Guido van Rossum\r\n"
				+ "b) James Gosling\r\n"
				+ "c) Dennis Ritchie\r\n"
				+ "d) Bjarne Stroustrup");
		this.questions.add("2. Which statement is true about Java?\r\n"
				+ "a) Java is a sequence-dependent programming language\r\n"
				+ "b) Java is a code dependent programming language\r\n"
				+ "c) Java is a platform-dependent programming language\r\n"
				+ "d) Java is a platform-independent programming language");
		this.questions.add("3. Which component is used to compile, debug and execute the java programs?\r\n"
				+ "a) JRE\r\n"
				+ "b) JIT\r\n"
				+ "c) JDK\r\n"
				+ "d) JVM");
		this.questions.add("4. Which one of the following is not a Java feature?\r\n"
				+ "a) Object-oriented\r\n"
				+ "b) Use of pointers\r\n"
				+ "c) Portable\r\n"
				+ "d) Dynamic and Extensible");
		this.questions.add("5. Which of these cannot be used for a variable name in Java?\r\n"
				+ "a) identifier & keyword\r\n"
				+ "b) identifier\r\n"
				+ "c) keyword\r\n"
				+ "d) none of the mentioned");
		this.questions.add("6. What is the extension of java code files?\r\n"
				+ "a) .js\r\n"
				+ "b) .txt\r\n"
				+ "c) .class\r\n"
				+ "d) .java");
		this.questions.add("7. Which environment variable is used to set the java path?\r\n"
				+ "a) MAVEN_Path\r\n"
				+ "b) JavaPATH\r\n"
				+ "c) JAVA\r\n"
				+ "d) JAVA_HOME");
		this.questions.add("8. Which of the following is not an OOPS concept in Java?\r\n"
				+ "a) Polymorphism\r\n"
				+ "b) Inheritance\r\n"
				+ "c) Compilation\r\n"
				+ "d) Encapsulation\r\n"
				+ "View Answer");
		this.questions.add("9. What is not the use of “this” keyword in Java?\r\n"
				+ "a) Referring to the instance variable when a local variable has the same name\r\n"
				+ "b) Passing itself to the method of the same class\r\n"
				+ "c) Passing itself to another method\r\n"
				+ "d) Calling another constructor in constructor chaining");
		this.questions.add("10. Which of the following is a type of polymorphism in Java Programming?\r\n"
				+ "a) Multiple polymorphism\r\n"
				+ "b) Compile time polymorphism\r\n"
				+ "c) Multilevel polymorphism\r\n"
				+ "d) Execution time polymorphism");
		
		this.answers= new ArrayList<String>();
		this.answers.add("b");
		this.answers.add("d");
		this.answers.add("c");
		this.answers.add("b");
		this.answers.add("c");
		this.answers.add("d");
		this.answers.add("d");
		this.answers.add("c");
		this.answers.add("b");
		this.answers.add("b");
		
		this.explanations = new ArrayList<String>();
		
		this.explanations.add("Answer: b\r\n"
				+ "Explanation: Java programming was developed by James Gosling at Sun Microsystems in 1995. James Gosling is well known as the father of Java.\r\n"
				+ "");
		this.explanations.add("Answer: d\r\n"
				+ "Explanation: Java is called ‘Platform Independent Language’ as it primarily works on the principle of ‘compile once, run everywhere’.\r\n"
				+ "");
		this.explanations.add("Answer: c\r\n"
				+ "Explanation: JDK is a core component of Java Environment and provides all the tools, executables and binaries required to compile, debug and execute a Java Program.\r\n"
				+ "");
		this.explanations.add("Answer: b\r\n"
				+ "Explanation: Pointers is not a Java feature. Java provides an efficient abstraction layer for developing without using a pointer in Java. Features of Java Programming are Portable, Architectural Neutral, Object-Oriented, Robust, Secure, Dynamic and Extensible, etc.\r\n"
				+ "");
		this.explanations.add("Answer: c\r\n"
				+ "Explanation: Keywords are specially reserved words that can not be used for naming a user-defined variable, for example: class, int, for, etc.\r\n"
				+ "");
		this.explanations.add("Answer: d\r\n"
				+ "Explanation: Java files have .java extension.\r\n"
				+ "");
		this.explanations.add("Answer: d\r\n"
				+ "Explanation: JAVA_HOME is used to store a path to the java installation.\r\n"
				+ "");
		this.explanations.add("Answer: c\r\n"
				+ "Explanation: There are 4 OOPS concepts in Java. Inheritance, Encapsulation, Polymorphism and Abstraction.\r\n"
				+ "");
		this.explanations.add("Answer: b\r\n"
				+ "Explanation: “this” is an important keyword in java. It helps to distinguish between local variable and variables passed in the method as parameters.\r\n"
				+ "");
		this.explanations.add("Answer: b\r\n"
				+ "Explanation: There are two types of polymorphism in Java. Compile time polymorphism (overloading) and runtime polymorphism (overriding).\r\n"
				+ "");
	}


	public JavaQuiz(long quizId, String name, List<String> questions, List<String> answers) {
		super();
		this.quizId = quizId;
		this.name = name;
		this.questions = questions;
		this.answers = answers;
	}


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


	public List<String> getQuestion() {
		return this.questions;
	}


	public void setQuestion(List<String> questions) {
		this.questions = questions;
	}


	public List<String> getAnswers() {
		return answers;
	}


	public void setAnswers(List<String> answers) {
		this.answers = answers;
	}


	@Override
	public double TakeQuiz() {
		// TODO Auto-generated method stub
		this.score=0;
		
		Scanner input = new Scanner(System.in);
		String in;
		
		System.out.println(this.questions.get(0));
		in= input.next();
		System.out.println(this.explanations.get(0));
		if(in.toLowerCase().equals(answers.get(0))){
			this.score += 2;			
			System.out.println("Good Job You Got The Rigth Answer\n");
		}
		else {
			System.out.println("Wrong Answer");
		}
		System.out.println("Your score is now: "+ this.score);
		
		System.out.println(this.questions.get(1));
		in= input.next();
		System.out.println(this.explanations.get(1));
		if(in.toLowerCase().equals(answers.get(1))){
			this.score += 2;	
			System.out.println("Good Job You Got The Rigth Answer\n");
		}else {
			System.out.println("Wrong Answer");
		}
		System.out.println("Your score is now: "+ this.score);
		
		System.out.println(this.questions.get(2));
		in= input.next();
		System.out.println(this.explanations.get(2));
		if(in.toLowerCase().equals(answers.get(2))){
			this.score += 2;	
			System.out.println("Good Job You Got The Rigth Answer\n");
		}
		else {
			System.out.println("Wrong Answer");
		}
		System.out.println("Your score is now: "+ this.score);
		System.out.println(this.questions.get(3));
		in= input.next();
		System.out.println(this.explanations.get(3));
		if(in.toLowerCase().equals(answers.get(3))){
			this.score += 2;		
			System.out.println("Good Job You Got The Rigth Answer\n");
		}else {
			System.out.println("Wrong Answer");
		}
		System.out.println("Your score is now: "+ this.score);
		
		System.out.println(this.questions.get(4));
		in= input.next();
		System.out.println(this.explanations.get(4));
		if(in.toLowerCase().equals(answers.get(4))){
			this.score += 2;		
			System.out.println("Good Job You Got The Rigth Answer\n");
		}else {
			System.out.println("Wrong Answer");
		}
		System.out.println("Your score is now: "+ this.score);
		
		System.out.println(this.questions.get(5));
		in= input.next();
		System.out.println(this.explanations.get(5));
		if(in.toLowerCase().equals(answers.get(5))){
			this.score += 2;		
			System.out.println("Good Job You Got The Rigth Answer\n");
		}else {
			System.out.println("Wrong Answer");
		}
		System.out.println("Your score is now: "+ this.score);
		
		System.out.println(this.questions.get(6));
		in= input.next();
		System.out.println(this.explanations.get(6));
		if(in.toLowerCase().equals(answers.get(6))){
			this.score += 2;		
			System.out.println("Good Job You Got The Rigth Answer\n");
		}else {
			System.out.println("Wrong Answer");
		}
		System.out.println("Your score is now: "+ this.score);
		
		System.out.println(this.questions.get(7));
		in= input.next();
		System.out.println(this.explanations.get(7));
		if(in.toLowerCase().equals(answers.get(7))){
			this.score += 2;	
			System.out.println("Good Job You Got The Rigth Answer\n");
		}else {
			System.out.println("Wrong Answer");
		}
		System.out.println("Your score is now: "+ this.score);
		
		System.out.println(this.questions.get(8));
		in= input.next();
		System.out.println(this.explanations.get(8));
		if(in.toLowerCase().equals(answers.get(8))){
			this.score += 2;	
			System.out.println("Good Job You Got The Rigth Answer\n");
		}else {
			System.out.println("Wrong Answer");
		}
		System.out.println("Your score is now: "+ this.score);
		
		System.out.println(this.questions.get(9));
		in= input.next();
		System.out.println(this.explanations.get(9));
		if(in.toLowerCase().equals(answers.get(9))){
			this.score += 2;	
			System.out.println("Good Job You Got The Rigth Answer\n");
			
		}else {
			System.out.println("Wrong Answer");
		}
		System.out.println("Your score is now: "+ this.score);
		
		return this.score;
	}


	
	
	
	
}
