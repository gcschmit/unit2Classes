import java.util.Scanner;
/**
 * like a square, but not... square
 * 
 * @author arash
 * @version (a version number or a date)
 */
public class rectangle
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;

    /**
     * Default constructor for objects of class rectangle
     */
    public rectangle()
    {
        // initialise instance variables
        x = 0;
    }
    
    public void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("what is the lenght? \t:");
        double length = in.nextDouble();
        System.out.print("what is the width \t:");
        double width = in.nextDouble();
        double area = length*width;
        double perimeter = 2*length + 2*width;
        double diagonal = Math.sqrt((Math.pow(length,2)+Math.pow(width,2)));
        System.out.print("\nthe area is\t:");
        System.out.println(area);
        System.out.print("the perimeter is\t:");
        System.out.println(perimeter);
        System.out.print("the diagonal is\t:");
        System.out.println(diagonal);
    }

}
