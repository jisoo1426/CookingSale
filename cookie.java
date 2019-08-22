/*
   Name: Ji soo Park
   Date: 02/17/2019
   Course/Section: IT 206.004
   Assignment: Programming Assignment 2
   
   Description:
   Sophia's cookies, Inc, a small bakery dedicated to baking gourmet cookies. The purpose of 
   this program is to track the number of cookies ordered at a single event. It collects the user input
   of event name, whether or not the event is for-profit or not, maximum number of cookies allowed to sell, 
   and number of cookies that have been sold for a single event. It outputs the total number of cookie sale. 
   
   This is DDC no input or output required.
*/

public class cookie {
   
   private String name;
   private String forprofit;
   private double maxNum;
   private double numCookie;
   
   /*The constructor will collect the user input of the event name and whether or not the event is for-profit or not for-profit */
   public cookie(String name, String forprofit) {
      this(name, forprofit, 120);
    }
   /*The constructor will collect the user input of the event name and whether or not the event is for-profit or not for-profit, and maximum number of cookies allowed for sale */
   public cookie(String name, String forprofit, double maxNum) {
      if (name == null || name.equals("")) {
      throw new IllegalArgumentException("Name cannot be blank");
      }
      else {
      this.name =name;
      }
      
      if (forprofit.equalsIgnoreCase("yes") || forprofit.equalsIgnoreCase("no")) {
      this.forprofit = forprofit;
      }
      else {
         throw new IllegalArgumentException("User must enter Yes(for-profit) or no(not-for-profit)");
      }
      
      if (maxNum > 923 || maxNum <= 0) {
         throw new IllegalArgumentException("The maximum number needs to be greater than 0 and should not be more than 923");
      }
      else {
         this.maxNum =maxNum;
      }
   }
   
   
      //Accessors. No input. return name
   public String getName() {return this.name;}
     //Accessors. No input. return whether or not it is for-profit or not for-profit
   public String getforProfit() {return this.forprofit;}
      //Accessors. No input. return maximum number allowed to sale
   public double getMaxNum() {return this.maxNum;}
      //No input. return number of cookie sold
   public double getNumCookie() {return this.numCookie;}

   //Sets the name, user input must be provided otherwise it throws exception
   public void setName(String name) {
      if (name ==null || name.equals("")) {
      throw new IllegalArgumentException("Name cannot be blank");
      }
      else {
      this.name =name;
      }
   }
   
   //Sets the whether or not the event is for-profit or not for-profit, user input must be provided otherwise it throws exception
   public void setforProfit(String forprofit) {
      if (forprofit.equalsIgnoreCase("yes") || forprofit.equalsIgnoreCase("no")) {
      this.forprofit = forprofit;
      }
      else {
         throw new IllegalArgumentException("User must enter Yes(for-profit) or no(not-for-profit)");
      }
   }

   //Sets the maximum number of cookies allowed for sale, user input must be provided otherwise it throws exception
   public void setMaxNum(double maxNum) {
      if (maxNum > 923 || maxNum <= 0) {
         throw new IllegalArgumentException("The maximum number needs to be greater than 0 and should not be more than 923");
      }
      else {
         this.maxNum =maxNum;
      }
   }
   
   //Sets the number of cookie sold at a event, user input must be provided otherwise it throws exception

   public void setNumCookie(double numCookie) {
      if (numCookie < 0) {
         throw new IllegalArgumentException("The number of cookie sell can not be less than 0");
       }
       else {
         this.numCookie = numCookie;
       }
   
   }
   
   
    //calculate the total cookie sale based on the event is for-profit or not for-profit

   public double calculatecookiesale() {
      double cookiesale;
      if (getforProfit().equalsIgnoreCase("yes")) {
         cookiesale = this.getNumCookie();
      }
      else {
         cookiesale = this.getNumCookie() *2;
      }   
      return cookiesale;
   }

    //It summarize the information and provide String representation

   public String toString() {
      return "The event name: " + this.getName()
      + "\n This event was for-profit: " + this.getforProfit()
      + "\n The maximum number of cookie allowed to be sold: " + this.getMaxNum()
      + "\n The number of cookie actually sold:" + this.getNumCookie()
      + "\n The number of sales made: " + calculatecookiesale();
      
   }
   

}