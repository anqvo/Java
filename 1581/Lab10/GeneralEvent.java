public class GeneralEvent implements Event {
	protected String name;
	private String location;
	private String date;
	
	public Event(String name, String location, String date) {
		this.name = name;
		this.location = location;
		this.date = date;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getLocation() {
		return this.location;
	}
	
	public String getDate() {
		return this.date;
	}
	
	public String toString() {
		String representation = "The name is: " + this.getName() + " " + "The event location is: " + this.getLocation() + " " + "The date is: " + this.getDate() + " " + "You should bring your own drinks: " + this.getByob() + ".";
		return representation;
	}
}
