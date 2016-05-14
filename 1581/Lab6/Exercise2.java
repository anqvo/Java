import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] binaries = {"0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "Goodbye."};

		int decimalNumber = -1;
		do {
			System.out.print("Enter an integer between 0 and 7 or enter 8 to quit: ");
			decimalNumber = scan.nextInt();
			System.out.println(binaries[decimalNumber]);				
		} while (decimalNumber != 8);

	}

}
