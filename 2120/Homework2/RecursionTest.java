/**
 * An Vo
 * CSCI 2120-001
 * Homework2
 * 13 Friday 2015
 */

import static org.junit.Assert.*;
import org.junit.Test;

public class RecursionTest {
	
	private Recursion rc = new Recursion();
	
	@Test
	public void testCompare() {
		/**
		 * Modify these two strings to be any String for the purpose of testing Recursion's compare().
		 * Remember to as well modify testResult below for the expected answer compared to what was actually received.
		 */
		String str1 = "Hereafter";
		String str2 = "here";
		int index = 0; // do NOT modify index.

		int result = rc.compare(str1, str2, index); // assigning the return from compare() to integer variable result
		if(result == -1) { // returns -1 meaning str1 comes before str2 alphabetically.
			System.out.println(str1 + " comes before " + str2);
			System.out.println("compare() returned: " + result + "\n"); // print to see compare() test occur.
		}
		if(result == 0) { // returns 0 when both Strings are identical.
			System.out.println(str1 + " and " + str2 + " are the same words.");
			System.out.println("compare() returned: " + result + "\n"); // print to see compare() test occur.
		}
		if(result == 1) { // returns 1 when str2 comes before str1 alphabetically.
			System.out.println(str2 + " comes before " + str1);
			System.out.println("compare() returned: " + result + "\n"); // print to see compare() test occur.
		}
		int testResult = 1; // change this result depending on the two Strings modified for testing.
		assertEquals(result, testResult);
	}
	
	@Test
	public void testMultiply() {
		/**
		 * Modify these integer values to any positive number for the purpose of testing Recursion's multiply().
		 * Remember to as well modify testProduct below for the expected answer compared to what was actually received.
		 */
		int num1 = 12;
		int num2 = 34;
		int product = rc.multiply(num1, num2); // assigning the return from multiply() to integer variable product.
		System.out.println("Testing multiply(): " + num1 + " x " + num2 + " = " + product + "\n"); // print to see multiply() test occur.
		
		int testProduct = 408; // change this product depending on the two integer values modified for testing.
		assertEquals(product, testProduct);
	}
	
	@Test
	public void testMultiplySingle() {
		/**
		 * Modify these integer values to be any positive single digit number for the purpose of testing Recursion's multiplySingle().
		 * Remeber to as well modify testProduct below for the expected answer compared to what was actually received.
		 */
		int num1 = 5;
		int num2 = 6;
		int product = rc.multiply(num1, num2); // assigning the return from multiply() to integer variable product.
		System.out.println("Testing multiplySingle(): " + num1 + " x " + num2 + " = " + product + "\n"); // print to see multiplySingle() test occur.
		
		int testProduct = 30; // change this product depending on the two integer values modified for testing.
		assertEquals(product, testProduct);
	}
}
