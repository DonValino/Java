package skeleton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Cinema extends JFrame implements ActionListener {
	private static final int FRAME_WIDTH = 400;
	private static final int FRAME_HEIGHT = 300;
	private static final int FRAME_X_ORIGIN = 150;
	private static final int FRAME_Y_ORIGIN = 250;
	private JButton wolfman, edge, invictus, up, quit;
	private JLabel number, total, title;
	private JTextField amount, quantity;
	private JPanel top, topMiddle, bottomMiddle, bottom, bottomExit;

	public Cinema() {
		// Set window coordinates
		this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		this.setTitle("Cinema System");
		this.setLocation(FRAME_X_ORIGIN, FRAME_Y_ORIGIN);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new GridLayout(5, 1));
				
	}
	
	public void actionPerformed(ActionEvent e)
	{
			
	}
	
	public static void main(String args[])
	{
		Cinema c = new Cinema();
		c.setVisible(true);
	}
}
