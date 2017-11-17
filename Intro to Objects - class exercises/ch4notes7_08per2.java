/********************************************************************
// These are the notes for ch 4 used in hayes class
//******************************************************************* */


import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.*;

public class ch4notes7_08per2
{

 //static int sum = 987654;

public static void main (String[] args)
{
    int sum = 8, x = 2,y = 3;

    mathy solver = new mathy();

    System.out.println(solver.abs(-5));
    System.out.println(abs(-8));
    //System.out.println(add(5,6));
    //System.out.println(add(5,6,7));
    //System.out.println(add(x,y));
    //System.out.println("x:"+x);
    


    /**/
}// end of main

/**
    take the absoulute value of the number
    @param int value
    @return absoulute value of number
*/
public static int abs (int x)
{
    if (x < 0)
        x = -x;

    return x;

}//end of abs

/**
    take the absoulute value of the number
    @param double value
    @return absoulute value of number
*/
public static double abs (double x)
{
    if (x < 0)
        x = -x;

    return x;



}//end of abs





public static int add (int x, int y)
{   System.out.println("hi" );
    int sum;//sum x and y are local var
    x = 52;
    sum = x+y;

    return sum;


}//end of add

public static int add (int x, int y,int z)
{   System.out.println("hello" );
    int sum;//sum x and y are local var
    sum = x+y+z;

    return sum;


}//end of add


}// end of class









