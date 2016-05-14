/**
 * An Vo
 * CSCI 2120-001
 * Homework 2
 * 13 Friday 2015
 **/

/**
 * Class Recursion consists of three recursive methods each having a specific purpose.
 * compare() will compare two Strings to see which comes before the other alphabetically.
 * multiply() will multiply two integers similar to grid multiplication in elementary school.
 * multiplySingle() will multiply single digit integers by calling itself a certain number of times.
 * 					  will also work along with multiply() to assist with indirect recursion.
 */
public class Recursion {

	/**	This direct recursive method takes in two Strings and int index, using the index
	 *		to cycle through each individual character of each String, starting from the zeroeth
	 *		index and compare them. The method will return an integer, whether it be less
	 *		than, greater than, or equal to zero depending on the resulting order the Strings were compared.
	 *
	 * @requires parameters(String a, String b, int index), index = 0
	 * @ensures returnval < 0 means str1 < str2,
	 *				returnval == 0 means str1 == str2,
	 *				returnval > 0  means str1 > str2
	 */
	public int compare(String str1, String str2, int index) {
		
		// returns 0 if both Strings are identical regardless of their letter case.
		if(str1.toLowerCase().matches(str2.toLowerCase()) == true) {
			return 0;
		}
		
		/**
		 * Checks when both Strings are nearly identical; however, one is shorter than the other.
		 * e.g. str1 = "here", str2 = "hereafter"
		 * returns -1 for str1 comes before str2
		 */
		if(index == str1.length() && index < str2.length()) {
			System.out.print(str1 + " ends with " + str1.charAt(index-1) + " meaning "); // print to easily see comparisons
			return -1;
		}
		/**
		 * Checks when both Strings are nearly identical; however, one is shorter than the other.
		 * e.g. str1 = "hereafter", str2 = "here"
		 * returns 1 for str2 comes before str1
		 */
		if(index == str2.length() && index < str1.length()) {
			System.out.print(str2 + " ends with " + str2.charAt(index-1) + " meaning "); // print to easily see comparisons
			return 1;
		}
		
		/**
		 * Checks whether each charAt(index) of both Strings are identical; if true, compare() calls itself and recursion occurs.
		 * returns compare() calling itself and passing in arguments (str1, str2, index+1)
		 */
		if(str1.toLowerCase().charAt(index) == str2.toLowerCase().charAt(index)) {
			System.out.println(str1.charAt(index) + " and " + str2.charAt(index) + " are equal. Checking the next character..."); // print to easily see index cycle through each char
			return compare(str1, str2, index+1);
		}
		/**
		 * Checks whether charAt(index) of str1 comes before (is less than) charAt(index) of str2; if true, return -1
		 * returns -1 for str1 comes before str2
		 */
		if(str1.toLowerCase().charAt(index) < str2.toLowerCase().charAt(index)) {
			System.out.println(str1.charAt(index) + " comes before " + str2.charAt(index) + "."); // print to easily see comparisons
			return -1;
		}
		/**
		 * Checks whether charAt(index) of str2 comes before (is less than) charAt(index) of str1; if true, return 1
		 * returns 1 for str2 comes before str1
		 */
		if(str1.toLowerCase().charAt(index) > str2.toLowerCase().charAt(index)) {
			System.out.println(str2.charAt(index) + " comes before " + str1.charAt(index) + "."); // print to easily see comparisons
			return 1;
		}
		return 0; // default return statment in order for method to run properly; however, default return will never be returned.
	} // end compare()




	/**	This indirect recursive method takes in two integers that will be multiplied in a similar fashion as
	 *		elementary grid multiplication. The recursive steps depend on the values plugged into multiply().
	 *		Therefore, if both values plugged in are single digits, recursion will not occur. If one or both values
	 *		are not single digit integers, recursion will occur.
	 *
	 * @requires parameters(x > 0, y > 0)
	 * @ensures each associate returns its correct value from whomever called it
	 * 			e.g. multiply(x > 10, y > 10) calls multiply(x > 10, y < 10) calls multiply(x < 10, y < 10) calls
	 * 				  multiplySingle(x < 10, y < 10).
	 * 				  multiplySingle() returns to multiply() returns to multiply() returns to multiply().
	 * 			returns must multiply and add associates returns correctly.
	 */
	public int multiply(int x, int y) {
		// will call on multiplySingle() to assist with indirect recursion only when x and y are single digits.
		if(x < 10 && y < 10) {
			return multiplySingle(x, y); // passing in single-digits x and y.
		}
		// true if x == single digit, y must be > 10.
		if(x < 10) {
			// multiply() will call itself, passing in new digits for its associates until their values, x and y, are a single digits
			return (multiply(x, y/10) * 10) + (multiply(x, y%10));
		}
		// true if y == single digit, x must be > 10.
		if(y < 10) {
			// multiply() will call itself, passing in new digits for its associates until their values, x and y, are a single digits
			return (multiply(x/10, y) * 10) + (multiply(x%10, y));
		}
		// statement runs when previous if statements are not true
		// multiply() will call itself, passing in new digits for its associates until their values, x and y, are a single digits
		return (multiply(x, y/10) * 10) + (multiply(x, y%10));
	} // end multiply()
	
	
	/**	This recursive method will, in a way, multiply an integer x by a value y in the range of 0 - 10.
	 *		This method will execute when both x and y in multiply() are single digits.
	 *		Recursion occurs with multiplySingle() calling itself and adding x to itself y-1.
	 *		multiplySingle() will return its answer to whomever called it from multiply().
	 * @requires parameters(x < 10, y < 10)
	 * @ensures if(x == 0 || y == 0) return 0;
	 *				else return sum of x's
	 */
	public int multiplySingle(int x, int y) {
		// immediate quit case, when either x == 0 || y == 0, meaning multiplying by 0 results in 0.
		if(x == 0 || y == 0) {
			return 0;
		}
		return x + multiplySingle(x, y-1); // multiplySingle() will continue to call itself, adding x to x, until y == 0 via y-1.
	} // end multiplySingle()
	
} // end class Recursion
