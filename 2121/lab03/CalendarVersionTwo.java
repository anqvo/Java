import java.io.*; // added in lab
import java.lang.ClassNotFoundException; // added in lab

public class CalendarVersionTwo
{

    public static void main( String[] args )
    {

		  ObjectInputStream objectInput = null; // changed in lab
        Event party = null;
        Event test = null;
        
        /**
        * changed in lab
        **/
        try {
        	objectInput = new ObjectInputStream(new FileInputStream("myFile.ser"));
        }
        catch(IOException e) {
        	e.printStackTrace();
        }
        try {
        	party = (Event)objectInput.readObject();
        	test = (Event)objectInput.readObject();
        }
        catch(IOException e) {
        	e.printStackTrace();
        }
        catch(ClassNotFoundException e) {
        	System.out.println("Class not found.");
        }
        try {
        	objectInput.close();
        }
        catch(IOException e) {
        	e.printStackTrace();
        }

		  
        System.out.println( party.getName() );
        System.out.println( party.getDate() );
        System.out.println( party.getLocation() );
        System.out.println( party.getDescription() );
        
    }


}
