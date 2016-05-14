import java.util.Random;

public class Exercise1 {

	public static void main(String[] args) {
		int[] numberArray = new int[10];
		Random assigner = new Random();

		for(int i = 0; i < numberArray.length; i++) {
			numberArray[i] = assigner.nextInt();
		}
		for(int i = 0; i < numberArray.length; i++) {
			System.out.println(numberArray[i]);
		}

	}

}
