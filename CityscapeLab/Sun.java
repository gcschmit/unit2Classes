import java.util.Random;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Ellipse2D;
import java.util.Random;
import java.awt.GradientPaint;
/**
 * Creates an image of the sun
 * 
 * @Arresh Amleshi
 * @version (a version number or a date)
 */
public class Sun
{
    // instance variables - replace the example below with your own
    private double xFrame;
    private double yFrame;
    private double xMax;
    private double yMax;
    private double position;

    /**
     * Constructor for objects of class Sun
     */
    public Sun(double startPosition,double initxMax,double inityMax)
    {
        // initialise instance variables
        xMax = initxMax;
        yMax = inityMax;
        xFrame = 3*xMax/10;
        yFrame = yMax/3;
        position = startPosition;
    }


    /**
     * creates a round sun in the upper left corner that has a random color gradient
     * 
     * @g2 is the Graphics2D that needs to draw it
     * @return     a round sun with a colour gradient
     */
    public void draw(Graphics2D g2)
    //throws InterruptedException
    {
        // put your code here
        Random generator = new Random();
        Color randomColor1 = new Color(generator.nextInt(255), generator.nextInt(255),
        generator.nextInt(255));
        Color randomColor2 = new Color(generator.nextInt(255), generator.nextInt(255),
        generator.nextInt(255));
        GradientPaint gradient = new GradientPaint(0,0,randomColor1,0,255,randomColor2,true);
        g2.setPaint(gradient);
        Rectangle.Double fullBound = new Rectangle.Double(position,0,xFrame, yFrame);
        g2.setPaint(gradient);
        //g2.draw(fullBound);
        Rectangle.Double squareBound = new Rectangle.Double(position + xFrame/6 ,0,2*xFrame/3 ,yFrame);
        g2.draw(squareBound);
        Ellipse2D.Double sun = new Ellipse2D.Double(position + xFrame/6 , 0, 2*xFrame/3, yFrame);
        g2.fill(sun);
    }
}
            

