import java.util.ArrayList;


public class Country
{

    private String name;
    private String occupant;
    private int numOfArmies;
    private ArrayList<Country> adjacencies;

    public Country( String name )
    {
        this.name = name;
        this.occupant = null;
        this.numOfArmies = 0;
        this.adjacencies = null;
    }

    public void setOccupant( String playerName )
    {
        this.occupant = playerName;
    }

    public void setNumArmies( int number )
    {
        this.numOfArmies = number;
    }

    public void addAdjacencies( ArrayList<Country> adjacencies )
    {
        this.adjacencies = adjacencies;
    }

    public String getName()
    {
        return this.name;
    }

    public String getOccupant()
    {
        return this.occupant;
    }

    public int getNumArmies()
    {
        return this.numOfArmies;
    }

    public ArrayList<Country> getAdjacencies()
    {
        // This may need to be changed to use the collections
        // constructor of ArrayList for type compatibility
        return new ArrayList<Country>( this.adjacencies ); 
    }
}
