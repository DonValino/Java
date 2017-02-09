package layoutexamples;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutExample extends JFrame
{
	private static final int FRAME_WIDTH = 300;
	private static final int FRAME_HEIGHT = 250;
	private static final int FRAME_X_ORIGIN = 150;
	private static final int FRAME_Y_ORIGIN = 250;
	
	public BorderLayoutExample()
	{
		Container cPane;
		JButton button1, button2, button3, button4, button5;

        setTitle("Testing Border Layout Manager");
        setSize (FRAME_WIDTH, FRAME_HEIGHT);
		setResizable (true);
		setLocation (FRAME_X_ORIGIN, FRAME_Y_ORIGIN);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		cPane = this.getContentPane();
		cPane.setBackground(Color.white);
		
		setLayout (new BorderLayout());
		
		button1 = new JButton("Button 1");
		button2 = new JButton("Button 2");
		button3 = new JButton("Button 3");
		button4 = new JButton("Button 4");
		button5 = new JButton("Button 5");
		
		add(button1, BorderLayout.NORTH);
		add(button2, BorderLayout.SOUTH);
		add(button3, BorderLayout.EAST);
		add(button4, BorderLayout.WEST);
		add(button5, BorderLayout.CENTER);
	}

	public static void main(String[] args) 
	{
		BorderLayoutExample bld = new BorderLayoutExample();
		bld.setVisible(true);
	}
}

