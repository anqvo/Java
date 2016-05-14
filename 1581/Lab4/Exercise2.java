import java.util.Scanner;

public class Exercise2 {

	public static void main (String [] args) {

		Scanner scan = new Scanner (System.in);

		int month = 0;

		do {
			System.out.print ("Please enter the month: ");
			month = scan.nextInt ();
		
			if (month == 9) {
				System.out.println ("Yes, it is September.");
			} else
				System.out.println ("Guess again.");
		} while (month <= 12 && month >= 1);

	}

}
