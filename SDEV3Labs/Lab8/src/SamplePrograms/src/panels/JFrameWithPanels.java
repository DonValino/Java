package panels;

import javax.swing.*;
import java.awt.*;
public class JFrameWithPanels extends JFrame
{
   private final int WIDTH = 350;
   private final int HEIGHT = 220;
   private JButton button1 = new JButton("One");
   private JButton button2 = new JButton("Two");
   private JButton button3 = new JButton("Three");

   public JFrameWithPanels()
   {
      setTitle("JFrame with Panels");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setSize(WIDTH, HEIGHT);
      setVisible(true);

      JPanel pane = new JPanel();
      JPanel pane2 = new JPanel();

      setLayout(new FlowLayout());

      add(pane);
      add(pane2);

      pane.add(button1);
      pane.setBackground(Color.BLUE);

      pane2.add(button2);
      pane2.add(button3);
      pane2.setBackground(Color.PINK);

   }
   public static void main(String[] args)
   {
      JFrameWithPanels panel = new JFrameWithPanels();
   }
  }

