/**
 * Exercise One
 * Lab Three
 * Author: An Vo
 **/

import java.util.Scanner;

public class ExerciseOne {

	public static void main (String [] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println ("Please enter a number: ");
		int input = scan.nextInt ();

		if (input % 10 == 0) {
		System.out.println ("Yes, the number is divisble by ten.");
		}
		else
		System.out.println ("No, the number is not divisible by ten.");


	}


}
