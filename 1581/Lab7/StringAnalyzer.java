import java.util.Scanner;

public class StringAnalyzer {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String stringOne = " ";
		String stringTwo = " ";

		int checker = 0;
		System.out.println("Please enter any number except -1 to use program. Enter -1 to quit.");

		while((checker = scan.nextInt()) != -1) {
			System.out.print("Please enter a word: ");
			stringOne = scan.next();

			System.out.print("Please enter another word: ");
			stringTwo = scan.next();

			System.out.println("");
			
			if(stringOne.equals(stringTwo))
				System.out.println("The words are identical.");
			else
				System.out.println("The words are not identical.");

			System.out.println("");

			if(stringOne.compareTo(stringTwo) < 0)
				System.out.println(stringOne + " comes before " + stringTwo);
			else if(stringOne.compareTo(stringTwo) > 0)
				System.out.println(stringOne + " comes after " + stringTwo);
			else
				System.out.println("Neither word comes before or after each other in the alphabet.");

			System.out.println("");

			int stringOneLength = stringOne.length();
			int stringTwoLength = stringTwo.length();
			System.out.println(stringOne + " is " + stringOneLength + " characters long.");
			System.out.println(stringTwo + " is " + stringTwoLength + " characters long.");

			System.out.println("");

			System.out.println("Enter -1 to quit. Enter another number to use program.");

		} if(checker == -1)
			System.out.println("Thanks and goodbye.");

	}


}
