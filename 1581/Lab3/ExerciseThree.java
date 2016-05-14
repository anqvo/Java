import java.util.Scanner;

public class ExerciseThree {

	public static void main (String [] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println ("I can tell whether or not a number is a multiple of 2, 3, or 5.");
		System.out.print ("Please enter in number:  "); 
		int input = scan.nextInt ();

		if (input % 2 == 0) {
		System.out.println ("The number is even.");
		}

		else if (input % 3 == 0) {
		System.out.println ("The number is a multiple of three.");
		}

		else if (input % 5 == 0) {
		System.out.println ("The number is a multiple of five.");
		}
		else
		System.out.println ("The number is not a multiple of 2, 3, or 5.");

	}

}
