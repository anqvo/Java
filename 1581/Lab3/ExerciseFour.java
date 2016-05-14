import java.util.Scanner;

public class ExerciseFour {

	public static void main (String [] args) {

		Scanner scan = new Scanner(System.in);

		int gradeCount = 0;
		System.out.print ("Please enter the number of grades: ");
		gradeCount = scan.nextInt ();

		int grades = 0;
		int loop = 0; //looping constant

		System.out.print ("Please enter the grades: ");

		while (loop < gradeCount) {

			int holder = scan.nextInt ();
			grades = grades + holder;
			loop = loop + 1;

		}

		float average = 0;
		average = (float)grades / gradeCount;
		System.out.println ("The average is " + average);

	}

}
