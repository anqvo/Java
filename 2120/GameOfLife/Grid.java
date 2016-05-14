/**
 *	This class was provided by Dr. Summa to help write a GUI-based Conway's "Game of Life."
 *	Two methods have been included by @author: An Vo : clearScreen() and getCell().
 *
 *	Assignment: Game of Life GUI
 *	Class: Grid.java
 * Author: An Vo
 * Date: 03/24/15
 **/




import java.io.Serializable;


/**
 *	For GameOfLife100x100 to be serialized, class Grid must implement Serializable.
 **/
public class Grid implements Serializable {

    private Cell[][] itsCurrentState;
    private Cell[][] itsNextState;

    // construct a grid of cells
    public Grid(int numRows, int numColumns) {
        itsCurrentState = new Cell[numRows][numColumns];
        itsNextState = new Cell[numRows][numColumns];
        for (int row=0; row< itsCurrentState.length; row++) {
            for (int column=0; column < itsCurrentState[row].length; column++) {
                itsCurrentState[row][column] = new Cell();
                itsNextState[row][column] = new Cell();
            }
        }
    }








/**
 *	These two methods have been added by @author: An Vo
 * clearScreen() simply clears the screen by setting all cells to false (dead)
 *	getCell() returns currentCell at specific indexes
 **/
	public void clearScreen() {
		for(int row = 0; row < itsCurrentState.length; row++) {
			for(int col = 0; col < itsCurrentState[row].length; col++) {
				itsCurrentState[row][col].setAlive(false);
			}
		}
	}

	public Cell getCell(int row, int column) {
		return itsCurrentState[row][column];
	}







	
    public boolean cellIsAlive(int x, int y) {
        return itsCurrentState[x][y].isAlive();
    }

    public void update() {
        // loop over rows
        for (int row=0; row < itsCurrentState.length; row++) {
            // loop over columns
            for (int column=0; column < itsCurrentState[row].length; column++) {
                boolean isAliveNextRound = aliveNextRound(row,column);
                itsNextState[row][column].setAlive(isAliveNextRound);
            }
        }
        swapStates();
    }

    private boolean aliveNextRound(int row, int column) {
        boolean aliveNextRound = false;;
        boolean currentAliveState = itsCurrentState[row][column].isAlive();
        int liveNeighbors = getCountOfLiveNeighbors(row,column);
        if (currentAliveState == true && liveNeighbors <2)
            aliveNextRound = false;
        else if ( currentAliveState == true && (liveNeighbors == 2 || liveNeighbors == 3) )
            aliveNextRound = true;
        else if ( currentAliveState == true && liveNeighbors > 3)
            aliveNextRound = false;
        else if ( currentAliveState == false && liveNeighbors == 3)
            aliveNextRound = true;
        return aliveNextRound;
    }

    private int getCountOfLiveNeighbors(int row, int column) {
        int numLiveNeighbors = 0;
        // check general case first - here we know we don't need
        // to check boundary conditions explicitly
        if (row != 0 && row != itsCurrentState.length - 1 &&
            column != 0 && column != itsCurrentState.length - 1) {

            for (int rowMod = -1; rowMod < 2; rowMod++) {
                for (int colMod = -1; colMod <2; colMod++) {
                    if ( itsCurrentState[row+rowMod][column+colMod].isAlive() &&
                         !(rowMod == 0 && colMod ==0) ) // don't count myself
                        numLiveNeighbors++;
                }
            }

        } // end of general case calculation
        else {  // now deal with edge cases
            int up = row-1;
            int down = row+1;
            int right = column+1;
            int left = column-1;
            if (row == 0) { // top edge case
                up = itsCurrentState.length-1;
            } else if (row == itsCurrentState.length-1) { // bottom edge case
                down = 0;
            }

            if (column == 0) { // left edge case
                left = itsCurrentState[0].length-1;
            } else if (column == itsCurrentState[0].length-1) { // right edge case
                right = 0;
            }

            int[][] neighborsToConsider = { {up,left},   {up,column}, {up,right},
                                            {row,left},               {row,right},
                                            {down,left},{down,column},{down,right} };

            for (int neighborIndex = 0; neighborIndex < neighborsToConsider.length; neighborIndex++) {
                if (itsCurrentState[neighborsToConsider[neighborIndex][0]][neighborsToConsider[neighborIndex][1]].isAlive())
                    numLiveNeighbors++;
            }

        } // end of edge cases clause
        return numLiveNeighbors;
    }

    // this swaps current and next references
    private void swapStates() {
        Cell[][] temp = itsCurrentState;
        itsCurrentState = itsNextState;
        itsNextState = temp;
    }
    
    // @Override
    public String toString() {
        String returnVal = "";
        for (int i=0; i<itsCurrentState.length; i++) {
            for (int j=0; j<itsCurrentState[i].length; j++) {
                returnVal += itsCurrentState[i][j];
                returnVal += " ";
            }
            returnVal += "\n";
        }
        return returnVal;
    }

    public void gliderSetup() {
        itsCurrentState[5][5].setAlive(true);
        itsCurrentState[6][5].setAlive(true);
        itsCurrentState[7][5].setAlive(true);
        itsCurrentState[7][4].setAlive(true);
        itsCurrentState[6][3].setAlive(true);
    }
}
