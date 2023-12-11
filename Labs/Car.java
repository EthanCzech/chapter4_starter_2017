import java.util.Random; 
/**
* Methods for the car object
*
* Ethan Czech
* 12/11
*/
public class Car
{
// instance variables
private int year, miles;
private String model;
private double fuelTankLevel;
Random gen = new Random();
/**
* Constructor for objects of class Car
* @param int year, String model, int miles, double fuelTankLevel
*/
public Car(int carYear, String carModel, int carMiles, double carFuelTankLevel)
{ year = carYear;
  model = carModel;
  miles = carMiles;
  fuelTankLevel = carFuelTankLevel;
  
    

}

/**
* Constructor for objects of class Car
* @param int year, String model, int miles, double fuelTankLevel
*/
public Car()
{ year = 2000;
  model = "Honda Accord";
  miles = 100000;
  fuelTankLevel = 100;
  
    

}


/**
* Takes a car and adds given miles
* @param int miles
* @return int miles
*/
public int milesToAdd(int milesAdded)
{miles += milesAdded;
 return miles;
}

/**
* Takes a car and sees if the fuel tank is empty
* @param 
* @return boolean 
*/
public boolean isFuelTankEmpty()
{if (fuelTankLevel == 0)
    return true;
 else if (fuelTankLevel > 0)
     return false;
 else 
     return false;
}

/**
* Takes a car and changes the value in the fuel tank based on miles inputted
* @param int miles
* @return double fuel tank level 
*/
public double milesToFuelLevel(int miles)
{fuelTankLevel = modifyFuelTankLevel(miles);
    return fuelTankLevel;
    
 
}

/**
* Takes a car and changes the value in the fuel tank based on miles driven
* @param int Carmiles
* @return double fuel tank level 
*/
public double modifyFuelTankLevel(int Carmiles)
{double number = (double)Carmiles/400;
 fuelTankLevel = fuelTankLevel - (fuelTankLevel * number);
 if (fuelTankLevel <= 0)
     {fuelTankLevel = 0;}
 return fuelTankLevel;
}

/**
* Drives the car and updates the fuel tank level and odometer
* @param int Carmiles
* @return string data 
*/
public String drive(int Carmiles)
{fuelTankLevel = modifyFuelTankLevel(Carmiles);
 int updatedMiles = milesToAdd(Carmiles);
 String data = " ";
 if (fuelTankLevel == 0)
     { data = "The "+year+" "+model +"'s fuel tank is empty";}
 else
     { data = "The "+year+" "+model+" drove "+ Carmiles + " miles, for a total mileage of "+updatedMiles+ " and a fuel level of " + fuelTankLevel + "%."; }
 return data;    
}

/**
* Overloading drive for a random amount of miles
* @param 
* @return string data 
*/
public String drive()
{int miles2 = gen.nextInt(11);
 int updatedMiles = milesToAdd(miles2);
 fuelTankLevel = milesToFuelLevel(miles2);
 String data = " ";
 if (fuelTankLevel == 0)
     { data = "The "+year+" "+model +"'s fuel tank is empty";}
 else
     { data = "The "+year+" "+model+" drove "+ miles2 + " miles, for a total mileage of "+updatedMiles+ " and a fuel level of " + fuelTankLevel + "%."; }
 return data;   
 
}

/**
* toString for the car object
* @param car mine
* @return string data 
*/
public String toString()
{
 String data = " ";
 data += year + " " + model + " "  + miles + " miles " + fuelTankLevel + " fuel tank level"; 
 return data;   
 
}




/**
* Overloading drive for a random amount of miles
* @param 
* @return string data 
*/
public int getYear()
{return year;
}
/**
* Gets miles
* @param 
* @return int miles
*/
public int getMiles()
{return miles;
}
/**
* Gets the miles
* @param 
* @return string model 
*/
public String getModel()
{return model;
}
/**
* Gets the fuel tank level 
* @param 
* @return double fuel tank level  
*/
public double getfuelTankLevel()
{return fuelTankLevel;
}
}
