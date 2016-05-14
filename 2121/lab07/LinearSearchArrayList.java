import java.util.*;
import java.io.*;
import java.lang.ClassNotFoundException;

public class LinearSearchArrayList {
	public static void main(String[] args) {
		ObjectInputStream input = null;
		ArrayList<Integer> list = null;
		Scanner scan = new Scanner(System.in);
		
		try {
			input = new ObjectInputStream(new FileInputStream("data.ser"));
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		try {
			list = (ArrayList<Integer>)input.readObject();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		catch(ClassNotFoundException e) {
			System.out.println("ArrayList not found.");
		}
		
		System.out.print("What value would you like to search for? ");
		int value = scan.nextInt();
		boolean isFound = false;
		
		for(int element : list) {
			if(list.get(element) == value) {
				System.out.println("That value was at " + element + " in the list.");
				isFound = true;
				break;
			}
			if(!isFound) {
				System.out.println("The element isn't in the list.");
			}
		}
	}
}
