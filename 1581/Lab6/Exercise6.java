import java.util.Scanner;
import java.util.ArrayList;

public class Exercise6 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		ArrayList<String> studentRoll = new ArrayList<String>();
		int choice = 0;

		do {
			Exercise6.printMenu();
			choice = scan.nextInt();

			switch (choice) {
				case 1:
					System.out.print("Enter the student's surname: ");
					String name = scan.next();
					studentRoll.add(name);
					break;

				case 2:
					System.out.print("Enter the surname of a student to remove : ");
					String name = scan.next();
					for(int i = 0; i < studentRoll.size();i++)
						if(studentRoll.get(i).equals(name))
							studentRoll.remove(i);
							System.out.println(name + " has been removed.");
						else
							System.out.println("The student is not listed.");
					break;

				case 3:
					System.out.println("Enter a surname to check student enrollment.");
					String name = scan.next();
					for(int i = 0; i < studentRoll.size(); i++)
						if(studentRoll.get(i).equals(name))
							System.out.println("Yes!");
						else
							System.out.println("Nope!");
					break;

				case 4:
					System.out.println("These following students are enrolled:");
					for(int = 0; i < studentRoll.size(); i++)
						System.out.println(studentRoll.get(i));
					break;

				case 5:
					for(int = 0; i < studentRoll.size(); i++)
						System.out.println("There are " + studentRoll.size() + " students enrolled.");
					break;

				case 6:
					System.out.println("Thanks and goodbye.");
					break;
			}

		} while (choice != 6);

	}

	public static void printMenu() {

			System.out.println("1) Add a student");
			System.out.println("2) Remove a student");
			System.out.println("3) Check enrollment of a student");
			System.out.println("4) Print the roster");
			System.out.println("5) Get the number of enrolled students");
			System.out.println("6) Quit");
			System.out.print("Choose from the menu above: ");

	}

}
