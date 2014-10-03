import java.util.Random;
import java.awt.Graphics2D;
import java.awt.Color;
/**
 * Creates a building object of a random height given max height
 * 
 * @author Arresh
 * @version (a version number or a date)
 */
public class Building
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;

    /**
     * Default constructor for objects of class Building
     */
    public Building(double startPosition, double yMax, double xMax)
    {
        // initialise instance variables
        int blockHeight = 0;
        double height = 0;
        double width = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        Assumes that t
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public void draw(Graphics2D g2)
    {
        // put your code here
        Random generator = new random();
        Color lightGray = new Color(160,160,160);
        Color darkGray = newColor(32,32,32);
        blockHeight = generator.random(0,11);
        height = blockHeight*(yMax/5);
        width = xMax/ 10;
        Building2D.Double base = new Building2D.Double(startPosition*xMax/10, yMax, width, height);
        int pickColor = generator.random(0,2);
        if (pickColor = 0)
        {
            g2.setColor(lightGray);
        else
            {
                g2.setColor(darkGray);
            }
        }
        g2.fill(base);

}
