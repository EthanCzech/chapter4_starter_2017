/********************************************************************
// These are the notes for ch 4 used in hayes class
//******************************************************************* */


import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.*;

public class ch4notes7_08
{

    //static int sum = 987654;

    public static void main (String[] args)
    {
    
        mathy solver = new mathy();//class and object
        circle round = new circle(10);
        //System.out.println(round);
        //System.out.println(solver);//if you print an object, it will call the toString method
        //round.radius = 5;
        //System.out.print(round.radius);
        System.out.println(round);
        
        
        //System.out.println(solver.abs(-5));
        //System.out.println(abs(-8));
       // System.out.println(abs(-8) + 2);//overloading
        //System.out.println(abs(-3.14));
        
        
        //System.out.println(solver.add(-5, 5));
        //System.out.println(solver.add(4.4, 6.4));
        
        
        
        //System.out.println(solver.round(5.29873428764, 3));
        
    /**/
    }// end of main
    
    /**
        take the absoulute value of the number
        @param int value
        @return absoulute value of number
    */
    public static int abs (int x)//int x is a parameter, int is a return type
    {//abs is an identifier.
        System.out.print("I");
        if (x < 0)
            x = -x;
    
        return x;
    
    }//end of abs
    
    /**
        returns the absoulute value of the number
        @param double value
        @return absoulute value of double
    */
    //method signature is abs(parameters)
    //can't overload by changing return type
    public static double abs (double x)//int x is a parameter, int is a return type
    {//abs is an identifier.
        System.out.print("D");
        if (x < 0)
            x = -x;
    
        return x;
    
    }//end of abs
    
    
    
    
    
    //public static int add (int x, int y)



}// end of class









