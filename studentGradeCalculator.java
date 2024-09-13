import java.util.Scanner;

public class studentGradeCalculator {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int subjects = 5;                     //Number of subjects
		int marks[] = new int[subjects];
		int totalMarks = 0;

		//Input marks for each subjects
		for(int i=0; i<subjects; i++) {
			System.out.print("Enter marks in subject " + (i+1) + " :  ");
			marks[i] = sc.nextInt();
			totalMarks += marks[i];
		}
         
		//Calculate average percentage
		double avgPercentage = (double) totalMarks/subjects;

		//Determine grade
		char grade = 1;

		if(avgPercentage >= 80) {
			grade = 'A';
		} else if(avgPercentage <= 70 && avgPercentage >= 60) {
			grade = 'B';
		} else if(avgPercentage <= 50 && avgPercentage >= 30) {
			grade = 'C';
		} else if(avgPercentage < 30) {
			grade = 'F';
		}
        
		System.out.println("Total Marks : " + totalMarks);
		System.out.println("Average percentage : " + avgPercentage);
		System.out.println("Grade calculation : " + grade);
		System.out.println("Result :- " + totalMarks + " | " + avgPercentage + " | " + grade); System.out.println();
	}
}