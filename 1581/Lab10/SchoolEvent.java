public class SchoolEvent extends Event { //subclass that inherits class Event
	private String courseName;
	
	public SchoolEvent(String name, String location, String date, String courseName) {
		super(name, location, date); //gets constructor of Event
		this.courseName = courseName;
	}
	
	public String getCourseName() {
		return this.courseName;
	}
}
