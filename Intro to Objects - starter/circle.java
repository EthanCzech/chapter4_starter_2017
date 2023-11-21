
/**
 * Write a description of class circle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class circle
{
    // instance variables - data should be private
    private double radius, area, circumfrence, diameter;
    public final double PI = 3.1415;
    
    /**
     * Constructor for objects of class circle
     */
    public circle()
    {
        // initialise instance variables
        radius = 0;
        diameter = 0;
        circumfrence = 0;
        area = 0;
    }

    /**
     * Constructor
     * Will calculate area, circumfrence and diameter
     * return    constructors do not have return statements
     */
    public circle(double r)
    {
        //r is local to the circle constructor
        radius = r;
      
      
      
    }
    
    /**
     * calcCircumfrence
     * @return double - the proper circumfrence
     * 
     */
    public double calcCircumfrence()
    {
        return 2 * PI * radius;
    
    
    }
}
