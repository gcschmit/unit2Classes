import java.util.Random;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
/**
 * I like penrose triangles
 * 
 * @arresh
 * @version (a version number or a date)
 */
public class PenroseBuilding
{
    /** xFrame      Sets the horizontal bound where the triangle will be constructed
        yFrame      Sets the vertical bound where the triangle will be constructed
       */
    private double xFrame;
    private double yFrame;
    private double xMax;
    private double yMax;
    private double position;

    /**
     * Default constructor for objects of class PenroseBuilding
     */
    public PenroseBuilding(double startPosition,double initxMax,double inityMax)
    {
        // initialise instance variables
        xMax = initxMax;
        yMax = inityMax;
        xFrame = 3*xMax/10;
        yFrame = yMax/3;
        position = startPosition;
    }

    /**
     * This makes a penrose triangillo, yo
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public void draw(Graphics2D g2)
    {
        Rectangle.Double fullBound = new Rectangle.Double(position,0,xFrame, yFrame);
        g2.setColor(Color.BLACK);
        //g2.draw(fullBound);
        Rectangle.Double squareBound = new Rectangle.Double(position + xFrame/6 ,0,2*xFrame/3 ,yFrame);
        g2.draw(squareBound);
        g2.setColor(Color.RED);
        Point2D.Double topVertex = new Point2D.Double(squareBound.getWidth()/2+ squareBound.getX(), squareBound.getHeight()/4);
        Point2D.Double rightVertex = new Point2D.Double(squareBound.getX()+(3*squareBound.getWidth()/4),5*squareBound.getHeight()/8);
        Point2D.Double leftVertex = new Point2D.Double(squareBound.getX()+(squareBound.getWidth()/4),5*squareBound.getHeight()/8);
        Line2D.Double innerRightSide = new Line2D.Double(topVertex, rightVertex);
        Line2D.Double innerLeftSide = new Line2D.Double(topVertex, leftVertex);
        Line2D.Double innerBottemSide = new Line2D.Double(leftVertex,rightVertex);
        g2.draw(innerBottemSide);
        g2.draw(innerLeftSide);
        g2.draw(innerRightSide);
        
        double x = topVertex.getX() - (innerBottemSide.getX1()- innerBottemSide.getX1()/4);
        double y = ((topVertex.getY()-rightVertex.getY())/(topVertex.getX()-rightVertex.getX()))*x + topVertex.getY() - 
        ((topVertex.getY()-rightVertex.getY())/(topVertex.getX()-rightVertex.getX()))*topVertex.getX();
        Point2D.Double middleTopVertex = new Point2D.Double(x/2,y/2);
        Line2D.Double topVertexOutcrop = new Line2D.Double(middleTopVertex, topVertex);
        g2.draw(topVertexOutcrop);
    }

}
