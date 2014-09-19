

/**
 * Simulates the tool of the capitalist opressors
 * 
 * @author Arresh 
 * @version ¯\_(ツ)_/¯
 */
public class VendingMachine
{
    /** description of instance variable x (add comment for each instance variable) */
    private int cans;
    private int coins;
    private int profit;

    /**
     * Default constructor for objects of class VendingMachine
     */
    public VendingMachine()
    {
        this.cans = 10;
        this.coins = 0;
        this.profit = 0;
    }
    
    public VendingMachine(int startCans)
    {
        // initialise instance variables
        this.cans = startCans;
        this.coins = 0;
        this.profit = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public int insertCoin()
    {
        // put your code here
        this.coins += 1;
        return 1;
    }
    
    public void vendCan(int insertedCoins)
    {
        this.cans -= insertedCoins;
    }
    
    public void reset(int refillCans)
    {
        this.profit += this.coins;
        this.coins = 0;
        this.cans += refillCans;
    }
    
    public int getCans()
    {
        return this.cans;
    }
    
    public int getCoins()
    {
        return this.coins;
    }
    
    public int getProfit()
    {
        return this.profit;
    }
}
