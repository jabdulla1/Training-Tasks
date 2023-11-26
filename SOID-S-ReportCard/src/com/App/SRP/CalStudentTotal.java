package com.App.SRP;

public class CalStudentTotal implements ICalStudentTotal{

	@Override
	public double calTotal(Student student) {
		student.setTotal(student.getMath() + student.getScience() + student.getEnglish() + student.getComputerScience() + student.getSpanish());
		
		return student.total;
	}

}
