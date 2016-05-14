public class Event {
	protected String eventName;
	private String eventLocation;
	private String eventDate;
	
	public Event(String name, String location, String date) {
		this.eventName = name;
		this.eventLocation = location;
		this.eventDate = date;
	}
	
	public String getName() {
		return this.eventName;
	}
	
	public String getLocation() {
		return this.eventLocation;
	}
	
	public String getDate() {
		return this.eventDate;
	}
	
	public String toString() {
		String representation = "The name is: " + this.getName() + " " + "The event location is: " + this.getLocation() + " " + "The date is: " + this.getDate() + " " + "You should bring your own drinks: " + this.getByob() + ".";
		return representation;
	}
}
