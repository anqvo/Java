import java.io.*; // added in lab
import java.util.ArrayList;

public class CalendarVersionThree
{

    public static void main( String[] args )
    {
		  /**
		  * changed in lab
		  **/
		  BufferedReader reader = null; // changed in lab
		  ArrayList<Event> events = new ArrayList<Event>();
		  
        /**
        * changed in lab
        **/
        try {
        	reader = new BufferedReader(new FileReader("myFile.txt"));
        }
        catch(IOException e) {
        	e.printStackTrace();
        }
        
        /**
        * added in lab
        **/
        String name = "";
        String date = "";
        String location = "";
        String description = "";
        Event event = null;
        
        try {
        	while(reader.ready()) {
        		name = reader.readLine();
        		date = reader.readLine();
        		location = reader.readLine();
        		description = reader.readLine();
        		event = new Event(name, date, location, description);
        		events.add(event);
        		reader.readLine();
        	}
        }
        catch(IOException e) {
        	e.printStackTrace();
        }
        try {
        	reader.close();
        }
        catch(IOException e) {
        	e.printStackTrace();
        }

		  
        for(int i = i < events.size(); i++) {
        	System.out.println(events.get(i).toString());
        }
        
    }


}
