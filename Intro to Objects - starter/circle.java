
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
        circumfrence = calcCircumfrence();
        System.out.println(circumfrence);
        calcDiameter();
        calcArea();
        
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
    
    /**
     * calcDiameter
     * @return is void so nothing is returned
     * 
     */
    private void calcDiameter()
    {
        diameter = 2 * radius;
    
    
    }
    
    /**
     * calcArea
     * calulates the area and sets area
     */
    private void calcArea()
    { area = PI * radius * radius;
    
    
    }
    
    /**
     * equal method will compare this object to another
     * and return true if radius equals other radius
     * @param circle object
     * @return boolean 
     */
    public boolean equals(circle obj)
    {
        //at this point this.radius is optional, no local radius
        boolean x = radius == obj.radius;
        return x;
    }
    
    
    //-------------------------GETTERS----------------------------------------
    
    /**
     * getArea
     * @return double area
     */
    public double getArea()
    {return area;
    }
    
    /**
     * getCircumfrence
     * @return double circumfrence
     */
    public double getCircumfrence()
    {return calcCircumfrence();
    }
    
    /**
     * toString -returns all private data in readable format
     * @return String of radius, diameter, circumfrence and area
     */
    public String toString()
    {String data = "radius: " + radius;
     data += "\n diameter: " + diameter;
     data += "\n circumfrence: " +  circumfrence;
     data += "\n area: " + area;
     
     return data;
    }
}
