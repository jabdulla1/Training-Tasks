package com.App.SRP;

public interface IPrintStudentReport {
	public void generateReportCard(Student student, ICalStudentTotal iCalStudentTotal, ICalStudentGrade iCalStudentGrade, ICalStudentAvg iCalStudentAvg);
}
