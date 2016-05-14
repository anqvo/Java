import java.util.Scanner;

public class ExerciseTwo {

	public static void main (String [] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println ("Please verify age: ");
		int age = scan.nextInt ();

		if (age >= 21) {
		System.out.println ("Knock yourself out! It's five o'clock somewhere.");
		}
		else
		System.out.println ("Sorry, kid; no cocktails for you.");
	}

}
