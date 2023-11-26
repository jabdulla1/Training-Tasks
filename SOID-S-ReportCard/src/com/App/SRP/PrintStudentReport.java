package com.App.SRP;

public class PrintStudentReport implements IPrintStudentReport {

	@Override
	public void generateReportCard(Student student, ICalStudentTotal iCalStudentTotal, ICalStudentGrade iCalStudentGrade, ICalStudentAvg iCalStudentAvg) {
		// TODO Auto-generated method stub
		System.out.println("--------------------------------------------------------------");
		System.out.println("Student Report Card");
		System.out.println("--------------------------------------------------------------");
		System.out.println("\t\t\t"+student.getSchoolName());
		System.out.println("--------------------------------------------------------------");
		System.out.print("Name: "+ student.getName()+"\t\t|");
		System.out.println(" Class Grade: "+ student.getClassGrade());
		System.out.println("--------------------------------------------------------------");
		System.out.println("Subject\t\t\t| Marks");
		System.out.println("--------------------------------------------------------------");
		System.out.println("Math: \t\t\t|"+student.getMath()+"%");
		System.out.println("Science: \t\t|"+student.getScience()+"%");
		System.out.println("English: \t\t|"+student.getEnglish()+"%");
		System.out.println("Computer Science: \t|"+student.getComputerScience()+"%");
		System.out.println("Spanish: \t\t|"+student.getSpanish()+"%");
		System.out.println("--------------------------------------------------------------");
		System.out.println("Total: "+iCalStudentTotal.calTotal(student));
		System.out.println("Average: "+iCalStudentAvg.calAverage(student)+"%");
		System.out.println("Grade: "+iCalStudentGrade.calGrade(student));
		System.out.println("--------------------------------------------------------------");
	}

}
