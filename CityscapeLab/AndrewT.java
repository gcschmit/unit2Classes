import java.awt.*;
import javax.swing.*;
import java.io.*;
import javax.imageio.*;
import java.awt.Toolkit;
import java.awt.Graphics;
public class AndrewT extends JFrame
{
  public AndrewT()
  {
    //this code based on http://www.dreamincode.net/forums/topic/142056-putting-images-into-jframes/ 
    /*ImageIcon andrew = new ImageIcon ("andrew_arpan_heart.jpg"); 
    JLabel label = new JLabel (andrew); 
    add(label); 
    setSize(0,0);
    setVisible(true);
    add(andrew);
    */
   

  }
  public void draw(Graphics g)
  {
      Image andrew = Toolkit.getDefaultToolkit().createImage("andrew_arpan_heart2.jpg");
      g.drawImage(andrew,0,0,null); 
    }
}	