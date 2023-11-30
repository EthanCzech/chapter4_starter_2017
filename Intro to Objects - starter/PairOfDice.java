// student outline of Pair of Dice
import java.util.Random;
public class PairOfDice
{
    //private data-- 2 die
    
    private static Random generator = new Random();
    private int sides, faceValue1, faceValue2, total;
    
    
    
    /**---------- Default Constructor
        Creates two six-sided Die objects, both with an initial
        face value of one.
    */
    public PairOfDice()
    {sides = 6;
     faceValue1 = 1;
     faceValue2 = 1;   
    
    }

    
    
    
    

    /**----------- roll()
        Rolls both dice and returns the combined result.
        @return int
    */
    public int roll()
    {faceValue1 = generator.nextInt(0, sides) + 1;
     faceValue2 = generator.nextInt(0, sides) + 1;
     total = faceValue1 + faceValue2;
     return total;
    }



    /**-------------- getTotal()
        Returns the current combined dice total.
        @return
    */
    public int getTotal()
    {return total;
    }



    /**---------------- getDie1()
        Returns the current value of the first die.
        @return
    */
    public int getDie1()
    {return faceValue1;
    }

    /**------------- getDie2()
        Returns the current value of the second die.
        @return
    */
    public int getDie2()
    {return faceValue2;
    }

    /**------------- toString()
            Returns the current data for each die
            hint: use methods in die to build the String to return
            @return
    */
    public String toString()
    {
      String data = "NUmber of faces: ";
      data += sides;
      data += " Dice 1 Current Face Value: ";
      data += faceValue1;
      data+= "Dice 2 Current Face Value: ";
      data += faceValue2;
      return data;
    
    }



}
