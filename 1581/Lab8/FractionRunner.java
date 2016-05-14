import java.util.Scanner;

public class FractionRunner {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		FractionRunner.printMenu();
		int choice = scan.nextInt();

		if(choice == 1) {
			System.out.println("Enter the first fraction. The numerator first, then the denominator. Do not enter 0 for the denominator.");
			int numerator = scan.nextInt();
			int denominator = scan.nextInt();
			Fraction fraction1 = new Fraction(numerator, denominator); //hard-code constructor
			System.out.println("Enter another fraction, as before.");
			numerator = scan.nextInt();
			denominator = scan.nextInt();
			Fraction fraction2 = new Fraction(numerator, denominator); //hard-code constructor
			Fraction sum = fraction1.addFraction(fraction2);
			System.out.println("The result is " + sum.toString() + ".");
			FractionRunner.printMenu();
		}

		else if(choice == 2) {
			System.out.println("Enter the first fraction. The numerator first, then the denominator. Do not enter 0 for the denominator.");
			int numerator = scan.nextInt();
			int denominator = scan.nextInt();
			Fraction fraction1 = new Fraction(numerator, denominator);
			System.out.println("Enter another fraction, as before.");
			numerator = scan.nextInt();
			denominator = scan.nextInt();
			Fraction fraction2 = new Fraction(numerator, denominator);
			Fraction difference = fraction1.subtractFraction(fraction2);
			System.out.println("The result is " + difference.toString() + ".");
			FractionRunner.printMenu();
		}

		else if(choice == 3) {
			System.out.println("Enter the first fraction. The numerator first, then the denominator. Do not enter 0 for the denominator.");
			int numerator = scan.nextInt();
			int denominator = scan.nextInt();
			Fraction fraction1 = new Fraction(numerator, denominator);
			System.out.println("Enter another fraction, as before.");
			numerator = scan.nextInt();
			denominator = scan.nextInt();
			Fraction fraction2 = new Fraction(numerator, denominator);
			Fraction product = fraction1.multiplyFraction(fraction2);
			System.out.println("The result is " + product.toString() + ".");
			FractionRunner.printMenu();
		}

		else if(choice == 4) {
			boolean success = false;
			while(success == false) {
			try{
				System.out.println("Enter a fraction, first the numerator, then the denominator. Do not enter 0 for the denominator.");
			System.out.println("Enter the first fraction. The numerator first, then the denominator. Do not enter 0 for the denominator.");
			int numerator = scan.nextInt();
			int denominator = scan.nextInt();
			Fraction fraction1 = new Fraction(numerator, denominator);
			System.out.println("Enter another fraction, as before.");
			numerator = scan.nextInt();
			denominator = scan.nextInt();
			Fraction fraction2 = new Fraction(numerator, denominator);
			Fraction quotient = fraction1.divideFraction(fraction2);
			System.out.println("The result is " + quotient.toString() + ".");
			success = true;
			}
			catch(IllegalArgumentException e)
				System.out.println("A non-zero divisor must be given.");
			}
		}

		else
			System.out.println("Thanks and goodbye.");

	}

	public static void printMenu() {
		System.out.println("Select a choice.");
		System.out.println("1. Add two fractions.");
		System.out.println("2. Subtract two fractions.");
		System.out.println("3. Multiply two fractions.");
		System.out.println("4. Divide two fractions.");
		System.out.println("5. Quit.");
	}

}
