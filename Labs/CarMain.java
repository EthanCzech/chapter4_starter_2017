/**
* Write a description of class CarMain here.
*
* @author (your name)
* @version (a version number or a date)
*/
public class CarMain
{ public static int GOAL = 100;
  public static void main (String[] args)
  {
  int count1=0, count2=0;
  Car car1 = new Car(1969,"Volkswagon Beetle", 200000, 100);
  Car car2 = new Car(2012, "Acura TL", 120000, 100);
  
  System.out.println(getterTest(car1));
  System.out.println(addMilesTest(car1, 5));
  System.out.println(car1.milesToFuelLevel(5));
  System.out.println(isFuelTankEmptyTests(car1));
  System.out.println(car1.milesToFuelLevel(0));
  System.out.println(car1.drive(5)); 
  System.out.println(car1.milesToFuelLevel(0));
  //call toString of Car after calling addMilesTest
  /**
  * you can change count as you see fit
  * run loop until one of the Cars drive 100 miles and print out
  * which car "won"
  */
  //while (count1 < GOAL && count2 < GOAL)
  //{
  //car1.drive();
  //System.out.println(car2.drive(5));
     //Print the drive results (uses Coin's toString method)
    //System.out.print ("Car 1: " + car1);
    //System.out.println (" Car 2: " + car2);
    // Increment the counters
   // }
}


/**
* Prints out the information for each getter method
*/
public static String getterTest(Car mine)
{int year = mine.getYear();
 int miles = mine.getMiles();
 String model = mine.getModel();
 double fuel = mine.getfuelTankLevel();
 String data = new String(year + " " + miles + " " + model + " " + fuel);
 return data;
}

/**
* Takes a car and adds given miles
* @param
*/
public static int addMilesTest(Car mine, int miles)
{miles = mine.milesToAdd(miles);
 return miles;
}

/**
* Takes a car and adds given miles
* @param
*/
public static String isFuelTankEmptyTests(Car mine)
{
    String data = " ";
    if(mine.isFuelTankEmpty() == true)
    { data = "Your car is out of gas";
      
        
    }
    else
        { data = "Your car has enough gas";}
    return data; 
}
}