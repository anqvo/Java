import javax.swing.JFrame; // heavyweight component
import java.awt.Graphics;
import java.swing.JPanel; // lightweight component placed on JFrame
import java.awt.Color;
import java.awt.event.MouseAdapter; // handles mouse clicks
import java.awt.event.MouseEvent;
import java.awt.BorderLayout;
import javax.swing..Timer;
import java.awt.ActionLister;
import java.awt.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class GOLDisplay extends JPanel {
	private Grid grid;
	private MouseListener mouse;
	private Timer timer;
	private TimerListener timerListener;
	private KeyAdapater keyboardListener;
	
	public GOLDisplay() {
		this.grid = new Grid();
		this.timerListener = new TimerListener();
		this.timer = new Timer(333, timerListener);
		this.keyboardListener = new KeyboardListener();
		JFrame window = new JFrame("Game of Life"); // title for window frame
		window.setSize(925,1050);
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // fully exit program
		window.setLayout(new BorderLayout());
		window.add(this, BorderLayout.CENTER);
		this.addMouseListener(mouse = new MouseListener());
		this.setBackGroundColor(Color.GREEN);
	}
	
	@Override
	public void paintComponent(Graphics g) {
		// draw rectangles on board
		for(int row = 0; /* up to arbitrary number */ {
			for(int column; /* up to arbitrary number */ ) {
				int x = row * 12;
				int y = column * 12;
				
				if(grid.isAlive(row, column)) { // if the cell is alive
					g.setColor(/* parameter? */);
					g.fillRect(/* parameter? */);
					g.drawRect(/* parameter? */);
				}
				else { // if the cell is dead
					
				}
			} // end inner for
		} // end outer for
	} // end paintComponent method
	
	
	
	
	private class MouseListener extends MouseAdapter {
		public void mouseClicked(MouseEvent e) {
			/**
			 * Store the results of e.get() etc.
			 * Call switchState() from grid.
			 * Pass switchState() those results.
			 **/
			repaint(); // does not need an object to call...method from JPanel?
		}
	} // end MouseListener inner class
	
	
	
	
	private class TimerListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			// update game board
			repaint();
		}
	} // end TimerListener inner class
	
	
	
	
	private class KeyboardListener extends KeyAdapter {
		public void keyTyped(KeyEvent e) {
			/**
			 * getKeyChar()
			 * if "b", start
			 * if "n", stop the timer
			 **/
		}
	} // end KeyboardListener inner class
	
	
	
	
	
} // end GOLDisplay class

































