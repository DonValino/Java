package layoutexamples;

import java.awt.*;
import javax.swing.*;

public class FlowLayoutEx extends JFrame
{
	JButton left, right, center;

	public FlowLayoutEx()
		{
			setTitle("FlowLayout");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setLayout(new FlowLayout());

			left = new JButton("Left");
			right = new JButton("Right");
			center = new JButton("Center");
  
			add(left);
			add(center);
			add(right);
  
			setSize(300, 80);
			setVisible(true);
		}  

 public static void main(String[] args)

 	{
	 	new FlowLayoutEx();
 	}
}

