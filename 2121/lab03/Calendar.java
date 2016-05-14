import java.io.*; // added in lab

public class Calendar
{

    public static void main( String[] args )
    {

		  ObjectOutputStream objectOutput = null; // added in lab
        Event party = new Event( "Redmann's Party", "2014-03-03 22:00", "Redmann's House", "Come pass a good time" );

        Event test = new Event( "CSCI 2120 Test", "2014-03-24 16:30", "MATH 226", "2nd Test" );
        
        /**
        * added in lab
        **/
        try {
        	objectOutput = new ObjectOutputStream(new FileOutputStream("myFile.ser"));
        }
        catch(IOException e) {
        	e.printStackTrace();
        }
        try {
        	objectOutput.writeObject(party);
        	objectOutput.writeObject(test);
        }
        catch(IOException e) {
        	e.printStackTrace();
        }
        try {
        	objectOutput.close();
        }
        catch(IOException e) {
        	e.printStackTrace();
        }

		  /**
		  * not needed now
        System.out.println( party.getName() );
        System.out.println( party.getDate() );
        System.out.println( party.getLocation() );
        System.out.println( party.getDescription() );
        **/
    }


}
