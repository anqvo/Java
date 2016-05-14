public class EventRunner1 {
	public static void main(String[] args) {
		Event[] array = new Event[2];
		String name = "Java I";
		String location = "Math Building";
		String date = "Weekdays";
		String cName = "001";
		SchoolEvent schoolEvent = new SchoolEvent(name, location, date, cName);
		name = "Party";
		location = "Quarter";
		date = "Weekends";
		SocialEvent socialEvent = new SocialEvent(name, location, date);
		socialEvent.changeByob();
		array[0] = schoolEvent;
		array[1] = socialEvent;
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i].toString());
		}
	}
}
