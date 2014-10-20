import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.util.Random;
/**
 * Write a description of class TargetComponent here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TargetComponent extends JComponent
{

    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        Random Generator = new Random();
        int x = getWidth()/2;
        int y = getHeight()/2;
        int size = Generator.nextInt(300) + 50;
        Target target1 = new Target(x,y, size);
        target1.draw(g2);
    }

}
