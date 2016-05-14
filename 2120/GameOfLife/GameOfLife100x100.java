/**
 *	This class uses information taken from the TUI-based implementation of Conway's "Game of Life" which was provided by Dr. Summa for CSCI 2120 assignment.
 *
 *	Assignment: Game of Life GUI
 *	Class: GameOfLife100x100.java
 * Author: An Vo
 * Date: 03/24/15
 **/




/**
 *	JFrame, JPanel, BorderLayout, Graphics, and Color are used to create the Game of Life program window layout:
 *		- creates the grid
 *		- colors the background
 *		- colors the cell blocks (alive and dead)
 **/
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Color;

/**
 *	MouseAdapter and MouseEvent are used to allow User to perform input actions using the mouse:
 *		- mouseClicked(MouseEvent e) 
 *		- mouseDragged(MouseEvent e) 
 **/
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *	Timer, ActionListener, and ActionEvent are used to delay the time it takes for a generation to occur.
 **/
import javax.swing.Timer;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 *	KeyAdapter and KeyEvent are used to allow User to perform input actions using the keyboard:
 *		- keyTyped(KeyEvent e)
 **/
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 *	ObjectOutputStream, ObjectInputStream, FileOutputStream, FileInputStream, IOException, and ClassNotFoundException are used to take the Grid object, write it to file, and load it to file.
 *		- Saves the state of the current state of the Grid object to a file in same directory using an object of type ObjectOutputStream to call method writeObject(Filename).
 *		- Loads the most recent saved state of the Grid object by reading from the file using an object of type ObjectInputStream to call method readObject().
 **/
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.ClassNotFoundException;




/**
 *	class GameOfLife100x100 extends JPanel to allow the class to draw squares into it.
 **/
public class GameOfLife100x100 extends JPanel {

	//	private instance variables
	private Grid grid;
	private MouseListener mouse;
	private TimerListener timerListener;
	private Timer timer;
	private KeyAdapter keyboardListener;
	
	private ObjectOutputStream output;
	private ObjectInputStream input;




	/**
	 *	class constructor method GameOfLife100x100()
	 *
	 *	@requires:	- this.grid == 100 x 100 dimensions;
	 *					- window == setVisible(true);
	 *					- MouseListener for mouseClicked(); && MouseMotionListener for mouseDragged();
	 *					- KeyboardListener for keyTyped();
	 *	@ensures:	- window is visible, grid is colored
	 *					- timer delays specified milliseconds
	 **/
	public GameOfLife100x100() {
	
		this.grid = new Grid(100, 100);
		JFrame window = new JFrame("GameOfLife100x100");
		window.setSize(1015, 738);																		// setSize(1015, 738) fitted for the window/grid
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);								// closing program will fully exit
		window.setLayout(new BorderLayout());
		window.add(this, BorderLayout.CENTER);
		window.setBackground(Color.WHITE);

		addMouseListener(this.mouse = new MouseListener());
		addMouseMotionListener(this.mouse = new MouseListener());

		this.timerListener = new TimerListener();
		this.timer = new Timer(30, timerListener);

