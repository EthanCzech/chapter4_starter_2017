import java.text.DecimalFormat;
import java.text.NumberFormat;

//import javax.swing.*;

public class mathy
{
    private int area=0;

    /**
        default constructor has no parameters - stubed in
    */
    public mathy( )
    {

        System.out.println ("hi from default constructor" );

    }//end of default const



    /**
        take the absoulute value of the number
        @param int value
        @return absoulute value of number
        */
    public int abs (int x)
    {
       
        if (x<0)
            x = -x;
            
        return x;

    }//end of abs








    /**
        two int parameters and adds them
        @param 2 int values
        @return int sum of values
    */

    public int add (int x, int y)//adds int x and y
    {
      System.out.print("Add function");
      int value = x + y;
      
      return value;
    }
    //end of add


    //public double add (double x,double y)
    /**
        two double parameters and adds them
        @param 2 double values
        @return double sum of values
        */
    public double add (double x, double y)//adds double x and y
    {
      System.out.print("Add function");
      double value = x + y;
      
      return value;
    }

    
    /**
     * round method will return double to number of places
     * @param double n, int places
     * @return double rounded to places
     */
    public double round(double n, int p) 
    {
        
        
        String places = ".";
        for (int num = 0; num < p; num++)
        {   places += "#"; 
            
        }
        
        DecimalFormat Format = new DecimalFormat("#"+places);
        String num = ""+n;
        String stringnum = Format.format(num);
        
        double roundedn = Double.parseDouble(stringnum);
        
        return roundedn;
    }
    
    
    
    /**
            toString
            message from Mathy class
            @param none
            @return String message
    */


    public String toString()
    {
        return ("Hi what do you want?, I'm just Mathy");

    }


}//end of class