import java.util.Scanner;

public class Exercise1 {

	public static void main (String [] args) {

		Scanner scan = new Scanner (System.in);

		int i;
		int iterations = 0;
		System.out.println ("How many iterations?");
		iterations = scan.nextInt ();

		for (i = 0; i < iterations; i = i + 1); {
			if (i == iterations - 1) {
				System.out.println ("And finally we're at: " + iterations + ".");
			} else
				System.out.println ("So far we're at: " + (i + 1) + ".");

		}

	}

}
