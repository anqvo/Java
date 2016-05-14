import java.util.Scanner;

public class Exercise3 {

	public static void main (String [] args) {

		Scanner scan = new Scanner (System.in);

		int choice = -1;

		float hwPercent = 0;
		float quizPercent = 0;
		float testPercent = 0;

		int holder;

		int hwGrades = 0;
		int quizGrades = 0;
		int testGrades = 0;

		int hwCount = 0;
		int quizCount = 0;
		int testCount = 0;

		float average = 0;
		float hwAverage = 0;

		do {
			System.out.println ("Please select from the menu.");
			System.out.println ("1. Set percentage of grade weight.");
			System.out.println ("2. Add grades.");
			System.out.println ("3. Average grades.");
			System.out.println ("4. Quit.");
			choice = scan.nextInt ();

			switch (choice) {

				case 1:
					System.out.println ("Set the homework percentage.");
					hwPercent = scan.nextFloat ();
					System.out.println ("Set the quiz percentage.");
					quizPercent = scan.nextFloat ();
					System.out.println ("Set the test percentage.");
					testPercent = scan.nextFloat ();
					break;

				case 2:
					System.out.println ("Enter the homework grades.");
					holder = 0;
					while ((holder = scan.nextInt ()) != -1) {
						hwGrades = hwGrades + holder;
						hwCount ++;
					}
					System.out.println ("Enter the quiz grades.");
					holder = 0;
					while ((holder = scan.nextInt ()) != -1) {
						quizGrades = quizGrades + holder;
						quizCount++;
					}
					System.out.println ("Enter the test grades.");
					holder = 0;
					while ((holder = scan.nextInt ()) != -1) {
						testGrades = testGrades + holder;
						testCount++;
					}
					break;

				case 3:
					average = (hwPercent*((float)hwGrades/hwCount)) + (quizPercent*((float)quizGrades/quizCount)) + (testPercent*((float)testGrades/testCount));
					System.out.println ("The average of all grades is " + average + ".");
					break;

			}

		} while (choice != 4);
			System.out.println ("Thank you and goodbye.");

	}

}
