import java.util.Scanner;

public class Exercise4 {

	public static void main (String[] args) {

		Scanner scan = new Scanner (System.in);

		int integer;

		System.out.println ("Enter an integer between 0 and 10.");
		integer = scan.nextInt ();
		if (integer >= 0 && integer <= 10) {
			System.out.println ("Valid number.");
		}
		else
			System.out.println ("Invalid number.");

		System.out.println ("Enter an integer divisible by 2 or 3.");
		integer = scan.nextInt ();
		if (integer % 2 == 0 || integer % 3 == 0) {
			System.out.println ("Valid number.");
		}
		else
			System.out.println ("Invalid number.");

		System.out.println ("Enter an integer that is either 'negative and even' or 'positive and odd.'");
		integer = scan.nextInt ();
		if (integer <= 0 && integer % 2 == 0) {
			System.out.println ("Negative and even.");
		}
		if (integer >= 0 && integer % 3 == 0) {
			System.out.println ("Positive and odd.");
		}

	}

}
