import javax.swing.JOptionPane;

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
  
  input: user will provide the event name, whether or not the event is for-profit or not for-profit, maximum number of cookies 
  allowed to sell, and number of cookies that have been sold for a single event.
  
  output: it provides final report containing the event name, if the event was for-profit or not for-profit, maximum number of cookies
  allowed to sell, and number of cookies actually sold, and number of sales made.
  
   
  */

public class cookiesale {

/*Main Method
   purpose: The main method will create an array of object, will call other methods in order and prints the final report
   input: String[] args
   output: void
*/


   public static void main(String [] args) {
    cookie acookie;
    
    do {
    try {
      acookie = getcookie();
      JOptionPane.showMessageDialog(null, acookie.toString());
    }   
    //Throws the exception if one of the inputs did not provide correctly and it can not run the program
    catch (IllegalArgumentException e) {
      JOptionPane.showMessageDialog(null, "Event can not be made. \n"
      + e.getMessage());
    }   
    
    //Ask for the another event to restart the Program
   }while(JOptionPane.showInputDialog("Enter Yes to create another event").equalsIgnoreCase("yes"));
   
   }
   
   /*getcookie Method
   purpose: The method will allow for the creation and population of a cookie sale object based on user input of a name, Maximum number, whether or not it is for-profit or not, and number of cookies sold
   input: Event name, Whether or not the event is for-profit or not for-profit, maximum number of cookies allowed for sale, and actual number of cookies sold for each sale.
   Returns Cookie_sale:cookie-object created and populated from user input
*/
   
   
   private static cookie getcookie() {
      //Getting the user input of Event name, Whether or not the event is for-profit or not for-profit, maximum number of cookies allowed for sale
      cookie acookie = new cookie(
      JOptionPane.showInputDialog("Enter name of the event "), 
      JOptionPane.showInputDialog("Enter whether the event is for profit(yes) or not for-profit(no) "),
      Double.parseDouble(JOptionPane.showInputDialog("IF you KNOW \n enter the maximum number of cookie allowed to sale"))
      );
      
      double cookiesale = 0;
      double cookiesold = 0;
      do {
         // Getting the user input, number of cookies sold for each sale.
         try {
          cookiesold = Double.parseDouble(JOptionPane.showInputDialog("Enter the each cookie sale for the " + acookie.getName() + ": \n Enter 00 to finish"));
           
         }
         // validation of numeric values, user must provide numeric values for the number of cookies sold for each sale.
         catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "You must enter number. Please try again");
         }   
         cookiesale += cookiesold;
      }while (cookiesold != 0);
       
        acookie.setNumCookie(cookiesale); 
         
      return acookie;
    }
   
   }

