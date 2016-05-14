import java.util.Scanner;

public class Homework4 {

	//main method
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int choice = 0;

		do {
			Homework4.mainMenu();
			choice = scan.nextInt();
			if (choice == 1) {
				String studentName = Homework4.getName();
				Homework4.instructionsMenu();

				float[] arrayHW = Homework4.hwInput();
				for(int i = 0; i < arrayHW.length; i++)
					System.out.println(arrayHW[i]);				
				float hwAvg = Homework4.avgER(arrayHW);
				System.out.println("The average of Homework Grades is " + hwAvg + ".");

				float[] arrayQuiz = Homework4.quizInput();
				for(int i = 0; i < arrayQuiz.length; i++)
					System.out.println(arrayQuiz[i]);
				float quizAvg = Homework4.avgER(arrayQuiz);
				System.out.println("The average of Quiz Grades is " + quizAvg + ".");

				float[] arrayTest = Homework4.testInput();
				for(int i = 0; i < arrayTest.length; i++)
					System.out.println(arrayTest[i]);
				float testAvg = Homework4.avgER(arrayTest);
				System.out.println("The average of Test Grades is " + testAvg + ".");

				float finalAvg = Homework4.finalAvgER(hwAvg, quizAvg, testAvg);
				System.out.println("The final average for " + studentName + " is " + finalAvg + ".");
			} //end if
		} while (choice != 2); //end do
			if (choice == 2) {
				System.out.println();	//skip line
				System.out.println("Thank you and goodbye.");
			} //end if
	} //end main




	//mainMenu method
	public static void mainMenu() {
		System.out.println(); 			//skip line

		System.out.println("Welcome to GradeBook. Would you like to: ");
		System.out.println("   1) Average grades for a new student?");
		System.out.println("   2) Quit the program?");

		System.out.println(); 			//skip line

		System.out.print("Enter your choice: ");
	} //end mainMenu




	//getName method
	public static String getName() {
		System.out.println();			//skip line
		Scanner scan = new Scanner(System.in);

		System.out.print("Please enter the student's first and last name: ");
		String firstName = scan.next();
		String lastName = scan.next();
		String studentName = firstName + " " + lastName;

		return studentName;
	} //end getName




	//instructionsMenu method
	public static void instructionsMenu() {
		System.out.println(); 			//skip line

		System.out.println("Grades are placed into 3 categories: ");
		System.out.println("   1) Homework Grades");
		System.out.println("   2) Quiz Grades");
		System.out.println("   3) Test Grades");
	} //end instructionsMenu




	//hwInput method
	public static float[] hwInput() {
		System.out.println();			 //skip line
		Scanner scan = new Scanner(System.in);

		System.out.println("1) Homework Grades");
		System.out.print("Enter the amount of grades to be submitted: ");
		int amount = scan.nextInt();
		float[] arrayHWGrades = new float[amount];
		System.out.println();			//skip line

		System.out.println("Enter all Homework Grades below.");
		for (int i = 0; i < arrayHWGrades.length; i++)
			arrayHWGrades[i] = scan.nextFloat();

		System.out.println();			//skip line
		return arrayHWGrades;
	} //end hwInput



	
	//quizInput method
	public static float[] quizInput() {
		System.out.println();			 //skip line
		Scanner scan = new Scanner(System.in);

		System.out.println("2) Quiz Grades");
		System.out.print("Enter the amount of grades to be submitted: ");
		int amount = scan.nextInt();
		float[] arrayQuizGrades = new float[amount];
		System.out.println();			//skip line

		System.out.println("Enter all Quiz Grades below.");
		for (int i = 0; i < arrayQuizGrades.length; i++)
			arrayQuizGrades[i] = scan.nextFloat();

		System.out.println();			 //skip line
		return arrayQuizGrades;
	} //end quizInput




	//testInput method
	public static float[] testInput() {
		System.out.println();			 //skip line
		Scanner scan = new Scanner(System.in);

		System.out.println("3) Test Grades");
		System.out.print("Enter the amount of grades to be submitted: ");
		int amount = scan.nextInt();
		float[] arrayTestGrades = new float[amount];
		System.out.println();			//skip line

		System.out.println("Enter all Test Grades below.");
		for (int i = 0; i < arrayTestGrades.length; i++)
			arrayTestGrades[i] = scan.nextFloat();

		System.out.println();			 //skip line
		return arrayTestGrades;
	} //end testInput




	// avgER method
	public static float avgER(float[] x) {
		System.out.println();			//skip line

		float sum = 0;
		for(int i = 0; i < x.length; i++)
			sum += x[i];

		float avg = 0;
		for(int i = 0; i < x.length; i++)
			avg = sum / x.length;
		
		return avg;
	} //end avgER



	//finalAvgER method
	public static float finalAvgER(float x, float y, float z) {
		System.out.println();			//skip line

		float total = 0.25f*x + 0.25f*y + 0.50f*z;
		
		return total;
	} //end finalAvgER

} //end class Homework4
