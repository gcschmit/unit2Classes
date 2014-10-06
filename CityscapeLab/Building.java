import java.util.Random;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
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
    private int blockHeight;
    private double height;
    private double width;
    private double position;
    private double floor;

    /**
     * Default constructor for objects of class Building
     * @param startPosition     Which block of 2 will the building spawn on
     * @param yMax      What is the maximum height
     * @param xMax      The max width
     */
    public Building(double startPosition, double yMax, double xMax)
    {
        // initialise instance variables
        Random generator = new Random();
        blockHeight = generator.nextInt(11)+1;
        height = blockHeight*(yMax/20);
        width = xMax/ 10;
        position = startPosition*xMax/10;
        floor = yMax;
    
    }

    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        Assumes that the 
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public void draw(Graphics2D g2)
    {
        // put your code here
        Random generator = new Random();
        Color lightGray = new Color(160,160,160);
        Color darkGray = new Color(42,42,42);
        //Rectangle.Double base = new Rectangle.Double(position, floor, width, height);
        Rectangle.Double base = new Rectangle.Double(position, floor-height, width, height);
        int pickColor = generator.nextInt(2);
        if (pickColor == 0)
        {
            g2.setColor(lightGray);
        }
        else
        {
            g2.setColor(darkGray);
        }
        g2.fill(base);
        g2.setColor(Color.YELLOW);
        for (int i = 1; i<blockHeight; i++)
        {
            Rectangle.Double window = new Rectangle.Double(position+(width/4),floor-height,width/4
            ,height/4);
            g2.fill(window);
        }
        
    }

}
