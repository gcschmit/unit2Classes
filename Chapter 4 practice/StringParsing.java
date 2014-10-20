import java.util.Scanner;

/**
 * Write a description of class StringParsing here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StringParsing
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;

    /**
     * Default constructor for objects of class StringParsing
     */
    public StringParsing()
    {
        // initialise instance variables
        x = 0;
    }

    public void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("please imput a number between 1,000 and 999,999:\t");
        String rawNumber = in.next();
        int rawLength = rawNumber.length();
        int commaIndex = rawNumber.indexOf(",");
        String firstHalf = rawNumber.substring(0,commaIndex);
        String seccondHalf = rawNumber.substring(commaIndex+1);
        String number = firstHalf + seccondHalf;
        System.out.println(number);
    }

}
