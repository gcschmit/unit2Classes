import java.awt.GradientPaint;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Random;
/**
 * Creates the background for the back of the city
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Background
{
    // height       the height of the window
    // width        The width of the window
    private int height;
    private int width;
    

    /**
     * Constructor for objects of class Background
     */
    public Background(int pullHeight, int pullWidth)
    {
        // initialise instance variables
        height = pullHeight;
        width = pullWidth;
    }

    /**
     * goes through the entire frame and creates a red to blue color gradient
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void draw(Graphics2D g2)
    {
        // put your code here
        for (float i=0; i < width; i++)
        {
            GradientPaint gradient = new GradientPaint(i,0,Color.BLUE,i,height,Color.RED,true);
            g2.setPaint(gradient);
            Rectangle backgroundSegment = new Rectangle((int)i,0,1,height);
            g2.fill(backgroundSegment);
    }
}
}
