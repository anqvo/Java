import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[] array1 = new int[3];
		int[] array2 = new int[3];

		for(int i = 0; i < array1.length; i++) {
			int holder1;
			System.out.print("Enter a number for the first array: ");
			holder1 = scan.nextInt();
			array1[i] = holder1;
		}
		for(int i = 0; i < array2.length; i++) {
			int holder2;
			System.out.print("Enter a number for the second array: ");
			holder2 = scan.nextInt();
			array2[i] = holder2;
		}

		int result = Exercise3.dotProduct(array1, array2);
		System.out.println("The resulting dot product is " + result + ".");

	}

	public static int dotProduct(int[] array1, int[] array2) {

		int sum = 0;

		for(int i = 0; i < array1.length; i++) {
			sum += array1[i]*array2[i];
		}
		return sum;

	}

}