		this.keyboardListener = new KeyboardListener();
		window.addKeyListener(this.keyboardListener);

	}	// end constructor method GameOfLife100x100()




	/**
	 *	This method is overridden from JComponent which is a superclass of JPanel.
	 *	The method "paints" the window using a double for loop.
	 *
	 *	@requires:	- super() to assure no errors in painting
	 *					- r < grid.length(); && c < grid.length();
	 *	@ensures:	- each rectangle is fully 10 x 10; cellIsAlive() == DARK_GRAY (alive) and LIGHT_GRAY (dead) as 8 x 8 excluding WHITE borders as 2 x 2
	 *					- (8 x 8) + (2 x 2) = 10 x 10 rectangle
	 **/
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		for(int row = 0;row < 100;row++) {															// cycle through each cell, draws and colors the cell according to state of cell
			for(int column = 0;column < 100;column++) {
				if(grid.cellIsAlive(row, column)) {
					g.setColor(Color.DARK_GRAY);
					g.fillRect(row*10, column*10, 8, 8);
				//	g.drawRect(row*10, column*10, 8, 8);											// does not affect the code if enabled/disabled
				}
				else {
					g.setColor(Color.LIGHT_GRAY);
					g.fillRect(row*10, column*10, 8, 8);
				//	g.drawRect(row*10, column*10, 8, 8);											// does not affect the code if enabled/disabled
				}
			}	// end inner for loop
		}	// end outer for loop
		
	}	// end overridden method paintComponent()



	
	/**
	 *	private inner class MouseListener listens for input from User via MouseEvent()
	 **/
	private class MouseListener extends MouseAdapter {
	
		/**
		 *	This method listens for clicks from the mouse by User and repaint() the grid accordingly.
		 *	
		 *	@requires:		- e.getX()/10 && e.getY()/10 sets Cell to window pixels (10 pixels per cell)
		 *	@ensures:		- ifCellDead() and mouseClicked() then setCellAlive();
		 *						- ifCellAlive() and mouseClicked() then setCellDead();
		 */
		@Override
		public void mouseClicked(MouseEvent e) {
		
			int x = e.getX()/10;
			int y = e.getY()/10;
			
			if(grid.cellIsAlive(x, y)) {
				grid.getCell(x, y).setAlive(false);
				repaint();
			}
			else {
				grid.getCell(x, y).setAlive(true);
				repaint();
			}
		}	// end method mouseClicked()
		
		/**
		 *	This method listens for click/drag events from the mouse by User and repaint() the grid accordingly.
		 *
		 *	@requires:		- e.getX()/10 && e.getY()/10 sets Cell to window pixels (10 pixels per cell)
		 *						- e.getX() && e.getY() not outside edges of window/grid
		 *						- 		getX() > 0 but < 1000 && getY() > 0 but < 720;
		 *	@ensures:		- ifCellDead() and mouseDragged() then setCellAlive();
		 *						- ifCellAlive() and mouseDragged() then setCellDead();
		 */
		@Override
		public void mouseDragged(MouseEvent e) {
		
			int x = e.getX()/10;
			int y = e.getY()/10;
			
			if(e.getX() > 0 && e.getX() < 1000 && e.getY() > 0 && e.getY() < 720) {		// allows dragging and mouse exits window component without causing errors in terminal
				if(grid.cellIsAlive(x, y)) {
					grid.getCell(x, y).setAlive(false);
					repaint();
				}
				else {
					grid.getCell(x, y).setAlive(true);
					repaint();
				}
			}
		}	// end method mouseDragged()
		
	} // end private inner class MouseListener



	
	/**
	 *	private inner class TimerListener implements ActionListener which listens for actionPerformed()
	 *		- if timer start(), update() grid and repaint() window;
	 **/
	private class TimerListener implements ActionListener {
	
		public void actionPerformed(ActionEvent e) {
			//grid.gliderSetup();																		// gliderSetup() disabled but can be reenabled if preferred by User
			grid.update();
			repaint();
		}	// end method actionPerformed()
		
	}	// end private inner class TimerListener



	
	/**
	 *	private inner class KeyboardListener extends KeyAdapter which listens for keyTyped()
	 **/
	private class KeyboardListener extends KeyAdapter {
	
		/**
		 *	This method listens for KeyEvent actions from the keyboard by User and responds accordingly.
		 *
		 *	@requires:		- file must be saved 's' before loaded 'l'
		 **/
		public void keyTyped(KeyEvent e) {
		
			char keyPress = e.getKeyChar();


			if(keyPress == 'b') {																	// if 'b' then begin simulation
				timer.start();
			}
			if(keyPress == 'c') {																	// if 'c' then pause simulation (added for convenience)
			 	timer.stop();
			}
			if(keyPress == 'r') {																	// if 'r' then reset the grid/clear the grid (added for convenience)
				grid.clearScreen();
				repaint();
			}
			
			if(keyPress == 's') {																	// if 's' then save currentState of grid to file by writeObject(grid)
			 	try {
			 		output = new ObjectOutputStream(new FileOutputStream("saveGame.ser"));
					output.writeObject(grid);
		 	}
			 	catch(IOException ioE) {
			 		ioE.printStackTrace();
			 	}
			}	// end saving file
			if(keyPress == 'l') {																	// if 'l' then load from saved file of grid to by readObject()
				try {
					input = new ObjectInputStream(new FileInputStream("saveGame.ser"));
					grid = (Grid)input.readObject();
					repaint();
				}
				catch(ClassNotFoundException cnfE) {
					cnfE.printStackTrace();
				}
				catch(IOException ioE) {
					ioE.printStackTrace();
				}
			}	// end loading file


		}	// end method KeyTyped()
		
	}	// end private inner class KeyboardListener


} // end class GameOfLife100x100
