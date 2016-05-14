/**

 * Use a multiline comment to include:

 * An Vo

 * CSCI 1583 (Fall 2014)

 * Homework 2

 * 09/04/14

 **/

import java.util.Scanner;

public class Homework2
{
	public static void main( String[] args )
	{
		
		Scanner scan = new Scanner(System.in);

		String again;
		System.out.println("Greetings! I am a basic calculator.");
		System.out.println("However, I can perform calculations using only two numbers.");
		System.out.print ("Please enter in your first number: ");
		double x = scan.nextDouble ();
		System.out.print ("Now enter in your second number: ");
		double y = scan.nextDouble ();

		double add = x + y;
		double subtract1 = y - x;
		double subtract2 = x - y;
		double multiply = x * y;
		double divide1 = y / x;
		double divide2 = x / y;
		double mod1 = x % y;
		double mod2 = y % x;

		System.out.println("Enter the number for your desired operation:");
		System.out.println("1)addition  2)subtraction  3)multiplication  4)division  5)modulus");
		int operation = scan.nextInt ();
		{
			if (operation == (1))
			{
				System.out.println("The sum of the two numbers is " + add);
			}
			if (operation == (2))
			{
				System.out.print ("The differences between the two numbers are " + subtract1);
				System.out.println(" and " + subtract2);
			}
			if (operation == (3))
			{
				System.out.println("The product of the two numbers is " + multiply);
			}
			if (operation == (4))
			{
				System.out.print ("The quotients of the two numbers are " + divide1);
				System.out.println(" and " + divide2);
			}
			if (operation == (5))
			{
				System.out.print ("The moduli for the two numbers are " + mod1);
				System.out.println(" and " + mod2);
			}
		}
		System.out.println("Thank you for calculating!");
	}
}
