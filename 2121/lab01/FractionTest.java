/**
* An Vo
* CSCI 2121-001
* 03 February 2015
* Junit FractionTest HW Assignment
**/

/**
* Dr. Summa's Junit Testing example from the lecture assisted me with this HW assignment.
* Included are Test and Runner classes rather than just Test.
* Instead of "import junit.framework.TestCase"
* Compiling and Running the Junit tests are also different from lab.
**/

import static org.junit.Assert.*;
import org.junit.Test;

// Does not extend TestCase due to different imports
public class FractionTest {
	
	private Fraction fraction1 = new Fraction(1,2); 
	private Fraction fraction2 = new Fraction(2,3);
	
	private Fraction fraction3 = new Fraction(3,4);
	private Fraction fraction4 = new Fraction(4,5);
	
	
	/**
	* First assertEquals tests if fraction1 and fraction2 are correctly summed.
	* Second assertEquals tests what is expected when fraction2 and fraction2 are incorrectly summed.
	**/
	@Test
	public void addTest() {
		Fraction sum = fraction1.addFraction(fraction2);
		String sumString = sum.toString();
		String sumStringTest = "7/6";
		System.out.println("@Test addFraction(): " + sumString + " = " + sumStringTest);
		assertEquals(sumString, sumStringTest);
		
		Fraction sum1 = fraction2.addFraction(fraction2);
		String sumString1 = sum1.toString();
		String sumStringTest1 = "11/9";
		System.out.println("@Test addFraction(): " + sumString1 + " = " + sumStringTest1);
		assertEquals(sumString1, sumStringTest1);
	} // end addTest

	/**
	* First assertEquals tests if fraction2 and fraction2 are correctly subtracted.
	* Second assertEquals tests what is expected when fraction2 and fraction1 are incorrectly subtracted.
	**/
	@Test
	public void subtractTest() {
		Fraction difference = fraction2.subtractFraction(fraction2);
		String subString = difference.toString();
		String subStringTest = "0/9";
		System.out.println("@Test subtractFraction(): " + subString + " = " + subStringTest);
		assertEquals(subString, subStringTest);
		
		Fraction difference1 = fraction2.subtractFraction(fraction1);
		String subString1 = difference1.toString();
		String subStringTest1 = "0/6";
		System.out.println("@Test subtractFraction(): " + subString1 + " = " + subStringTest1);
		assertEquals(subString1, subStringTest1);
	} // end subtractTest

	/**
	* First assertEquals tests if fraction3 and fraction3 are correctly multiplied.
	* Second assertEquals tests what is expected when fraction3 and fraction4 are incorrectly multiplied.
	**/
	@Test
	public void multiplyTest() {
		Fraction multiply = fraction3.multiplyFraction(fraction3);
		String prodString = multiply.toString();
		String prodStringTest = "9/16";
		System.out.println("@Test multiplyFraction(): " + prodString + " = " + prodStringTest);
		assertEquals(prodString, prodStringTest);
		
		Fraction multiply1 = fraction3.multiplyFraction(fraction4);
		String prodString1 = multiply1.toString();
		String prodStringTest1 = "11/20";
		System.out.println("@Test multiplyFraction(): " + prodString1 + " = " + prodStringTest1);
		assertEquals(prodString1, prodStringTest1);
	} // end multiplyTest

	/**
	* First assertEquals tests if fraction4 and fraction4 are correctly divided.
	* Second assertEquals tests what is expected when fraction4 and fraction3 are incorrectly divided.
	**/
	@Test
	public void divideTest() {
		Fraction divide = fraction4.divideFraction(fraction4);
		String quoString = divide.toString();
		String quoStringTest = "20/20";
		System.out.println("@Test divideFraction(): " + quoString + " = " + quoStringTest);
		assertEquals(quoString, quoStringTest);
		
		Fraction divide1 = fraction4.divideFraction(fraction3);
		String quoString1 = divide1.toString();
		String quoStringTest1 = "14/15";
		System.out.println("@Test divideFraction(): " + quoString1 + " = " + quoStringTest1);
		assertEquals(quoString1, quoStringTest1);
	} // end divideTest
	
} // end FractionTest
