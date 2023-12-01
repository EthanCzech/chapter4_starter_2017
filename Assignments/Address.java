//********************************************************************
//  Address.java       Author: Lewis/Loftus/Cocking
//
//  Represents a street address.
//********************************************************************
public class Address
{
   private String streetAddress, city, state;
   private int zipCode;

   //-----------------------------------------------------------------
   //  Sets up this Address object with the specified data.
   //-----------------------------------------------------------------

   public Address(){}

   public Address (String street, String town, String st, int zip)
   {
      streetAddress = street;
      city = town;
      state = st;
      zipCode = zip;
   }





   //-----------------------------------------------------------------
   //  Returns this Address object as a string.
   //-----------------------------------------------------------------
   public String toString()
   {
      String result;

      result = streetAddress + "\n";
      result += city + ", " + state + "  " + zipCode;

      return result;
   }
   
   
   
   /**
    * 
    */
   public boolean equals(Address address)
   {
       
       String street = streetAddress.substring(streetAddress.indexOf(" "));
       String street2 = address.streetAddress.substring(address.streetAddress.indexOf(" "));
      
       boolean x = street.equals(street2);
       
       return x;
    
    
    }
   
   
}
