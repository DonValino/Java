package layoutexamples;

import java.awt.*;
import javax.swing.*;

public class GridLayoutExample  extends JFrame
{
	private GridLayout layout;
	private JButton[] button;
 
	public GridLayoutExample ()
	{
		setTitle("GridLayout");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		layout = new GridLayout(2, 3);   //2 rows, 3 columns
		setLayout(layout);
		button = new JButton[6];
		setSize(300, 200);
		setVisible(true);
    
		for(int i = 0; i < button.length; i++)
		{
			button[i] = new JButton("Button " + i);
			add(button[i]);
		}
  
	}
	public static void main(String args[])
 		{
	 		new GridLayoutExample();	
 		}
}

