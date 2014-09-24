import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
import java.util.Random;

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
    private int size;

    /**
     * @param x
     * @param y
     */
    public Target(int x, int y, int sise)
    {
        xLeft = x;
        yTop = y;
        size = sise;
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
        /*Ellipse2D.Double ring1 = new Ellipse2D.Double(xLeft+40, yTop +40, 20, 20);
        Ellipse2D.Double ring2 = new Ellipse2D.Double(xLeft + 30, yTop +30, 40, 40);
        Ellipse2D.Double ring3 = new Ellipse2D.Double(xLeft+20, yTop +20, 60, 60);
        Ellipse2D.Double ring4 = new Ellipse2D.Double(xLeft+10, yTop+10 , 80, 80);
        Ellipse2D.Double ring5 = new Ellipse2D.Double(xLeft, yTop , 100, 100);
        */
       /*
        Ellipse2D.Double ring1 = new Ellipse2D.Double(xLeft+40-50, yTop +40-50, 20, 20);
        Ellipse2D.Double ring2 = new Ellipse2D.Double(xLeft + 30-50, yTop +30-50, 40, 40);
        Ellipse2D.Double ring3 = new Ellipse2D.Double(xLeft+20-50, yTop +20-50, 60, 60);
        Ellipse2D.Double ring4 = new Ellipse2D.Double(xLeft+10-50, yTop+10-50 , 80, 80);
        Ellipse2D.Double ring5 = new Ellipse2D.Double(xLeft-50, yTop-50 , 100, 100);
        */
        Ellipse2D.Double ring1 = new Ellipse2D.Double(xLeft- size/10, yTop - size/10, size/5, size/5);
        Ellipse2D.Double ring2 = new Ellipse2D.Double(xLeft - 2*size/10, yTop -2*size/10, 2*size/5, 2*size/5);
        Ellipse2D.Double ring3 = new Ellipse2D.Double(xLeft-3*size/10, yTop -3*size/10, 3*size/5, 3*size/5);
        Ellipse2D.Double ring4 = new Ellipse2D.Double(xLeft-4*size/10, yTop-4*size/10 ,4*size/5,4*size/5);
        Ellipse2D.Double ring5 = new Ellipse2D.Double(xLeft-size/2, yTop-size/2 , size, size);
        Random Generator = new Random();
        Color random = new Color(Generator.nextInt(256),Generator.nextInt(256),Generator.nextInt(256));
        
        g2.setColor(random);
        g2.draw(ring5);
        g2.fill(ring5);
        g2.setColor(Color.WHITE);
        g2.draw(ring4);
        g2.fill(ring4);
        g2.setColor(random);
        g2.draw(ring3);
        g2.fill(ring3);
        g2.setColor(Color.WHITE);
        g2.draw(ring2);
        g2.fill(ring2);
        g2.setColor(random);
        g2.draw(ring1);
        g2.fill(ring1);
        
        
        
    }

}
