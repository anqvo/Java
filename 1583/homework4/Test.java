import java.util.Scanner;

	public class Test {
    public static final Scanner scan = new Scanner(System.in); 

   public static void main (String[] args) { 
      System.out.println("Enter grades."); 
		float[] array = Test.hwInput();
      for(int i = 0; i < array.length; i++)
			System.out.println(array[i]); 

	}

	public static float[] hwInput() {

		System.out.print("Enter the amount: ");
		int number = scan.nextInt();
		float[] arrayHWGrades = new float[number];

		System.out.println("Enter all Homework Grades below.");

		for (int i = 0; i < arrayHWGrades.length; i++)
			arrayHWGrades[i] = scan.nextFloat();
			

		return arrayHWGrades;

	}

}
