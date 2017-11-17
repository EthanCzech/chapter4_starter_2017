//********************************************************************
//  Die.java
//
//********************************************************************

import java.util.Random;
public class Die3
{
   private final int MIN_FACES = 4;


   private static Random generator = new Random();
   //public String test = new String("Don't touch me!!!");
   private int numFaces;   // number of sides on the die
   private int faceValue;  // current value showing on the die

   /**
     Defaults to a six-sided die. Initial face value is 1.
   */
   public Die3 ()
   {
      numFaces = 6;
      faceValue = 1;
   }

   /**
     constructor
     Explicitly sets the size of the die. Defaults to a size of
     six if the parameter is invalid < MIN_FACES.
     Initial face value is random. ---------------later!!!!
     @parm int number of sides of the die
   */
   public Die3(int num_of_faces)
   {
       faceValue = 1;
       if (num_of_faces < MIN_FACES)
            numFaces = 6;
       else
            numFaces = num_of_faces;
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
        @return _____________________write comment
   */
   public int getFaceValue ()
   {
      return faceValue;
   }


  /**
        Returns the current number of faces the die has.
        @return _________________
  */
  public int getnumFaces()
  {
      return numFaces;
      
  }


  /**
        Sets the number of faces of the Die
        @param _________________
  */



   /**
        Returns the current die value and number of sides as a String.
        @return String of the private data
        no toString will display Class name & address
   */
   public String toString ()
   {
      String data ="Face Value: " + faceValue;
      data += "Number of Sides: " + numFaces;

      return data;
   }




}//end of calss Die
