/**
 *	This class was provided by Dr. Summa to help write a GUI-based Conway's "Game of Life."
 *
 *	Assignment: Game of Life GUI
 *	Class: Cell.java
 * Author: An Vo
 * Date: 03/24/15
 **/




import java.io.Serializable;


/**
 *	For GameOfLife100x100 to be serialized, class Cell must implement Serializable.
 **/
public class Cell implements Serializable {

    private boolean isAlive;

    public Cell() {
        this.isAlive = false;
    }

    // public query method to ask cell if it is alive
    public boolean isAlive() {
        return this.isAlive;
    }

    public void setAlive(boolean val) {
        this.isAlive = val;
    }
    
    public String toString() {
        String returnVal = "-";
        if (isAlive)
           returnVal = "O"; 
        return returnVal;
    }

    public boolean equals(Object o) {
        boolean returnVal = false;
        if (o instanceof Cell)
            returnVal = (this.isAlive == ((Cell)o).isAlive());
        return returnVal;
    }
}
