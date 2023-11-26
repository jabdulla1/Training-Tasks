package com.App.SRP;

public class CalStudentAvg implements ICalStudentAvg{

	@Override
	public double calAverage(Student student) {
		student.setAverage((student.getMath() + student.getScience() + student.getEnglish() + student.getComputerScience() + student.getSpanish())/5);
		
		return student.getAverage();
	}

}
