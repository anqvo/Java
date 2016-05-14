import java.util.Scanner;

public class EventRunner {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter an event name: ");
		String name = scan.next();
		System.out.print("Please enter the location of the event: ");
		String location = scan.next();
		System.out.print("Please enter the date of the event: ");
		String date = scan.next();
		System.out.print("Please enter a course name: ");
		String course = scan.next();
		
		SchoolEvent event = new SchoolEvent(name, location, date, course);
		System.out.println(event.getName() + " " + event.getLocation() + " " + event.getDate() + " " + event.getCourseName());
	}
}
