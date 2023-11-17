import java.util.Scanner;

public class StudentReportCard {

	public static void printPromt() {
		System.out.println("");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		UserReportCard userReportCard= new UserReportCard();
		
		System.out.println("Please Enter School Name");
		userReportCard.setSchoolName(input.nextLine());
		System.out.println("Please Enter Sudent Name");
		userReportCard.setName(input.nextLine());
		System.out.println("Please Enter Student ID");
		userReportCard.setId(input.nextLong());
		System.out.println("Please Enter Class Grade (1 - 12)");
		userReportCard.setClassGrade(input.nextInt());
		
		
		
		
		do {			
			System.out.println("Subject Marks");
			System.out.println("Please use Numbers on the left:");
			System.out.println("1. Math");
			System.out.println("2. Science");
			System.out.println("3. English");
			System.out.println("4. Computer Science");
			System.out.println("5. Spanish");
			
			int inInt = input.nextInt();
			int in=0;
			
			switch(inInt) {
			
			case 1:
				System.out.println("Enter Math Score: ");
				in=input.nextInt();
				userReportCard.setMath(in);
				break;
			case 2:
				System.out.println("Enter Science Score: ");
				in=input.nextInt();
				userReportCard.setScience(in);
				break;
			case 3:
				System.out.println("Enter English Score: ");
				in=input.nextInt();
				userReportCard.setEnglish(in);
				break;
			case 4:
				System.out.println("Enter Computer Science Score: ");
				in=input.nextInt();
				userReportCard.setComputerScience(in);
				break;
			case 5:
				System.out.println("Enter Spanish Score: ");
				in=input.nextInt();
				userReportCard.setSpanish(in);
				break;
			default:
				System.out.println("Wrong Input");
			}
			
						
			System.out.println("Enter 'y' To Input Another Score");
			
		}while(input.next().equals("y"));
		
		userReportCard.generateReportCard();
		
		System.out.println("Thank You");
	}

}
