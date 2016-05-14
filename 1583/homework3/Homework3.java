import java.util.Scanner;

public class Homework3 {

	public static void main (String [] args) {

		Scanner scan = new Scanner (System.in);
		int answer;

		int homeworkGrades;
		int homeworkGradeCount = 0;
		int homeworkSum = 0;

		int quizGrades;
		int quizGradeCount = 0;
		int quizSum = 0;

		int testGrades;
		int testGradeCount = 0;
		int testSum = 0;

		System.out.println (""); // Skip a line

		do {
			System.out.println ("Welcome to GradeBook. Would you like to: ");
			System.out.println ("1) Average grades for a new student?");
			System.out.println ("2) Quit the program?");

			System.out.println (""); // Skip a line

			System.out.print ("Enter your choice: ");
			answer = scan.nextInt ();

			System.out.println (""); // Skip a line

			if (answer == 1) {
				System.out.println ("You have chosen to average grades for a new student.");

				System.out.println (""); // Skip a line

				System.out.print ("Please enter the student's first and last name: ");
				String student = scan.nextLine (); //Displayed twice because once would not allow input from user
				student = scan.nextLine ();

				System.out.println (""); // Skip a line

				System.out.println ("Grades are placed into three categories: ");
				System.out.println ("First is Homework Grades.");
				System.out.println ("Second is Quiz Grades.");
				System.out.println ("Last is Test Grades.");

				// Starting Homework Grades

				System.out.println (""); // Skip a line

				System.out.println ("We will begin with Homework Grades.");
				System.out.println ("Enter all Homework Grades & enter -1 when complete to proceed to Quiz Grades: ");
				do {
					homeworkGrades = scan.nextInt ();				

					if (homeworkGrades != -1) {
						homeworkGradeCount += 1;
						homeworkSum = homeworkSum + homeworkGrades;
					}				
				} while (homeworkGrades != -1);

				float homeworkAvg = (float) homeworkSum / homeworkGradeCount;
				System.out.print ("The average of Homework Grades is " + homeworkAvg);
				System.out.println (".");

				// Starting Quiz Grades

				System.out.println (""); // Skip a line

				System.out.println ("Proceeding to Quiz Grades.");
				System.out.println ("Enter all Quiz Grades & enter -1 when complete to proceed to Test Grades: ");
				do {
					quizGrades = scan.nextInt ();

					if (quizGrades != -1) {
						quizGradeCount += 1;
						quizSum = quizSum + quizGrades;
					}
				} while (quizGrades != -1);

				float quizAvg = (float) quizSum / quizGradeCount;
				System.out.print ("The average of Quiz Grades is " + quizAvg);
				System.out.println (".");

				// Starting Test Grades

				System.out.println (""); // Skip a line

				System.out.println ("Lastly is Test Grades.");
				System.out.println ("Enter all Test Grades & enter -1 when complete to proceed to Final Averages: ");
				do {
					testGrades = scan.nextInt ();

					if (testGrades != -1) {
						testGradeCount += 1;
						testSum = testSum + testGrades;
					}
				} while (testGrades != -1);

				float testAvg = (float) testSum / testGradeCount;
				System.out.print ("The average of Test Grades is " + testAvg);
				System.out.println (".");

				// Final Averages

				System.out.println (""); // Skip a line

				double finalAvg = 0.25*homeworkAvg + 0.25*quizAvg + 0.50*testAvg;
				System.out.print ("The Final Average for " + student);
				System.out.print (" is ");
				System.out.print (finalAvg);
				System.out.println (".");

				System.out.println (""); // Skip a line

				System.out.println ("...Restarting GradeBook...");

				System.out.println (""); //Skip a line
			}

			if (answer == 2) {
				System.out.println ("...Shutting Down...");
				System.out.println ("Thank you for using GradeBook. Goodbye.");
			}

		} while (answer == 1);

	}

}
