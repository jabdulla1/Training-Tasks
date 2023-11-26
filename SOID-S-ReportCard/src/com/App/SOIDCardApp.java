package com.App;

//import java.util.Scanner;

import com.App.SRP.CalStudentAvg;
import com.App.SRP.CalStudentGrade;
import com.App.SRP.CalStudentTotal;
import com.App.SRP.ICalStudentAvg;
import com.App.SRP.ICalStudentGrade;
import com.App.SRP.ICalStudentTotal;
import com.App.SRP.IPrintStudentReport;
import com.App.SRP.IStudentInput;
import com.App.SRP.PrintStudentReport;
import com.App.SRP.Student;
import com.App.SRP.StudentInput;
//import com.App.SRP.UserReportCard;

public class SOIDCardApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student = new Student();
		
		IStudentInput istudentInput = new StudentInput();
		IPrintStudentReport iprintStudentReport = new PrintStudentReport();
		ICalStudentTotal icalTotal = new CalStudentTotal();
		ICalStudentGrade icalGrade = new CalStudentGrade();
		ICalStudentAvg icalAvg = new CalStudentAvg();
		
		
		student = istudentInput.getStudentInput();
		iprintStudentReport.generateReportCard(student, icalTotal, icalGrade, icalAvg);
		
		System.out.println("Thank You");
	}


}
