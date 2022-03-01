//************************************************************
// gpaCalc.java					author: Zo DiSanto
//
// calculating a Grade Point Average.
//************************************************************
import java.util.Scanner;
class gpaCalc {
	public static void main(String[] args ) {
		Scanner scan1 = new Scanner(System.in);
		double 	gpa = 0, totPoints = 0, totCredits = 0;
		double 	totPts = 0;
		String 	grade = "";
		int 	credit = 0, input = 0;
		double 	gradeValue = 0;
		
		//Menu || Welcome
		System.out.println("========================================");
		System.out.println("    Welcome to the GPA Calculator!		");
		System.out.println("========================================");
		System.out.println("     How many classes do you take?");
		System.out.println("	E.g., 4, 3, 2, ...");
		System.out.println("========================================");
		input = scan1.nextInt();
		
		//Will repeat question for the number of classes the student is taking
		for(int i = 1; i <= input; i++) {
			Scanner scan2 = new Scanner(System.in);
			System.out.println("========================================");
			System.out.println("How many credits hours do you take for class " + i + "?");
			System.out.println("	E.g., 4, 3, 2, 1, ...");
			System.out.println("========================================");
			credit = scan2.nextInt();
			
			//Grade:
			Scanner scan3 = new Scanner(System.in);
			System.out.println("========================================");
			System.out.println("What grade do you have for class " + i + "?");
			System.out.println("	E.g., A, A-, B+, B, B-, C+, C, ...");
			System.out.println("========================================");
			grade = scan3.next();
			
			//Grade to Point Converter
			if(grade.equals("A")) 			gradeValue = 4.00;
			else if(grade.equals("A-")) 	gradeValue = 3.67;
			else if(grade.equals("B+")) 	gradeValue = 3.33;
			else if(grade.equals("B")) 		gradeValue = 3.00;
			else if(grade.equals("B-"))		gradeValue = 2.67;
			else if(grade.equals("C+")) 	gradeValue = 2.33;
			else if(grade.equals("C")) 		gradeValue = 2.00;
			else if(grade.equals("C-")) 	gradeValue = 1.67;
			else if(grade.equals("D+")) 	gradeValue = 1.33;
			else if(grade.equals("D")) 		gradeValue = 1.00;
			else if(grade.equals ("F") || grade.equals("E")) gradeValue = 0.00;
			//else System.out.println("Invalid Grade");
			totPts = gradeValue * credit;
			
			//Math it up...
			totCredits += credit;
			totPoints += (credit * gradeValue);
		}
		
		//ALL TOGETHER NOW:
		gpa = totPoints / totCredits;
		System.out.println("========================================");
		System.out.println("Your GPA is: " + gpa);
		
		/* 		GPA Cheat Sheet:
		 * Grades	Grade Point Equivalent
		 *  A				4.00
		 *  A-				3.67
		 *  B+				3.33
		 *  B				3.00
		 *  B-				2.67
		 *  C+				2.33
		 *  C				2.00
		 *  C-				1.67
		 *  D				1.00
		 *  F				0.00
		 */
	
	} 
}