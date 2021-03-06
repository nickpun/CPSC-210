package photo;

import javax.swing.*;
import java.awt.*;


/**
 * Submitted by: <enter your name here>
 * CWL ID: <enter your CWL ID here>
 */

/*
 * A simple photo viewer that always displays the same photo each time it is run.
 */
public class PhotoViewer extends JFrame {
	private static final long serialVersionUID = 2116436198852146401L;
	private static final String IMAGE_FILE = "butterfly.jpg";
	private static final String TITLE = "PhotoViewer";
	private static final int WIDTH = 225;
	private static final int HEIGHT = 210;
	
	/*
	 * Constructor
	 * Effects:  initializes application's main window and displays photo
	 */
	public PhotoViewer() {
		this.setSize(WIDTH,HEIGHT);
		this.setTitle(TITLE);
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		
		ImageIcon icon = new ImageIcon(IMAGE_FILE);
		JLabel label = new JLabel();
		label.setIcon(icon);
		panel.add(label);
		this.add(panel);
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int x = screenSize.width/2 - this.getWidth()/2;
		int y = screenSize.height/2 - this.getHeight()/2;
		this.setLocation(x,y);
		
		this.setVisible(true);
	}
	
	/*
	 * Instantiates photo viewer.
	 */
	public static void main (String[] args) {
		new PhotoViewer();
	} 
} 