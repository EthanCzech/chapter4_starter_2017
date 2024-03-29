//********************************************************************
//  Account.java       Author: Lewis/Loftus/Cocking
//
//  Represents a bank account with basic services such as deposit
//  and withdraw.
//********************************************************************

import java.text.NumberFormat;
import java.util.Scanner;

public class Account
{
   private NumberFormat fmt = NumberFormat.getCurrencyInstance();

   private final double RATE = 0.035;  // interest rate of 3.5%

   private int acctNumber;
   private double balance;
   private String name;

   /**
   * Sets up the account by defining its owner, account number,
   *  and initial balance.
   */
   public Account (String owner, int account, double initial)
   {
      name = owner;
      acctNumber = account;
      balance = initial;
   }


   /**
   * Sets up the account by defining its owner, account number,
   *  and initial balance. Overloaded version of the account constructor
   */
   public Account (String owner, int account)
   {
      name = owner;
      acctNumber = account;
      balance = 0;
   }


   /**
   *  Validates the transaction, then deposits the specified amount
   *  into the account. Returns the new balance.
   */
   public double deposit (double amount)
   {
      if (amount < 0)  // deposit value is negative
      {
         System.out.println ();
         System.out.println ("Error: Deposit amount is invalid.");
         System.out.println (acctNumber + "  " + fmt.format(amount));
      }
      else
         balance = balance + amount;
      return balance;
   }


   /**
   *  Takes money from one account and deposits in another
   *  
   */
   public void moneySwap (Account other)
   { Scanner keyboard = new Scanner(System.in);
     System.out.println("How much to you want to give to a different account");
     int moneyToSwap = keyboard.nextInt();
     if (moneyToSwap > 0)
     {
        balance -= moneyToSwap;
        other.balance += moneyToSwap;
     }
    else 
	System.out.println("You have to input a positive amount of money to swap");
   }

   /**
   *  Validates the transaction, then withdraws the specified amount
   *  from the account. Returns the new balance.
   */
   public double withdraw (double amount, double fee)
   {
      amount += fee;

      if (amount < 0)  // withdraw value is negative
      {
         System.out.println ();
         System.out.println ("Error: Withdraw amount is invalid.");
         System.out.println ("Account: " + acctNumber);
         System.out.println ("Requested: " + fmt.format(amount));
      }
      else
         if (amount > balance)  // withdraw value exceeds balance
         {
            System.out.println ();
            System.out.println ("Error: Insufficient funds.");
            System.out.println ("Account: " + acctNumber);
            System.out.println ("Requested: " + fmt.format(amount));
            System.out.println ("Available: " + fmt.format(balance));
         }
         else
            balance = balance - amount;

      return balance;
   }

   /**
   *  Asks the user for amount to transfer
   *  from one account to another.
   */
   public void transfer (/*object*/)
   {
	   System.out.print("Enter amount to transfer");
		double trans = 0; //aScannerObject.nextDouble();

   }

   /**
   *  Adds interest to the account and returns the new balance.
   */
   public double addInterest ()
   {
      balance += (balance * RATE);
      return balance;
   }

   /**
   *  Returns the current balance of the account.
   */
   public int getBalance();
	{return balance;}


   /**
   *  Returns the account number.
   */
   public int getAcctNumber();
	{return acctNumber;}

   /**
   *  Returns a one-line description of the account as a string.
   */
   public String toString ()
   {
      data = " " + acctNumber + " " + balance + " " + name;
      return data;
   }
}
