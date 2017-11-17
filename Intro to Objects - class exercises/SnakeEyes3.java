//********************************************************************
//  SnakeEyes.java       Author: Lewis/Loftus/Cocking
//
//  Demonstrates the use of a class with overloaded constructors.
//********************************************************************

public class SnakeEyes3
{
   //-----------------------------------------------------------------
   //  Creates two die objects, then rolls both dice a set number of
   //  times, counting the number of snake eyes that occur.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      final int ROLLS = 500;
      int snakeEyes = 0, num1, num2;

      Die3 die1 = new Die3();    // creates a six-sided die
      Die3 die2 = new Die3(20);  // creates a twenty-sided die
      Die3 die3 = new Die3 (1);  // creates an invalid die -- so sides are 6
      
      //die1.test = "Ahhhhh:(:(:(";
      //System.out.print(die1.test);

      for (int roll = 1; roll <= ROLLS; roll++)
      {

         // write correct code to check for snake eyes

      }
/*
      System.out.println ("Number of rolls: " + ROLLS);
      System.out.println ("Number of snake eyes: " + snakeEyes);
      System.out.println ("Ratio: " + (double)snakeEyes/ROLLS);

      System.out.println(die3.getFaceValue() );
      System.out.println(die2);
*/
   }//end of main
}//end of class
