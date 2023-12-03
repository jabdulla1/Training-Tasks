package com.app.interfacesAndimplementation;

public class UserCalGradeImp implements UserCalGrade {

	@Override
	public String CalGrade(double score) {
		// TODO Auto-generated method stub
		String grade;
		
		double scorePer = (score*100)/20;
		
		if((Math.ceil(scorePer)>=90)) {
			grade="Your score is: "+ scorePer +"% Which is an A";
			return grade;}
		else if((Math.ceil(scorePer)>=80 ) ) {
			grade="Your score is: "+ scorePer +"% Which is an B";
			return grade;}
		else if((Math.ceil(scorePer)>=70 )) {
			grade="Your score is: "+ scorePer +"% Which is an C";
			return grade;}
		else if((Math.ceil(scorePer)>60 ) ) {
			grade="Your score is: "+ scorePer +"% Which is an D";
			return grade;}
		else if(Math.ceil(scorePer)<=60 ) {
			grade="Your score is: "+ scorePer +"% Which is an F";
			return grade;}
		else {
			return "Something went wrong";
		}
		
	}

}
