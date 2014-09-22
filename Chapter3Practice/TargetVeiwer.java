import javax.swing.JFrame;

/**
 * Write a description of class TargetVeiwer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TargetVeiwer
{

    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        
        frame.setSize(400,400);
        frame.setTitle("Get More, Pay Less");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        TargetComponent component = new TargetComponent();
        frame.add(component);
        
        frame.setVisible(true);
        
        
    }

}
