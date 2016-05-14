/**
 * An Vo
 * CSCI 2120-001
 * Homework 2
 * 13 Friday 2015
 **/

/**
 * Dr. Summa, I have included this main method for you to test if you feel like it.
 * I thought that since I'm still not completely familiar with Junit testing. You can use this
 * after you've tested the JunitRunner seeing how this main will allow you to test and type whatever Strings
 * and integers you want and at a faster rate.
 */
import java.util.Scanner; // import Scanner to receive user input

public class RecursionRunner {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int index = 0;

		System.out.print("I will compare two strings for you." + "\n" + "Enter your first string: ");
		String str1 = scan.nextLine();
		System.out.print("Enter your second string: ");
		String str2 = scan.nextLine();
		
		Recursion rc = new Recursion();
		int result = rc.compare(str1, str2, index);
		if(result == -1) {
			System.out.println(str1 + " comes before " + str2 + ".");
		}
		if(result == 1) {
			System.out.println(str2 + " comes before " + str1 + ".");
		}
		if(result == 0) {
			System.out.println(str1 + " and " + str2 + " are the same words.");
		}
		
		
		System.out.println("");
		System.out.println("OK. Moving on..."); // moving on to recursively multiplying integers
		System.out.println("");
		
		
		System.out.print("I will multiply two positive integers for you." + "\n" + "Enter your first integer: ");
		int num1 = scan.nextInt();
		while(num1 < 0) {
			System.out.print("Make sure your first integer is positive: ");
			num1 = scan.nextInt();
		}
		System.out.print("Enter your second integer: ");
		int num2 = scan.nextInt();
		while(num2 < 0) {
			System.out.print("Make sure your second integer is positive: ");
			num2 = scan.nextInt();
		}

		result = rc.multiply(num1, num2);
		System.out.println(num1 + " x " + num2 + " = " + result);
		
	} // end main
	
} // end RecursionRunner
