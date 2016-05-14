import java.util.Scanner;

public class HW4Edit {

	//to be able to use Scanner in all methods
	public static final Scanner scan = new Scanner(System.in);

	//main method
	public static void main (String[] args) { 
		int choice = 0;
		String studentName;
		float result = 0;
		
//average everything separately?
//or average each category and return the total average in the same method?

		do {
			HW4Edit.mainMenu();
			choice = scan.nextInt();
			if (choice == 1)
				HW4Edit.getName();
				HW4Edit.instructionsMenu();
				float[] arrayHWGrades = HW4Edit.hwInput();
				float[] arrayQuizGrades = HW4Edit.quizInput();
				float[] arrayTestGrades = HW4Edit.testInput();
				

				result = HW4Edit.arrayAvg(arrayHWGrades, arrayQuizGrades, arrayTestGrades);
				System.out.println(studentName + "'s final average is " + result ".");



		} while (choice != 2);
			if (choice == 2)
				System.out.println("Thank you and goodbye.");
	}

	//mainMenu method prints the main menu
	public static void mainMenu() {
		System.out.println(); 			//space

		System.out.println("Welcome to GradeBook. Would you like to: ");
		System.out.println("1) Average grades for a new student?");
		System.out.println("2) Quit the program?");

		System.out.println(); 			//space

		System.out.print("Enter your choice: ");
	}

	//getName method asks for student's name
	public static String getName() {
		System.out.println();			//space
		System.out.println("Please enter the student's first and last name: ");
		String firstName = scan.next();
		String lastName = scan.next();
		String studentName = firstName + lastName;

		return studentName;
	}

	//instructionsMenu method prints the instructions menu
	public static void instructionsMenu() {
		System.out.println(); 			//space

		System.out.println("Grades are placed into 3 categories & MUST BE entered in the following order: ");
		System.out.println("1) Homework Grades");
		System.out.println("2) Quiz Grades");
		System.out.println("3) Test Grades");
	}

	//hwInput method returns float[]
	public static float[] hwInput() {
		System.out.println(); 			//space

		System.out.print("Enter the amount: ");
		int number = scan.nextInt();
		float[] arrayHWGrades = new float[number];

		System.out.println("Enter all Homework Grades below.");

		int holder = 0;
		for (int i = 0; i < arrayHWGrades.length; i++)
			arrayHWGrades[i] = scan.nextFloat();
			

		return arrayHWGrades[i];
	}
	
	//quizInput method returns float[]
	public static float[] quizInput() {
		System.out.println();			 //space

		System.out.println("Enter all Quiz Grades below.");

		for (int i = 0; i < arrayQuizGrades.length; i++)
	}

	//testInput method returns float[]
	public static float[] testInput() {
		System.out.println(); 			//space

		System.out.println("Enter all Test Grades below.");

		for (int i = 0; i < arrayTestGrades.length; i++)
	}

	




	// method
	public static float arrayAvg(float[] x, float[] y, float[] z) {

		//average HW
		//average Quiz
		//average Test

		//average all

	}

	//finalAvg method

	}
}

