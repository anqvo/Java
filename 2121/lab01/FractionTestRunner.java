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

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
* Prints if tests were successful.
* If not successful, prints what was expected from what was resulted.
**/
public class FractionTestRunner {
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(FractionTest.class);
       for (Failure fail : result.getFailures()) {
          System.out.println(fail.toString());
       }
       if (result.wasSuccessful()) {
          System.out.println("All tests finished successfully...");
       }
	} // end main
	
} // end FractionTestRunner
