//********************************************************************
//  Die.java
//
//********************************************************************

import java.util.Random;
public class Die
{
   private final int MIN_FACES = 4;


   private static Random generator = new Random();
   private int numFaces;   // number of sides on the die
   private int faceValue;  // current value showing on the die

   /**
     Defaults to a six-sided die. Initial face value is 1.
   */
   public Die ()
   {
      numFaces = 6;
      faceValue = 1;
   }

   /**
     constructor
     Explicitly sets the size of the die. Defaults to a size of
     six if the parameter is invalid < MIN_FACES.
     Initial face value is random.----------later!!!!
     @parm int number of sides of the die
   */
  public Die( int number_of_faces)
  {
      faceValue = 1;
      if(number_of_faces < MIN_FACES)
      {
         numFaces = 6; 
      }
      else
      {
          numFaces = number_of_faces;
          
      }   
  }


   /**
        Rolls the die and returns the result.
        @return
   */
   public int roll ()
   {
      faceValue = 0; // you put the correct  code here
      return faceValue;
   }

   /**
        Returns the current die value.
        @return int faceValue
   */
   public int getFaceValue ()
   {
      return faceValue;
   }


  /**
        Returns the current number of faces the die has.
        @return int numFaces
  */
  public int getnumFaces ()
  {
      return numFaces;            
  }


  /**
        Sets the number of faces of the Die
        @param int changing number of Faces of Die to 
  */
  public void setnumFaces(int newFaces)
  {
      numFaces = newFaces;
      
      
  }



   /**
        Returns the current die value and number of sides as a String.
        @return _____________
        if no toString it will print Class@address(hex)
   */
   public String toString ()
   {
      String data ="Face Value" + faceValue;
      data += "Number of Faces" + numFaces;



      return data;
   }




}//end of calss Die
