

/**
 * The Car class models a car with constant fuel efficiency and tracks how much fuel is left in its tank.
 * 
 * @author crisptofuring
 * @version 12 September 2014
 */
public class Car
{
    /** fuel efficiency modeled in mpg */
    private double fuelEfficiency;
    
    /**
     * the fuel, measured in gallons, left in this car's tank
     */
    private double fuelInTank;

    /**
     * constructor for Car that specififes fuel efficiency
     */
    public Car(double fuelEfficiency)
    {
         
    }

    /**
     *adds specified no. of gallons to this car's tank
     * @pre specified number of gallons will not exceed this car's tank capacity      
     * @param    gallons  number of gallons of fuel to add to this car's tank
     */
    public void addGas(double gallons)
    {       
    }
    
    /**
     * Reduces fuel in the car based on car's fuel efficiency and specified distance traveled
     * @pre     specified no. of miles will not consume more than the amount of fuel in this car's tank.    
     * @param  miles  the number of miles driven   
     */
    public void drive(double miles)
    {
    }

    /**
     * returns the number of gallons of gas remaining in this car's tank     
     * @return  double number of gallons of gas remaining in this car's tank
     */
    public double getGasInTank()
    {
        return 0;
    }
    
}
