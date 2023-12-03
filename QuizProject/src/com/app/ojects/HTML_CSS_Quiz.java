package com.app.ojects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HTML_CSS_Quiz extends Quiz {
	
	public HTML_CSS_Quiz(String name) {
		super();
		this.name= name;
		
		this.questions = new ArrayList<String>();
		this.answers = new ArrayList<String>();
		
		this.questions.add("1. HTML is the standard ____language for creating Web pages.\r\n"
				+ "\r\n"
				+ "a) scripting\r\n"
				+ "b) programming\r\n"
				+ "c) styling\r\n"
				+ "d) markup");
		this.questions.add("2. HTML stands for_______.\r\n"
				+ "\r\n"
				+ "a) Hyperactive Text Markup Language\r\n"
				+ "b) Hyper Text Markup Language\r\n"
				+ "c) Hyper Text Machine Language\r\n"
				+ "d) None of these");
		this.questions.add("3. Which is the correct syntax to include comment in an HTML document?\r\n"
				+ "\r\n"
				+ "a) //\r\n"
				+ "b) /* Comment */\r\n"
				+ "c) // Comment //\r\n"
				+ "d) <!-- Comment -->");
		this.questions.add("4. What is CSS stands for?\r\n"
				+ "\r\n"
				+ "a) Cascading Style Sheets\r\n"
				+ "b) Cascade Style Sheet\r\n"
				+ "c) Color Style Sheets\r\n"
				+ "d) Color Style Sheet");
		this.questions.add("5. What CSS describes?\r\n"
				+ "\r\n"
				+ "a) CSS describes how calculation perform on button click.\r\n"
				+ "b) CSS describes how HTML elements are to be displayed on screen, paper, or in other media\r\n"
				+ "c) Both A. and B.\r\n"
				+ "d) None of the above");
		this.questions.add("6. What is the correct syntax for referring an external CSS?\r\n"
				+ "\r\n"
				+ "a) <link rel=\"stylesheet\" type=\"text/css\" href=\"mystyle.css\">\r\n"
				+ "b) <stylesheet rel=\"stylesheet\" type=\"text/css\" href=\"mystyle.css\">\r\n"
				+ "c) <style rel=\"stylesheet\" type=\"text/css\" href=\"mystyle.css\">\r\n"
				+ "d) All of the above");
		this.questions.add("7. What is a CSS selector?\r\n"
				+ "\r\n"
				+ "a) A CSS selector is the CSS class name\r\n"
				+ "b) A CSS selector is the set of properties that are going to be applied on HTML elements\r\n"
				+ "c) A CSS selector is name of CSS file.\r\n"
				+ "d) A CSS selector is the first part of a CSS Rule. It may an HTML element or pattern of elements.");
		this.questions.add("8. In a CSS file, there is a CSS rule for paragraphs tags – what does p can be called?\r\n"
				+ "\r\n"
				+ "a) Selector\r\n"
				+ "b) Attribute\r\n"
				+ "c) Property\r\n"
				+ "d) Tag");
		this.questions.add("9. Inline styles are written within the _____ attribute.\r\n"
				+ "\r\n"
				+ "a) style\r\n"
				+ "b) css\r\n"
				+ "c) stylesheet\r\n"
				+ "d) Both A. and B.");
		this.questions.add("10. Which property is used to define the text color?\r\n"
				+ "\r\n"
				+ "a) text-color\r\n"
				+ "b) color\r\n"
				+ "c) font-color\r\n"
				+ "d) Both A. and B.");
		
		this.answers.add("d");
		this.answers.add("b");
		this.answers.add("d");
		this.answers.add("a");
		this.answers.add("b");
		this.answers.add("a");
		this.answers.add("d");
		this.answers.add("a");
		this.answers.add("a");
		this.answers.add("b");
		
		this.explanations = new ArrayList<String>();
		
		this.explanations.add("Answer: D) markup\r\n"
				+ "Explanation:\r\n"
				+ "HTML is the standard markup language for creating Web pages.\r\n"
				+ "");
		this.explanations.add("Answer: B) Hyper Text Markup Language\r\n"
				+ "Explanation:\r\n"
				+ "HTML stands for \"Hyper Text Markup Language\".\r\n"
				+ "");
		this.explanations.add("Answer: D) <!-- Comment -->\r\n"
				+ "Explanation:\r\n"
				+ "You can add comments to your HTML source by using the following syntax,\r\n"
				+ "");
		this.explanations.add("Answer: A) Cascading Style Sheets\r\n"
				+ "Explanation:\r\n"
				+ "The full form of the CSS is Cascading Style Sheets. Cascading Style Sheets is a style sheet language used for describing the presentation of a document written in a markup language such as HTML. CSS is a cornerstone technology of the World Wide Web, alongside HTML and JavaScript.\r\n"
				+ "");
		this.explanations.add("Answer: B) CSS describes how HTML elements are to be displayed on screen, paper, or in other media\r\n"
				+ "Explanation:\r\n"
				+ "CSS describes how HTML elements are to be displayed on screen, paper, or in other media.\r\n"
				+ "");
		this.explanations.add("Answer: A) <link rel=\"stylesheet\" type=\"text/css\" href=\"mystyle.css\">\r\n"
				+ "Explanation:\r\n"
				+ "The correct syntax to include (refer) an external CSS in an HTML document is,\r\n"
				+ "");
		this.explanations.add("Answer: D) A CSS selector is the first part of a CSS Rule. It may an HTML element or pattern of elements\r\n"
				+ "Explanation:\r\n"
				+ "A CSS selector is the first part of a CSS Rule. It may an HTML element or pattern of elements and other terms that tell the browser which HTML elements should be selected to have the CSS property values inside the rule applied to them.\r\n"
				+ "");
		this.explanations.add("Answer: A) Selector\r\n"
				+ "Explanation:\r\n"
				+ "In a CSS rule, the HTML element(s) for them we are writing the CSS is known as \"CSS Selector\".\r\n"
				+ "");
		this.explanations.add("Answer: A) style\r\n"
				+ "Explanation:\r\n"
				+ "Inline styles are defined within the style attribute of the relevant element.\r\n"
				+ "");
		this.explanations.add("Answer: B) color\r\n"
				+ "Explanation:\r\n"
				+ "The color property is used to define the text color in CSS.\r\n"
				+ "");
		
		
	}


	

	public HTML_CSS_Quiz(long quizId, String name, List<String> questions, List<String> answers) {
		super();
		this.quizId = quizId;
		this.name = name;
		this.questions = questions;
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
