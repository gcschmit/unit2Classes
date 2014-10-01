

/**
 * Write a description of class Annuity here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Annuity
{
    private double PMT = 10000;
    private double i = .08;
    private double n = 20;
    /**
     * Default constructor for objects of class Annuity
     */
    public Annuity()
    {
        // initialise instance variables
        int presentValue = 0 ;
    }

    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method(what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public void sampleMethod()
    {
       double presentValue = PMT * ((((Math.pow(1+i,n-1)-1)/i)/Math.pow(1+n,n-1))+1);
       System.out.println(presentValue);
    }

}
