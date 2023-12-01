
/**
 * Write a description of class testaddress here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class testaddress
{
    //-----------------------------------------------------------------
   //  Creates some Address and Student objects and prints them.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      Address school = new Address ("800 Lancaster Ave.", "Villanova",
                                    "PA", 19085);

      Address jHome = new Address ("21 Jump Street", "Lynchburg",
                                   "VA", 24551);
                                   
      System.out.print(school.equals(jHome));
                                }
}
