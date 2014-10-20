

/**
 * not to be confused with The Doors
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Door
{
    /** says the name of the door */
    private String name;
    private boolean state;

    /**
     * Default constructor for objects of class Door
     */
    public Door(boolean beggining_state, String beggining_name)
    {
        this.state = beggining_state;
        this.name = beggining_name;
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
    public void close()
    {
        this.state = false;
    }
    
    public void open()
    {
        this.state = true;
    }

    public String getName()
    {
        return this.name;
    }
    public boolean getState()
    {
        return this.state;
    }
    public void setName(String newName)
    {
        this.name = newName;
    }
    
    public void setState(boolean newState)
    {
        this.state = newState;
    }

    
}
