/**

 * An Vo

 * CSCI 1583 (Fall 2014)

 * Homework 5

 * 24 October 2014

 **/


import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.InterruptedException;

public class Homework5 { //declaring the class

	public static void main(String[] args) {
		File myFile = new File("GameOfLife.txt"); //constructing a new object File with the file name as parameter
		Scanner scan = null;
			try {
				scan = new Scanner(myFile);
			}
			catch(FileNotFoundException e) {
				e.printStackTrace();
			}

		int row = scan.nextInt(); //scan from the file the number of rows
		int column = scan.nextInt(); //scan from the file the number of columns

		int[][] grid = createGrid(row, column); //calls for createGrid method
		int[][] newGrid = createGrid(row, column); //calls for createGrid method

		readGrid(grid, scan); //calls for readGrid method
		System.out.println("===============================GENERATION 1===============================");
		printGrid(grid);
		runGame(grid, newGrid);
	} //end method main

	//this method creates a 2D array of integers and returns the 2D array grid
	public static int[][] createGrid(int row, int column) {
		int[][] grid = new int[row][column];
		return grid;
	} //end method createGrid

	//this method has a nested for loop to read each value from the file and places it into the certain points on the 2D array of integers grid
	public static void readGrid(int[][] grid, Scanner scan) {
		for(int i = 0; i < grid.length; i++) {
			for(int j = 0; j < grid[i].length; j++) {
				grid[i][j] = scan.nextInt();
			}
		}
	} //end method readGrid

	//this method has a nested for loop to print the 2D array grid
	public static void printGrid(int[][] grid) {
		for(int i = 0; i < grid.length; i++) {
			for(int j = 0; j < grid[i].length; j++) {	
				if(grid[i][j] == 0) {
					System.out.print(" - ");
				}
				if(grid[i][j] == 1) {
					System.out.print(" # ");
				}
			}
			System.out.println();
		}
		try {	//this is a timer to delay the printing of the grid to half a second each
			Thread.sleep(500);
		}
		catch(InterruptedException e) {
		}
	} //end method printGrid

	//this method returns the number of neighbors alive from each cell on the grid
	public static int neighborsAlive(int[][] grid, int i, int j) {
		int upside = i - 1;
		if(upside < 0) {
			upside = grid.length - 1;
		}
		int downside = i + 1;
		if(downside >= grid.length) {
			downside = 0;
		}
		int leftside = j - 1;
		if(leftside < 0) {
			leftside = grid[i].length - 1;
		}
		int rightside = j + 1;
		if(rightside >= grid[i].length) {
			rightside = 0;
		}

		int upleft = grid[upside][leftside];
		int up = grid[upside][j];
		int upright = grid[upside][rightside];
		int left = grid[i][leftside];
		int right = grid[i][rightside];
		int downleft = grid[downside][leftside];
		int down = grid[downside][j];
		int downright = grid[downside][rightside];

		int alive = upleft + up + upright + left + right + downleft + down + downright;
		return alive;
	} //end method neighborsAlive

	//this method tests each cell for the rules to the game whether or not it should live or die in the next generation
	public static int applyRules(int currentState, int neighbors) {
		int cell = -1;
		if(currentState == 1) {
			if(neighbors < 2) {
				cell = 0;
			}
			if(neighbors == 2 || neighbors == 3) {
				cell = 1;
			}
			if(neighbors > 3) {
				cell = 0;
			}
		}
		else {
			if(neighbors == 3) {
				cell = 1;
			}
			else
				cell = 0;
		}
		return cell;
	} //end method applyRules

	//this method has a nested for loop that "runs the game" when taking into account the number of alive neighbors, the rules, etc and prints each generation
	public static void runGame(int[][] grid, int[][] newGrid) { 
		for(int loop = 2; loop < 31; loop++) {
			System.out.println("\033[H\033[2J"); //gives the impression that the new grid is printed over the previous grid
			System.out.println("===============================GENERATION " + loop + "===============================");
			for(int i = 0; i < grid.length; i++) {
				for(int j = 0; j < grid[i].length; j++) {
					int neighbors = neighborsAlive(grid, i, j);
					int newState = applyRules(grid[i][j], neighbors);
					newGrid[i][j] = newState;
				}
			}
			printGrid(newGrid);
			int[][] temp = grid;		
			grid = newGrid;
			newGrid = temp;
		}
	} //end method runGame

} //end class GameOfLife
