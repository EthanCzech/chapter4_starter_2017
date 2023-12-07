/**
* Write a description of class Car here.
*
* @author (your name)
* @version (a version number or a date)
*/
public class Car
{
// instance variables
private int year, miles;
private String model;
private double fuelTankLevel;
/**
* Constructor for objects of class Car
* @param int year, String model, int miles, double fuelTankLevel
*/
public Car(int carYear, String carModel, int carMiles, double carFuelTankLevel)
{ year = 2000;
  model = "Honda Accord";
  miles = 100000;
  fuelTankLevel = 100;
  
    

}

public int milesToAdd(int milesAdded)
{miles += milesAdded;
 return miles;
}

public boolean isFuelTankEmpty(double carFuelTankLevel)
{if (carFuelTankLevel == 0)
    return true;
 else if (carFuelTankLevel > 0)
     return false;
 else 
     return false;
}

public int getYear()
{return year;
}
public int getMiles()
{return miles;
}
public String getModel()
{return model;
}
public double getfuelTankLevel()
{return fuelTankLevel;
}
}
