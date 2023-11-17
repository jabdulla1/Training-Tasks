
public class UserReportCard {
	String name;
	long id=0;
	int classGrade=1;
	String grade;
	double total=0;
	double average=0;
	double math=0;
	double science=0;
	double english=0;
	double computerScience=0;
	double spanish=0;
	String schoolName;
	
	
	public UserReportCard() {
		super();
	}

	public UserReportCard(String name, long id, int classGrade, double math, double science, double english,
			double computerScience, double spanish) {
		super();
		this.name = name;
		this.id = id;
		this.classGrade = classGrade;
		this.math = math;
		this.science = science;
		this.english = english;
		this.computerScience = computerScience;
		this.spanish = spanish;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getClassGrade() {
		return classGrade;
	}
	public void setClassGrade(int classGrade) {
		this.classGrade = classGrade;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public double getAverage() {
		return average;
	}
	public void setAverage(double average) {
		this.average = average;
	}
	public double getMath() {
		return math;
	}
	public void setMath(double math) {
		this.math = math;
	}
	public double getScience() {
		return science;
	}
	public void setScience(double science) {
		this.science = science;
	}
	public double getEnglish() {
		return english;
	}
	public void setEnglish(double english) {
		this.english = english;
	}
	public double getComputerScience() {
		return computerScience;
	}
	public void setComputerScience(double computerScience) {
		this.computerScience = computerScience;
	}
	public double getSpanish() {
		return spanish;
	}
	public void setSpanish(double spanish) {
		this.spanish = spanish;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public double calAverage() {
		this.average=(this.math + this.science + this.english + this.computerScience + this.spanish)/5;
		
		return this.average;
	}
	
	public double calTotal()
	{
		this.total= this.math + this.science + this.english + this.computerScience + this.spanish;
		
		return this.total;
	}
	
	public String calGrade() {
		
		if(Math.ceil(this.average)>95) {
			this.grade="A+";
			return "A+";}
		else if((Math.ceil(this.average)>90) && ( Math.ceil(this.average)<96 )) {
			this.grade="A";
			return "A";}
		else if((Math.ceil(this.average)>80 ) && (Math.ceil(this.average)<89 )) {
			this.grade="B";
			return "B";}
		else if((Math.ceil(this.average)>70 ) && (Math.ceil(this.average)<79 )) {
			this.grade="C";
			return "C";}
		else if((Math.ceil(this.average)>60 ) && (Math.ceil(this.average)<69 )) {
			this.grade="D";
			return "D";}
		else if(Math.ceil(this.average)<60 ) {
			this.grade="F";
			return "F";}
		else {
			return "Something went wrong";
		}
	}

	public void generateReportCard() {
		// TODO Auto-generated method stub
		//System.out.println("Display Report");		
		
		System.out.println("--------------------------------------------------------------");
		System.out.println("Student Report Card");
		System.out.println("--------------------------------------------------------------");
		System.out.println("\t\t\t"+this.schoolName);
		System.out.println("--------------------------------------------------------------");
		System.out.print("Name: "+ this.name);
		System.out.println("\t| Class Grade: "+ this.classGrade);
		System.out.println("--------------------------------------------------------------");
		System.out.println("Subject\t\t\t| Marks");
		System.out.println("--------------------------------------------------------------");
		System.out.println("Math: \t\t\t|"+this.math);
		System.out.println("Science: \t\t|"+this.science);
		System.out.println("English: \t\t|"+this.english);
		System.out.println("Computer Science: \t|"+this.computerScience);
		System.out.println("Spanish: \t\t|"+this.spanish);
		System.out.println("--------------------------------------------------------------");
		System.out.println("Total: "+this.calTotal());
		System.out.println("Average: "+this.calAverage());
		System.out.println("Grade: "+this.calGrade());
		System.out.println("--------------------------------------------------------------");
	}

	@Override
	public String toString() {
		return "UserReportCard [name=" + name + ", id=" + id + ", classGrade=" + classGrade + ", grade=" + grade
				+ ", total=" + total + ", average=" + average + ", math=" + math + ", science=" + science + ", english="
				+ english + ", computerScience=" + computerScience + ", spanish=" + spanish + ", schoolName="
				+ schoolName + "]";
	}

	

}
