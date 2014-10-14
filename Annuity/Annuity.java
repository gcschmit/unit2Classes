import java.lang.Math;
public class Annuity
{
    /** description of instance variable x (add comment for each instance variable) */
    public static final long PERIODIC_PAYMENT = 10000;
    public static final double COMPOUND_RATE = .08;
    public static final long NUM_PAYMENTS = 20;

    public static double calculateAnnuity ()
    {        
        double numerator = (Math.pow((1+COMPOUND_RATE), (NUM_PAYMENTS-1)) - 1) / COMPOUND_RATE;
        double denom = (Math.pow((1+COMPOUND_RATE), (NUM_PAYMENTS-1)));
        return PERIODIC_PAYMENT*((numerator/denom)+1);
    }

}
