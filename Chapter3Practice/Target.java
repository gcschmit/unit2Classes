import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;

/**
 * A target shape that can be positioned anywhere on the screen
 * 
 * @Arresh 
 * @version (a version number or a date)
 */
public class Target
{
    /** description of instance variable x (add comment for each instance variable) */
    private int xLeft;
    private int yTop;

    /**
     * @param x
     * @param y
     */
    public Target(int x, int y)
    {
        xLeft = x;
        yTop = y;
    }

    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        assumes that there exists a 10X 10 square with upper left verticie as
     *              inputs
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    g2         The graphics context
     * @return    description of the return value
     */
    public void draw(Graphics2D g2)
    {
        //the number of the ring is the radius, the smaller nestled in the larger
        Ellipse2D.Double ring1 = new Ellipse2D.Double(xLeft+40, yTop +40, 20, 20);
        Ellipse2D.Double ring2 = new Ellipse2D.Double(xLeft + 30, yTop +30, 40, 40);
        Ellipse2D.Double ring3 = new Ellipse2D.Double(xLeft+20, yTop +20, 60, 60);
        Ellipse2D.Double ring4 = new Ellipse2D.Double(xLeft+10, yTop+10 , 80, 80);
        Ellipse2D.Double ring5 = new Ellipse2D.Double(xLeft, yTop , 100, 100);
        g2.setColor(Color.RED);
        g2.draw(ring5);
        g2.fill(ring5);
        g2.setColor(Color.WHITE);
        g2.draw(ring4);
        g2.fill(ring4);
        g2.setColor(Color.RED);
        g2.draw(ring3);
        g2.fill(ring3);
        g2.setColor(Color.WHITE);
        g2.draw(ring2);
        g2.fill(ring2);
        g2.setColor(Color.RED);
        g2.draw(ring1);
        g2.fill(ring1);
        
        
        
    }

}
