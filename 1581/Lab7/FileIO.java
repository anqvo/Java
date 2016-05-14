import java.util.Scanner;
import java.io.File;
import java.util.Formatter;
import java.io.FileNotFoundException;

public class FileIO {
	public static void main(String[] args) {

		File myFile = new File("declaration.txt");
		Scanner scan = null;
			try {
				scan = new Scanner(myFile);
			}
			catch(FileNotFoundException e) {
				e.printStackTrace();
			}
		String firstLine = scan.nextLine();
		Formatter myFormatter = null;
			try {
				myFormatter = new Formatter("sentence.txt");
			}
			catch(FileNotFoundException e) {
				e.printStackTrace();
			}

		myFormatter.format("%s", firstLine);

		myFormatter.flush();
		myFormatter.close();
		scan.close();


	}
}
