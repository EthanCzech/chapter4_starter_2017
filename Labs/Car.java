import java.util.Random; 
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

public boolean isFuelTankEmpty()
{if (fuelTankLevel == 0)
    return true;
 else if (fuelTankLevel > 0)
     return false;
 else 
     return false;
}

public double milesToFuelLevel(int miles)
{fuelTankLevel = modifyFuelTankLevel(miles);
    return fuelTankLevel;
    
 
}

public double modifyFuelTankLevel(int Carmiles)
{double number = (double)Carmiles/400;
 fuelTankLevel = fuelTankLevel - (fuelTankLevel * number);
 if (fuelTankLevel <= 0)
     {fuelTankLevel = 0;}
 return fuelTankLevel;
}

public String drive(int Carmiles)
{fuelTankLevel = modifyFuelTankLevel(Carmiles);
 String data = " ";
 if (fuelTankLevel == 0)
     { data = "The "+year+" "+model +"'s fuel tank is empty";}
 else
     { data = "The "+year+" "+model+" drove "+ Carmiles + "miles, for a total mileage of "+miles+ " and a fuel level of " + fuelTankLevel + "%."; }
 return data;    
}

public String drive()
{fuelTankLevel = milesToFuelLevel(miles);
 String data = " ";
 if (fuelTankLevel == 0)
     { data = "The "+year+" "+model +"'s fuel tank is empty";}
 else
     { data = "The "+year+" "+model+" drove "+ Carmiles + ", for a total mileage of "+miles+ " and a fuel level of " + fuelTankLevel + "%."; }
 return data;   
 
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
