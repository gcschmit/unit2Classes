import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Rectangle;

/**
 * A blue night sky that covers the entire screen
 * 
 * @author Yi Qiao
 * @version 3 October 2014
 */
public class Sky
{
    /** Width of the sky which equals the width of the frame*/
    private int xRight;
    /** Height of the sky which equals the height of the frame*/ 
    private int yBottom;

    /**
     * Default constructor for objects of class Sky
     */
    public Sky(int x, int y)
    {
        xRight = x;
        yBottom = y;
    }

    /**
     * Draws the sky as a rectangle and fills it in with a dark blue color
     *
     * @param    g2    the graphics context
     */
    public void draw(Graphics2D g2)
    {
        Rectangle sky = new Rectangle(0, 0, xRight, yBottom);
        Color color = new Color(0, 0, 102);
        
        g2.setColor(color);
        g2.draw(sky);
        g2.fill(sky);
    }
}
