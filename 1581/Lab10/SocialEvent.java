public class SocialEvent extends Event {
	private boolean byob;
	
	public SocialEvent(String name, String location, String date) {
		super(name, location, date);
		this.byob = true;
	}
	
	public void changeByob() {
		if(this.byob)
			this.byob = false;
		else
			this.byob = true;
	}
	
	public boolean getByoB() {
		return this.byob;
	}
	
	//@Override
	public String toString() {
		String representation = "The name is: " + this.getName() + " " + "The event location is: " + this.getLocation() + " " + "The date is: " + this.getDate() + " " + "You should bring your own drinks: " + this.getByob() + ".";
		return representation;
	}
}
