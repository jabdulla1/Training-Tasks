package com.App.SRP;

public class CalStudentGrade implements ICalStudentGrade{

	@Override
	public String calGrade(Student student) {
		if(Math.ceil(student.getAverage())>95) {
			student.setGrade("A+");
			return "A+";}
		else if((Math.ceil(student.getAverage())>=90) && ( Math.ceil(student.getAverage())<=96 )) {
			student.setGrade("A");
			return "A";}
		else if((Math.ceil(student.getAverage())>=80 ) && (Math.ceil(student.getAverage())<=89 )) {
			student.setGrade("B");
			return "B";}
		else if((Math.ceil(student.getAverage())>=70 ) && (Math.ceil(student.getAverage())<=79 )) {
			student.setGrade("C");
			return "C";}
		else if((Math.ceil(student.getAverage())>=60 ) && (Math.ceil(student.getAverage())<=69 )) {
			student.setGrade("D");
			return "D";}
		else if(Math.ceil(student.getAverage())<=60 ) {
			student.setGrade("F");
			return "F";}
		else {
			return "Something went wrong";
		}
	}

}
