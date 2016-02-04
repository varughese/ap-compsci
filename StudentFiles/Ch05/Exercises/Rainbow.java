// Chapter 5 Question 27

// ________________________________________________

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Rainbow extends JPanel
{
  // Declare skyColor:
  // ________________________________________________

  public Rainbow()
  {
    setBackground(Color.WHITE);
  }

  // Draws the rainbow.
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);
     drawOrnament(g, 150, 150, 50);
  }
  
  public static void drawOrnament(Graphics g, int x, int y, int r) {
      if(r < 5) return;
      
      int cx = x-r; int cy = y-r;
     // g.drawOval(cx + r, cy +r, 2*r, 2*r);
      g.drawOval(x, y, 2*r, 2*r);
      drawOrnament(g, cx-r/2, cy-r/2, r/2);
   }

  public static void main(String[] args)
  {
    JFrame w = new JFrame("Rainbow");
    w.setBounds(300, 300, 300, 200);
    w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container c = w.getContentPane();
    c.add(new Rainbow());
    w.setVisible(true);
  }
}
